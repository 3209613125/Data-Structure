请设计一个算法完成两个超长正整数的加法。

 接口说明

/*
 请设计一个算法完成两个超长正整数的加法。
 输入参数：
 String addend：加数
 String augend：被加数
 返回值：加法结果
 */

 public String AddLongInteger(String addend, String augend)
 {
     /*在这里实现功能*/
  

  return null;     
 }

输入描述:
输入两个字符串数字



输出描述:
输出相加后的结果，string型

示例1
输入
99999999999999999999999999999999999999999999999999
1
输出
100000000000000000000000000000000000000000000000000


import java.util.*;
import java.math.BigInteger;
public class Main{
public static void main(String[]
args){ Scanner input=new
Scanner(System.in);
while(input.hasNext()){
String s1=input.next();
String s2=input.next();
BigInteger num1=new BigInteger(s1);//采用BigInteger可以直接进行大整数进行计算
BigInteger num2=new BigInteger(s2);
System.out.println(num1.add(num2));
}
}
}
