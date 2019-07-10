链接：https://www.nowcoder.com/questionTerminal/ed85a09f0df047119e94fb3e5569855a
来源：牛客网

有两个用链表表示的整数，每个结点包含一个数位。这些数位是反向存放的，也就是个位排在链表的首部。编写函数对这两个整数求和，并用链表形式返回结果。

给定两个链表ListNode* A，ListNode* B，请返回A+B的结果(ListNode*)。

测试样例：
{1,2,3},{3,2,1}
返回：{4,4,4}

import java.util.*;
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Plus {
    
    public ListNode plusAB(ListNode a, ListNode b) {
        
        //1.将链表转换成整数
        int aValue = listNodeConvertIntValue(a);
        int bValue = listNodeConvertIntValue(b);
       
        //2.计算求和
        int sumValue = aValue + bValue;
        
        //3.将整数转换成链表
        return intValueConvertListNode(sumValue);
    }
    
    public int listNodeConvertIntValue(ListNode node) {
        StringBuilder sb = new StringBuilder();
        ListNode cur = node;
        while(cur != null) {
            sb.append(cur.val);
            cur = cur.next;
        }
        return Integer.parseInt(sb.reverse().toString());
    }
    
    public ListNode intValueConvertListNode(int value) {
        char[] array = String.valueOf(value).toCharArray();
        //因为要反转，所以链表的头结点是数组的最后一个元素
        ListNode node = new ListNode(Integer.parseInt(String.valueOf(array[array.length-1])));
        ListNode cur = node;
        //整数反转存储到链表中
        for(int i = array.length - 2; i >= 0; i--) {
            ListNode newNode = new ListNode(Integer.parseInt(String.valueOf(array[i])));
            cur.next = newNode; 
            cur = newNode;
        }
        return node;
    }
}
