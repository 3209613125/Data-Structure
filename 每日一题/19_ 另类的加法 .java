请编写一个函数，将两个数字相加。不得使用+或其他算数运算符。

给定两个int A和B。请返回A＋B的值

测试样例：
1,2
返回：3

【题目解析】
实现两个数的相加求和，实现过程中不能用+运算符号
【解题思路】
二进制加法特点。
位的异或运算跟求'和'的结果一致：
异 或 1^1=0 1^0=1 0^0=0
求 和 1+1=0 1+0=1 0+0=0
位的与运算跟求'进位‘的结果一致：
位 与 1&1=1 1&0=0 0&0=0
进 位 1+1=1 1+0=0 0+0=0

import java.util.*;
public class UnusualAdd
{ public int addAB(int A, int B)
{
if(B==0)
return A;
int sum = A ^ B; //相加但不进位
int jin = (A & B) << 1; //进位但不相加
return addAB(sum, jin);
}
}
