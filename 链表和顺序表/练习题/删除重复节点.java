//一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针


public class MySingleList {

    class Node {

        private int data;
        private Node next;

        private Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    public MySingleListImpl() {
        this.head = null;
    }

    public Node searchIndex(int index) {

        if (index < 0 || index > getLength()) {
            throw new UnsupportedOperationException();
        }

        int i = 0;
        Node cur = this.head;
        while (i < index-1) {
            cur = cur.next;
            i++;
        }
        return cur;
    }

    public boolean addIndex(int index, int data) {

        if (index == 0) {
            addFirst(data);
            return true;
        }
        if (index == getLength()) {
            addLast(data);
            return true;
        }
        Node node = new Node(data);
        Node pre = searchIndex(index);
        node.next = pre.next;
        pre.next = node;
        return true;
    }

    public void display() {

        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public void show(Node newHead) {

        Node cur = newHead;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    //在一个排序的链表中，删除该链表中重复的结点，
    //重复的结点不保留，返回链表头指针
    public Node deleteDuplication() {

        //虚拟节点
        Node node = new Node(-1);
        //让tmpHead移动，node作为头指针是要被返回的
        Node tmpHead = node;
        Node cur = this.head;
        while (cur != null) {
            if (cur.next != null && cur.data == cur.next.data) {
                while (cur.next != null && cur.data == cur.next.data) {
                    cur = cur.next;
                }
                cur = cur.next;
                //cur指向的这个节点和前面的不同
                tmpHead.next = cur;
            }else {
                //确定是不重复的节点，串起来就行
                tmpHead.next = cur;
                tmpHead = cur;
                cur = cur.next;
            }
        }
        return node.next;
    }
}

public class Test {

    public static void main(String[] args) {

		MySingleList list = new MySingleList();
		list.addIndex(0, 1);
        list.addIndex(1, 1);
        list.addIndex(2, 1);
        list.addIndex(3, 3);
        list.addIndex(4, 3);
        list.addIndex(5, 4);
        list.addIndex(6, 5);
        list.addIndex(7, 5);
        list.addIndex(8, 7);
        list.addIndex(9, 9);
        list.addIndex(10, 9);
     
        System.out.print("原链表：");
        list.display();
        
        System.out.print("删除重复元素后的链表为：");
        MySingleListImpl.Node cur = list.deleteDuplication();
        list.show(cur);
    }
}



