 //编写代码，以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前

    public Node partition(int x){
        Node BeforeStart = null;
        Node BeforeEnd = null;
        Node AfterStart = null;
        Node AfterEnd = null;
        Node phead = this.head;

        while(phead!=null){
            Node pheadnext=phead.next;
            phead.next=null;
            if(phead.val < x){
                if(BeforeStart==null){
                    BeforeStart=phead;
                    BeforeEnd=BeforeStart;
                }
                else{
                    BeforeEnd.next=phead;
                    BeforeEnd=BeforeEnd.next;
                }
                }

                else{
                if(AfterStart==null){
                    AfterStart=phead;
                    AfterEnd=AfterStart;
                }
                else{
                    AfterEnd.next=phead;
                    AfterEnd=AfterEnd.next;

                }
            }

            phead=pheadnext;

            }

            if(BeforeStart==null){

            return  AfterStart;

            }

            else{
            BeforeEnd.next=AfterStart;
            return BeforeStart;
            }

        }
