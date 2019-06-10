给定数字0-9各若干个。你可以以任意顺序排列这些数字，但必须全部使用。目标是使得最后得到的数尽可能小（注意0不能做首位）。例如：

给定两个0，两个1，三个5，一个8，我们得到的最小的数就是10015558。



现给定数字，请编写程序输出能够组成的最小的数。

输入描述:
每个输入包含1个测试用例。每个测试用例在一行中给出10个非负整数，顺序表示我们拥有数字0、数字1、……数字9的个数。整数间用一个空
格分隔。10个数字的总个数不超过50，且至少拥有1个非0的数字。


输出描述:
在一行中输出能够组成的最小的数。
示例1
输入
2 2 0 0 0 3 0 0 1 0
输出
10015558

import java.util.*;
public class Main{
public static void main(String
[]args){ Scanner in=new
Scanner(System.in); int num[]=new
int[10];
//0 - 9
//输入 0 - 9 这10个数字的出现的个数
for(int
i=0;i<10;i++){ num[i]=in.nextInt
();
}
//先输出安装1-9的顺序第一个出现的数字1次
for(int i=1;i<10;i++){
if(num[i]!=0){ System.ou
t.print(i); num[i]--;
break;
}
}
//第二位：输出0
while(num[0]!=0){ Syste
m.out.print(0);
num[0]--;
}
//最后按照1-9的顺序输出
for(int i=1;i<10;i++){
while(num[i]!=0){ Syste
m.out.print(i);
num[i]--;
}
}
}
}
[编程题]36900-尼科彻斯定
