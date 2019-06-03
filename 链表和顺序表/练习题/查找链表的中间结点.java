    //找到单链表的中间节点
    public Node MidNode(){
        Node cur=this.head;
        int len=getLength()/2;
        for(int i=0;i<len;i++){
            cur=cur.next;
        }
        return  cur;
    }



