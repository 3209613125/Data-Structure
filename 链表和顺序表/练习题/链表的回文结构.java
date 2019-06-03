 public boolean chkPalindrome() {
        Node fast = this.head;
        Node slow = this.head;
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
        while(this.head != slow) {
            if(this.head.data != slow.data){
                return false;
            }

            if(this.head.next == slow) {
                return true;
            }

            head = head.next;
            slow = slow.next;
        }
        return true;
    }
