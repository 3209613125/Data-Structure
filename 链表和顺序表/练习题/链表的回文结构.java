对于一个链表，请设计一个时间复杂度为O(n),额外空间复杂度为O(1)的算法，判断其是否为回文结构。

给定一个链表的头指针A，请返回一个bool值，代表其是否为回文结构。保证链表长度小于等于900。

测试样例：
1->2->2->1
返回：true


import java.util.*;

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class PalindromeList {
    public boolean chkPalindrome(ListNode A) {
        // write code here    public boolean chkPalindrome() {
        ListNode fast =  A;
        ListNode slow =  A;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        //slow指向的位置就是中间节点
        ListNode p = slow.next;
        ListNode pNext = p.next;
        while(p != null) {
            p.next = slow;
            slow = p;
            p = pNext;
            if(p != null) {
                pNext = p.next;
            }
        }
        //后半部分已经进行反转
        while(A != slow) {
            if(A.val != slow.val){
                return false;
            }

            if(A.next == slow) {
                return true;
            }

            A = A.next;
            slow = slow.next;
        }
        return true;

    }
}
