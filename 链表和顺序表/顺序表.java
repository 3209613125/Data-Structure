package www.bit;

import java.util.Arrays;

class Test3 {
//    static class Person{
//        public Person() {
//        }
//    }
    public static void main(String[] args) throws InterruptedException {
        MySequenceImpl mySequence = new MySequenceImpl();

       for (int i = 0; i < 20; i++) {
            mySequence.add(i,i);
        }
        mySequence.add(19,"gao");
//        mySequence.add(0,new Person());
//        mySequence.add(1,new Person());
//        mySequence.add(2,new Person());
        mySequence.display();

        mySequence.clear();
        Thread.sleep(1000);


        //mySequence.display();
        //Object res = mySequence.remove(8);
        //System.out.println(res);
        //JAVA 里面如何测试内存泄漏
        //mySequence.display();

    }
}
interface ISequence {
    //在pos位置插入val
    boolean add(int pos,Object data);
    //查找关键字key 找到返回key的下标，没有返回-1;
    int search(Object key);
    //查找是否包含关键字key是否在顺序表当中(这个和search有点冲突)
    boolean contains(Object key);
    //得到pos位置的值
    Object getPos(int pos);
    //删除第一次出现的关键字key
    Object remove(Object key);
    //得到顺序表的长度
    int size();
    //打印顺序表
    void display();
    //清空顺序表以防内存泄漏
    void clear();
}


class MySequenceImpl implements ISequence {

    private Object[] elem;
    private int usedSize;//有效数据个数
    private static final int DEFAULT_SIZE = 10;

    public MySequenceImpl() {
        this.elem = new Object[DEFAULT_SIZE];
        this.usedSize = 0;
    }

    private boolean isFull() {
        /*if(this.usedSize == this.elem.length) {
            return true;
        }
        return false;*/
        return this.usedSize == this.elem.length;
    }

    @Override
    public boolean add(int pos, Object data) {
        //1、pos位置的合法性进行判断
        if(pos < 0 || pos > this.usedSize) {
            return false;
        }
        //2、判断是否为满。
        if(isFull()){
            //2倍扩容
            //System.arraycopy();
            this.elem = Arrays.copyOf(this.elem,
                    2*this.elem.length);
        }
        for (int i = this.usedSize-1; i >= pos; i--) {
            this.elem[i+1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedSize++;
        return true;
    }

    private boolean isEmpty() {
        return this.usedSize == 0;
    }
    @Override
    public int search(Object key) {
        if(isEmpty()){
            return -1;
        }
        for (int i = 0; i < this.usedSize; i++) {
            if(this.elem[i].equals(key)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(Object key) {
        if(isEmpty()){
            return false;
        }
        for (int i = 0; i < this.usedSize; i++) {
            if(this.elem[i].equals(key)){
                return true;
            }
        }
        return false;
    }

    @Override
    public Object getPos(int pos) {
        if(pos < 0 || pos >= this.usedSize){
            return null;
        }
        return this.elem[pos];
    }

    @Override
    public Object remove(Object key) {
        int index = search(key);
        if(index == -1) {
            return null;
        }
        Object data = this.elem[index];
        int i;
        for ( i = index; i < this.usedSize-1; i++) {
            this.elem[i] = this.elem[i+1];
        }
        this.usedSize--;
        this.elem[i+1] = null;
        return data;
    }

    @Override
    public int size() {
        return this.usedSize;
    }

    @Override
    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }

    @Override
    public void clear() {
        for (int i = 0; i < this.usedSize; i++) {
            this.elem[i] = null;
        }
    }
}
