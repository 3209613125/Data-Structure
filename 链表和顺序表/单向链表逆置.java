    public Node reverseList()  {
         Node reverseHead = null;//反转后新的头结点
         Node cur = this.head;//cur代表当前需要反转的节点
         Node prev = null;//cur的前驱--》前驱信息
         while(cur != null) {
             Node curNext = cur.next;
             if(curNext == null) {
                 reverseHead = cur;
             }
             cur.next = prev;
             prev = cur;
             cur = curNext;
         }
         return reverseHead;
     }

//遍历打印

    public void show(Node newHead) {
         Node cur = newHead;
         while(cur != null) {
             System.out.print(cur.data+" ");
             cur = cur.next;
         }
         System.out.println();
     }
