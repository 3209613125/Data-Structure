 public boolean hasCycle() {
        Node fast = this.head;
        Node slow = this.head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                //return true;
                break;
            }
        }
        if(fast != null && fast.next != null) {
            return true;
        }
        return false;
    }
