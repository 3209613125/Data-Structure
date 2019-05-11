    interface ILinked {
    // 1、无头单向非循环链表实现
    // 头插法
     void addFirst(int data);
    // 尾插法
     void addLast(int data);
    // 任意位置插入,第一个数据节点为0号下标
     boolean addIndex(int index,int data);
    // 查找是否包含关键字key是否在单链表当中
    boolean contains(int key);
    // 删除第一次出现关键字为key的节点
    int remove(int key);
    //删除所有值为key的节点
     void removeAllKey(int key);
    // 得到单链表的长度
    int getLength();
     void display();
    void clear();

}

class xxx  implements ILinked{
    class Node{
        private int data;
        private Node next;
        public Node(int data) {
            this.data = data;

        }
    }

    public xxx(Node head) {
        this.head = head;
    }

    private Node head;
    @Override
//头插法
        public void addFirst(int data) {
         Node node = new Node(data);
    //如果是第一次插入
        if(this.head == null){
            this.head = node;
        }else{
     //非第一次插入
            node.next = this.head;
            this.head = node;
        }
    }
//尾插
    @Override
    public void addLast(int data) {
    Node node = new Node(data);
    Node cur = this.head;
    //第一次插入
        if(this.head == null){
            this.head = node;
        }else{
    //非第一次插入,找尾巴
          while(cur.next != null/*this.head.next != null*/){
              cur = cur.next;
            //this.head = this.head.next;
          }
          //退出循环即代表尾巴找到了，cur所指向的位置就是尾节点
            cur.next = node;
          //this.head.next = node;
        }
    }

//    private Node searchIndex(){
//
//    }
//    private Node checkIndex(int index){
//        Node cur;
//        if(index < 0 || index > getLength()) {
//
//        }
//        return cur;
//    }

//指定位置插入
    @Override
    public boolean addIndex(int index, int data) {
        Node node = new Node(data);
        Node Located = this.head;
        Node Locate = this.head;
        //index为头时
        if(index == 0){
            addFirst(data);
            return true;
        //index为尾时
    } else if(index == getLength() - 1){
            addLast(data);
            return true;
        //index非法时
    } else if(index < 0 || index > getLength()){
            return false;
        //插入一般情况下的index
    } else{
            int location = 1;
            Located = Located.next;
            while(index != location){
                Located = Located.next;
                Locate = Locate.next;
                location++;
            }
            node.next = Located;
            Locate.next = node;
            return true;
        }
       // return false;
    }
//是否包含指定元素
    @Override
    public boolean contains(int key) {
        Node cur = this.head;
        while (cur != null) {
            if (key == cur.data) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
//        for(int i = 0;i<getLength();i++){
//            if (this.head.data != key) {
//                this.head = this.head.next;
//            } else {
//                return true;
//            }
//        }
//        return false;

//删除指定位置
    @Override
    public int remove(int key) {
        Node cur = this.head;
        Node Located = this.head;
        Node Locate = this.head;
        //key非法时
        if(key < 0||key > getLength()){
            return -1;
        }
        else if(key == 0){
           this.head = this.head.next;
           return 0;
        }
        else if(key == getLength()-1){
            for(int i =0;i<getLength()-2;i++){
                cur = cur.next;
            }
            cur.next = null;
            return 0;
        }
        else{
            int location = 1;
            Located = Located.next;
            Located = Located.next;
            while(key != location) {
                Located = Located.next;
                Locate = Locate.next;
                location++;
            }
            Locate.next = Located;
        }
        /**删除指定内容
         * while(cur.next != null){
         *
         * }
         *
         */
        return 0;
    }
//删除指定的所有内容
    @Override
    public void removeAllKey(int key) {
       Node prev = this.head;
       Node cur = this.head.next;
       while(cur != null){
           if(cur.data == key){
               prev.next = cur.next;
               cur = cur.next;
           } else{
               prev = cur;
               cur = cur.next;
           }
       }
    }
//获取列表的长度
    @Override
    public int getLength() {
        Node cur = this.head;
        int length = 0;
        while(cur != null){
            cur = cur.next;
            length++;
        }
        //System.out.println(length);
        return length;
    }

    @Override
    public void display() {
        Node cur = this.head;
        while (cur!= null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    @Override
    public void clear() {
    while(this.head.next != null){
        Node del = this.head.next;
        this.head.next = del.next;
    }
    this.head = null;
    }
}

public class Test {
    public static void main(String[] args) {
        xxx XXX = new xxx(null);

        XXX.addFirst(10);
        XXX.addFirst(20);
        XXX.addFirst(30);
        XXX.addFirst(40);
        XXX.addFirst(50);
        //XXX.display();
        XXX.addLast(60);
        XXX.display();
        XXX.addIndex(1,15);
        XXX.display();
        XXX.remove(1);
        XXX.display();
        System.out.println(XXX.getLength());
        System.out.println(XXX.contains(60));
    }
}
