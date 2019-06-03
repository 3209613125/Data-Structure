//判断是否有环 
    public boolean hascycle(){
        Node fast = this.head;
        Node slow = this.head;
        while (fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast==slow){
                return true;
        }

    }

        return false;
}


//造环
    public void createLoop() {
        Node cur = this.head;
        while(cur.next != null) {
            cur = cur.next;
        }
        cur.next = this.head.next.next;
    }
