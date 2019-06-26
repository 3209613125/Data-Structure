链接：https://www.nowcoder.com/questionTerminal/3897c2bcc87943ed98d8e0b9e18c4666
来源：牛客网

老师想知道从某某同学当中，分数最高的是多少，现在请你编程模拟老师的询问。当然，老师有时候需要更新某位同学的成绩.

输入描述:
输入包括多组测试数据。
每组输入第一行是两个正整数N和M（0 < N <= 30000,0 < M < 5000）,分别代表学生的数目和操作的数目。
学生ID编号从1编到N。
第二行包含N个整数，代表这N个学生的初始成绩，其中第i个数代表ID为i的学生的成绩
接下来又M行，每一行有一个字符C（只取‘Q’或‘U’），和两个正整数A,B,当C为'Q'的时候, 表示这是一条询问操作，他询问ID从A到B（包括A,B）的学生当中，成绩最高的是多少
当C为‘U’的时候，表示这是一条更新操作，要求把ID为A的学生的成绩更改为B。


输出描述:
对于每一次询问操作，在一行里面输出最高成绩.
示例1
输入
5 7
1 2 3 4 5
Q 1 5
U 3 6
Q 3 4
Q 4 5
U 4 5
U 2 9
Q 1 5
输出
5
6
5
9

【题目解析】
该题目描述内容比较多，但是逻辑并不复杂。简化一下内容即为：
第一行：n 个学生 m 老师可以询问或者更新m次
第二行：1~ n 个学生的成绩，学生ID也从 1 ~ n
m 行：
老师操作 Q 询问指定ID范围的学生成绩，输出最高成绩
老师操作 U 更新指定ID的学生成绩
【解题思路】
参考题目解析，解题思路变得简单很多。
交互式输入： 学生数量，老师可操作次数，学生成绩
循环执行m次，如果输入Q进行最大分数计算，如果输入U进行分数更新


import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int n = 0;
int m = 0;
while (scanner.hasNext()) {
n = scanner.nextInt(); //学生数量
m = scanner.nextInt(); //老师可以操作的次数
int[] stu = new int[n];//学生成绩
for (int i = 0; i < n; i++) {
stu[i] = scanner.nextInt();
}
//老师询问
for (int i = 0; i < m; i++) {
String c = scanner.next();
int a = scanner.nextInt();
int b = scanner.nextInt();
if (c.equals("Q")) {
int s = Math.min(a, b);//开始下标
int e = Math.max(a, b);//结束下标
int max = stu[s - 1];
//计算出 [s-1 , e)范围的最大值
for (int index = s; index < e; index++) {
max = Math.max(max, stu[index]);
}
System.out.println(max);
}
if (c.equals("U")) {
stu[a - 1] = b;
}
}
}
}
}
