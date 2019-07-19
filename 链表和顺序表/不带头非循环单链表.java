package www.hhy.java_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Map;

class MysingleList implements  ILinked {
    class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public int getData() {
            return data;
        }
    }

    private Node head;

    public MysingleList() {
        this.head = null;
    }


    @Override
    public void addFirst(int data) {
        Node node = new Node(data);
        if (this.head != null) {
            node.next = this.head;
            this.head = node;
        }
        this.head = node;
    }

    @Override
    public void addLast(int data) {
        Node node = new Node(data);
        Node cur = this.head;
        if (cur != null) {
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        } else {
            this.head = node;
        }

    }

    @Override
    public boolean addIndex(int index, int data) {
        CheckIndex(index);
        Node node = new Node(data);
        if (index == 0) {
            addFirst(data);
            return true;
        }
        node.next = SearchIndex(index);
        SearchIndex(index - 1).next = node;
        return true;
    }

    @Override
    public boolean contains(int key) {
        Node cur = this.head;
        if (this.head == null) {
            return false;
        }
        while (cur != null) {
            if (cur.data != key) {
                cur = cur.next;
            }
            return true;
        }
        return false;
    }

    //跟据data值删除节点,并且返回该节点的值
    @Override
    public int remove(int key) {
        if (this.head == null) {
            throw new UnsupportedOperationException("链表为空");
        }
        int old_data = 0;
        if (this.head.data == key) {
            old_data = this.head.data;
            this.head = this.head.next;
            return old_data;
        }
        Node prev = SearchPrev(key);
        if (prev == null) {
            throw new UnsupportedOperationException("该节点的前驱不存在");
        }
        Node del = prev.next;
        old_data = del.data;
        prev.next = del.next;
        return old_data;

    }

    @Override
    public void removeAllKey(int key) {
        if (this.head == null) {
            throw new UnsupportedOperationException("该链表为空不支持删除");
        }
        if (this.head.data == key) {
            this.head = this.head.next;
        }
        Node prev = this.head;
        Node cur = this.head.next;
        while (cur != null) {
            if (cur.data == key) {
                prev.next = cur.next;
                cur = prev.next;
            } else {
                prev = cur;
                cur = cur.next;
            }
        }
    }

    @Override
    public int getLength() {
        if (this.head == null) {
            return 0;
        }
        Node cur = this.head;
        int count = 0;


        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }


    @Override
    public void display() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();

    }

    public void display1(Node node1) {
        Node cur = node1;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();

    }
    @Override
    public void clear() {
        while (this.head.next != null) {
            Node del = this.head.next;
            this.head.next = del.next;
        }
        this.head = null;
    }

    private void CheckIndex(int index) {
        if (index < 0 || index > getLength()) {
            throw new UnsupportedOperationException("index位置不合法");
        }
    }

    //跟据data值查找某个节点的前驱
    public Node SearchPrev(int key) {
        Node cur = this.head;
        while (cur.next != null) {
            if (cur.next.data == key) {
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }

    //跟据index查找某个节点
    public Node SearchIndex(int index) {
        CheckIndex(index);
        int count = 0;
        Node cur = this.head;
        while (count < index) {
            count++;
            cur = cur.next;
        }
        return cur;
    }

    //链表的逆置
    public Node reverseList() {
        Node ReverseNode = null;
        Node cur = this.head;
        Node prev = null;
        while (cur != null){
            Node curnext = cur.next;
            if (curnext == null){
                ReverseNode = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curnext;
        }
        return ReverseNode;


    }

//逆置打印链表
    public void show(Node ReverseNode) {
        Node cur = ReverseNode;
        while (cur != null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();

    }

    //正序造环
    public void createLoop(){
        Node cur = this.head;
      while (cur.next!=null){

            cur = cur.next;
      }
     Node Third = this.head.next.next;
     cur.next = Third;
        System.out.println(cur.next.data);
    }

//判断是否有环，快慢指针,如果有环，快指针一定能追上慢指针
    public boolean isLoop(){
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    //查找链表的倒数第k个节点
    public Node findKthToTail(int k){
        if (0 <= (getLength()-k) &&(getLength()-k)<=getLength()){
            return   SearchIndex(getLength()-k);
        }
        //throw异常同样可以用来结束程序
        throw new UnsupportedOperationException("非法越界");

    }

    //查找链表的中间节点
    public Node findMidNode(){
        Node cur = this.head;
        int len = getLength()/2;
        for (int i = 0;i < len;i++){
            cur = cur.next;
        }
        return cur;
    }

    //查找链表的环入口点
    public Node detectCycle(){
        Node fast = this.head;
        Node slow = this.head;
        while (fast.next != null && slow.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                break;
            }
        }
        if (fast.next == null || slow.next == null){
            return null;
        }
        slow = this.head;
        while (slow != fast){
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }

    //链表的分割，跟据给定的值将链表分割为两部分，前半部分小于基准值，后半部分大于基准值
    public Node partition( int x) {
        // write code here   public ListNode partition( int x) {
        // write code here
        Node pHead = this.head;
        Node BeforeStart = null;
        Node BeforeEnd = null;
        Node AfterStart = null;
        Node AfterEnd = null;

        while(pHead!=null){
            Node pheadnext=pHead.next;
            pHead.next=null;
            if(pHead.data < x){
                if(BeforeStart==null){
                    BeforeStart=pHead;
                    BeforeEnd=BeforeStart;
                }
                else{
                    BeforeEnd.next=pHead;
                    BeforeEnd=BeforeEnd.next;
                }
            }

            else{
                if(AfterStart==null){
                    AfterStart=pHead;
                    AfterEnd=AfterStart;
                }
                else{
                    AfterEnd.next=pHead;
                    AfterEnd=AfterEnd.next;

                }
            }

            pHead=pheadnext;

        }

        if(BeforeStart==null){

            return  AfterStart;

        }

        else{
            BeforeEnd.next=AfterStart;
            return BeforeStart;
        }

    }

    //链表的回文
        public boolean chkPalindrome(Node A) {
            // write code here    public boolean chkPalindrome() {
            Node fast =  A;
            Node slow =  A;
            while(fast != null && fast.next != null){
                fast = fast.next.next;
                slow = slow.next;
            }
            //slow指向的位置就是中间节点
            Node p = slow.next;
            Node pNext = p.next;
            while(p != null) {
                p.next = slow;
                slow = p;
                p = pNext;
                if(p != null) {
                    pNext = p.next;
                }
            }
            //后半部分已经进行反转
            while(A != slow) {
                if(A.data != slow.data){
                    return false;
                }

                if(A.next == slow) {
                    return true;
                }

                A = A.next;
                slow = slow.next;
            }
            return true;

        }

}

public class TestDemo{
    public static void main(String[] args) throws InterruptedException {
        MysingleList mysingleList = new MysingleList();
        mysingleList.addLast(2);
        mysingleList.addFirst(6);
        mysingleList.addLast(3);
        mysingleList.addFirst(4);
        mysingleList.addLast(5);

        Arrays.asList()

        mysingleList.display();
        System.out.println("------------");
        mysingleList.addIndex(3,11);
        mysingleList.addIndex(4,99);
        mysingleList.addIndex(0,30);
        mysingleList.display();

        System.out.println();
        System.out.println(mysingleList.SearchPrev(2).getData());
        System.out.println("------------");
//        mysingleList.clear();
//        Thread.sleep(1000);

      //mysingleList.show(mysingleList.reverseList());

        System.out.println("*********");
        //mysingleList.createLoop();
       // System.out.println(mysingleList.isLoop());
        System.out.println("*********");
       System.out.println(mysingleList.findKthToTail(1).getData());
        System.out.println("中间结点:"+mysingleList.findMidNode().getData());

     //   System.out.println(mysingleList.detectCycle().getData());
        System.out.print("按照10分割: ");

        mysingleList.display1( mysingleList.partition(10));
        System.out.println(mysingleList.chkPalindrome(mysingleList.partition(10)));




    }



}


interface ILinked {
    //头插法
    void addFirst(int data);
    //尾插法
    void addLast(int data);
    //任意位置插入,第一个数据节点为0号下标
    boolean addIndex(int index,int data);
    //查找是否包含关键字key是否在单链表当中
    boolean contains(int key);
    //删除第一次出现关键字为key的节点3.3 链表面试题
    int remove(int key);
    //删除所有值为key的节点
    void removeAllKey(int key);
    //得到单链表的长度
    int getLength();
    void display();
    void clear();

}
