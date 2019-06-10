读入N名学生的成绩，将获得某一给定分数的学生人数输出。

输入描述:
测试输入包含若干测试用例，每个测试用例的格式为


第1行：N
第2行：N名学生的成绩，相邻两数字用一个空格间隔。
第3行：给定分数

当读到N=0时输入结束。其中N不超过1000，成绩分数为（包含）0到100之间的一个整数。


输出描述:
对每个测试用例，将获得给定分数的学生人数输出。
示例1
输入
3
80 60 90
60
2
85 66
0
5
60 75 90 55 75
75
0
输出
1
0
2


输入和计算过程：
输入人数
循环变量，输入分数
输入目标分数
循环变量分数数组，计算和目标分数相等的分数出现的频次
打印输出目标分数出现的频次


import java.util.Scanner;
public class Main {
public static void main(String[] args)
{ Scanner scan = new Scanner(System.in);
while (scan.hasNext()) {
int N = scan.nextInt();// 输入的人数
if (N == 0) {// 如果检测到输入的人数为0 则结束
return;
}
int[] arr = new int[N];// 保存N个人的分数
for (int i = 0; i < arr.length; i++)
{ arr[i] = scan.nextInt();
}
int t = scan.nextInt();// 目标分数 输出击中目标分数的个数
int count = 0;
for (int i = 0; i < arr.length; i++)
{ if (t == arr[i]) {
count++;
}
}
System.out.println(count);
}
}
}
