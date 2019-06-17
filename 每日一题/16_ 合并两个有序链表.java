public class MergeList {
 
    public class ListNode{
        int val;
        ListNode next;
 
        ListNode(int x){
            val = x;
        }
    }
    private static ListNode Merge(ListNode listA,ListNode listB){
        if(listA == null){
            return listB;
        }
        if(listB == null){
            return listA;
        }
 
        /**
         * 原来两个链表都是有序的,合并完后须整体有序
         * 同时遍历两个链表的各自结点,进行值的比较,哪个值小放入到新链表中
         * 放置的方式是尾插
         * 当一个链表中的全部点取走之后,直接将剩余链表的结点接到结果链表后就好了
         */
 
        ListNode result = null;  //记录结果链表的第一个结点代表整个链表,可能是null
        ListNode last = null;    //记录结果链表的最后一个结点
        ListNode nA = listA;
        ListNode nB = listB;
        //两个链表中仍然都有结点
        while(nA != null && nB != null){
            if(nA.val <= nB.val){
                if(result == null){
                    result = nA;
                }else{
                    last.next = nA;
                }
                //last发生变化
                last = nA;
                nA = nA.next;
            }else{
                if(result == null){
                    result = nB;
                }else{
                    last.next = nB;
                }
                //last发生变化
                last = nB;
                nB = nB.next;
            }
        }
        //有一个链表的结点都取完了
        if(nA != null){
            //nA 后边的结点还没有处理
            last.next = nA;
        }else{
            //nB后面的结点还没有处理
            last.next = nB;
        }
        return result;
    }
}
