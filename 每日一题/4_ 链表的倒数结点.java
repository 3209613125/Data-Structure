 //输入一个链表，输出该链表中倒数第k个结点
    public Node findKthToTail(int k){
        if(k<=0||this.head==null){
           return null;
        }
        Node fast=this.head;
        Node slow=this.head;
        int count=0;
        while (count<k-1){
            if(fast.next!=null){
                fast=fast.next;
                k--;
            }
            else{
                System.out.println("没有这个节点");
                return null;
            }
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
