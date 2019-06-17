验证尼科彻斯定理，即：任何一个整数m的立方都可以写成m个连续奇数之和。

例如：

1^3=1 

2^3=3+5 

3^3=7+9+11 

4^3=13+15+17+19 

 

接口说明

原型：


 /*
 功能: 验证尼科彻斯定理，即：任何一个整数m的立方都可以写成m个连续奇数之和。
 原型：
     int GetSequeOddNum(int m,char * pcSequeOddNum);
 输入参数：
     int m：整数(取值范围：1～100)
    
 返回值：
     m个连续奇数(格式：“7+9+11”);
 */

 public String GetSequeOddNum(int m)
 {
     /*在这里实现功能*/

     return null;
 }

 

 


输入描述:
输入一个int整数



输出描述:
输出分解后的string

示例1
输入
6
输出
31+33+35+37+39+41



该题目本身不难，考察数学功底。
1^3=1
2^3=3+5
3^3=7+9+11
4^3=13+15+17+19
观察规律，总结归纳，连续奇数求和就是等差数列求和，难点立即转换为等差数列的首项，得出首项 a = m*(m-1)+1



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
public static void main(String[] args) throws IOException{
BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
String s;
while((s=bf.readLine())!=null){
long m = Integer.valueOf(s);
long a = m*m-m+1;//计算首项
System.out.print(a);
for(int i=1; i<m; i++){//继续等差数列求和
System.out.print("+"+(a+=2));
}
System.out.println();
}
bf.close();
}
}
