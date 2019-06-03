class TestDemo1 {

    public static void main(String[] args) {
        MySingleListImpl mySingleList = new MySingleListImpl();
        mySingleList.addFirst(10);
        mySingleList.addFirst(20);
        mySingleList.addFirst(30);
        mySingleList.addFirst(40);
        mySingleList.addIndex(3,40);
        mySingleList.addIndex(1,80);
        mySingleList.display();
       mySingleList.removeAllKey(40);
        mySingleList.display();

//        mySingleList.addLast(10);
//        mySingleList.addLast(20);
//        mySingleList.addLast(30);
//        mySingleList.addLast(40);

    }

}


  class MySingleListImpl implements ILinked{

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
     }//节点类

     private Node head;
      //构造方法(无参)
     public MySingleListImpl() {
         this.head = null;
     }

     @Override
     public void addFirst(int data) {
         Node node = new Node(data);
         if(this.head != null){
             node.next = this.head;
             this.head = node;
         } else {
             this.head=node;
         }
     }


     @Override
     public void addLast(int data) {
         Node node = new Node(data);
         Node cur = this.head;
         //如果是第一次插入的时候
         if(cur == null) {
             this.head = node;
         }else {
             while (cur.next != null) {
                 cur = cur.next;
             }
             cur.next = node;
         }

     }


     /**
      * 找到index-1的位置的节点
      * @param index
      * @return
      */
     public Node searchIndex(int index) {
         checkIndex(index);
        /*int count = index-1;
        Node cur = this.head;
        while(count != 0) {
            cur = cur.next;
            count--;
        }*/
         int count = 0;
         Node cur = this.head;
         while(count < index) {
             cur = cur.next;
             count++;
         }
         return cur;
     }

     private void checkIndex(int index) {
         if(index < 0 || index > getLength()){
             throw new UnsupportedOperationException("index位置不合法");
         }
     }


     @Override
     public boolean addIndex(int index, int data) {
         //头部插入
         if(index == 0){
             addFirst(data);
             return true;
         }
         Node node = new Node(data);
         Node cur = searchIndex(index-1);
         node.next = cur.next;
         cur.next = node;
         return true;
     }


     @Override
     public boolean contains(int key) {
         Node cur = this.head;
         while(cur != null) {
             if(cur.data == key){
                 return true;
             }
             cur = cur.next;
         }
         return false;
     }

     public Node searchPrev(int key) {
         Node cur = this.head;
         while (cur.next != null) {
             if(cur.next.data == key){
                 return cur;
             }
             cur = cur.next;
         }
         return null;
     }

     @Override
      //删除给定data的对应节点，若有多个，只删除第一个
     public int remove(int key) {
         if(this.head == null) {
             throw new UnsupportedOperationException("单链表为空");
         }
         int oldData = 0;
         //删除的节点是头结点
         if(this.head.data == key){
             oldData = this.head.data;
             this.head = this.head.next;
             return oldData;
         }
         Node prev = searchPrev(key);
         if(prev == null) {
             //return
             throw new UnsupportedOperationException("没有前驱");
         }
         Node del = prev.next;
         oldData = del.data;
         prev.next = del.next;
         //del = null;
         return oldData;
     }

     @Override
     public void removeAllKey(int key) {
         if(this.head == null) {
             throw new UnsupportedOperationException("单链表为空，不支持删除");
         }

         if(this.head.data == key){
             this.head = this.head.next;
         }

         Node prev = this.head;
         Node cur = this.head.next;
         while (cur != null) {
             if(cur.data == key){
                 prev.next = cur.next;
                 cur = prev.next;
             }else {
                 prev = cur;
                 cur = cur.next;
             }
         }

     }

     @Override
     public int getLength() {
         if(this.head == null) {
             return 0;
         }
         int count = 0;
         Node cur = this.head;
         while (cur != null){
             count++;
             cur = cur.next;
         }
         return count;
     }

     @Override
     public void display() {
         Node cur = this.head;
         while(cur != null) {
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
