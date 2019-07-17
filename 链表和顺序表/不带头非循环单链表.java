package www.hhy.java_7;
class MysingleList implements  ILinked{
    class Node{
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
        if(this.head!=null){
            node.next = this.head;
            this.head = node;
        }
        this.head = node;
    }

    @Override
    public void addLast(int data) {
        Node node = new Node(data);
        Node cur = this.head;
        if(cur !=null){
            while (cur.next!=null){
                cur = cur.next;
            }
            cur.next = node;
        }

            else{
            this.head = node;
        }

    }

    @Override
    public boolean addIndex(int index, int data) {
        CheckIndex(index);
        Node node = new Node(data);
            if (index == 0){
                addFirst(data);
                return true;
            }
            node.next = SearchIndex(index);
            SearchIndex(index-1).next = node;
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
        if(this.head == null){
            throw new UnsupportedOperationException("链表为空");
        }
        int old_data = 0;
        if (this.head.data == key){
            old_data = this.head.data;
            this.head = this.head.next;
            return old_data;
        }
        Node prev = SearchPrev(key);
        if (prev == null){
            throw new UnsupportedOperationException("该节点的前驱不存在");
        }
        Node del = prev.next;
        old_data = del.data;
        prev.next = del.next;
        return old_data;

    }

    @Override
    public void removeAllKey(int key) {
        if(this.head == null){
            throw new UnsupportedOperationException("该链表为空不支持删除");
        }
        if(this.head.data == key){
            this.head  = this.head.next;
        }
        Node prev = this.head;
        Node cur = this.head.next;
        while (cur != null){
            if(cur.data == key){
                prev.next = cur.next;
                cur = prev.next;
            }
            else{
                prev = cur;
                cur = cur.next;
            }
        }
    }

    @Override
    public int getLength() {
        if(this.head == null){
            return 0;
        }
        Node cur = this.head;
        int count = 0;


            while (cur != null){
                count++;
                cur = cur.next;
            }
            return count;
        }


    @Override
    public void display() {
        Node cur = this.head;
        while (cur != null){
            System.out.print(cur.data+" ");
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

    private void CheckIndex(int index){
        if(index < 0 || index > getLength()){
            throw  new UnsupportedOperationException("index位置不合法");
        }
    }
//跟据data值查找某个节点的前驱
    public Node SearchPrev(int key){
        Node cur = this.head;
        while (cur.next != null){
            if(cur.next.data == key){
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }

    //跟据index查找某个节点
    public Node SearchIndex(int index){
        CheckIndex(index);
        int count = 0;
        Node cur = this.head;
        while (count < index){
            count++;
            cur = cur.next;
        }
        return cur;
    }

}

public class TestDemo{
    public static void main(String[] args) {
        MysingleList mysingleList = new MysingleList();
        mysingleList.addLast(2);
        mysingleList.addFirst(6);
        mysingleList.addLast(3);
        mysingleList.addFirst(4);
        mysingleList.addLast(5);


        mysingleList.display();
        System.out.println("------------");
        mysingleList.addIndex(3,11);
        mysingleList.addIndex(4,99);
        mysingleList.addIndex(0,68);
        mysingleList.display();

        System.out.println();
        System.out.println(mysingleList.SearchPrev(5).getData());

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
