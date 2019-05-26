public class MyStackImpl implements IMyStack {

    private int[] elem;//存放数据元素的数组
    public int top;//当前可以存放数据元素的下标
    public int usedSize;

    public MyStackImpl(int size) {
        this.elem = new int[size];
        this.top = 0;
        this.usedSize = 0;
    }

    private boolean isFull() {
        return this.top == this.elem.length;
    }
    @Override
    public void push(int item) {
        if(isFull()){
            throw new UnsupportedOperationException("栈为满");
        }
        this.elem[this.top] = item;
        this.usedSize++;
        this.top++;
    }



    /**
    * @Author: HeHaoYuan
    * @Date: 2019/5/26
    * @Description:弹出栈顶元素并返回该元素值


    */
    @Override
    public int pop() {
        if(empty()){
            throw new UnsupportedOperationException("栈空");
        }
        this.top--;
        this.usedSize--;
        return this.elem[this.top];
    }


    /**
    * @Author: HeHaoYuan
    * @Date: 2019/5/26
    * @Description:返回栈顶元素


    */
    @Override
    public int peek() {
        if(empty()){
            throw new UnsupportedOperationException("栈空");
        }
        return this.elem[this.top-1];
    }

    @Override
    public boolean empty() {
        return this.usedSize == 0;
    }

    @Override
    public int size() {
        return this.usedSize;
    }
}


class Test{
    public static void main(String[] args) {
        MyStackImpl myStack=new MyStackImpl(10);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        System.out.println(myStack.size());
        System.out.println(myStack.top);
        System.out.println(myStack.peek());




    }
}


public interface IMyStack {
    // 将 item 压入栈中
    void push(int item);
    // 返回栈顶元素，并且出栈
    int pop();
    // 返回栈顶元素，但不出栈
    int peek();
    // 判断这个栈是否为空栈
    boolean empty();
    // 返回元素个数
    int size();
}
