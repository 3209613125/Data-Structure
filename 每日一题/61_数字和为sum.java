输入为两行:
 第一行为两个正整数n(1 ≤ n ≤ 1000)，sum(1 ≤ sum ≤ 1000)
 第二行为n个正整数A[i](32位整数)，以空格隔开。


输出描述:
输出所求的方案数
示例1
输入
5 15 5 5 10 2 3
输出
4


import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int n = scanner.nextInt();// 数组长度为n表示n个数字
int sum = scanner.nextInt();// 部分元素求和sum
int[] value = new int[n];//初始化数组
long[] dp = new long[sum + 1];//动态规划数组
dp[0] = 1;//index=0的初始化值
for (int i = 0; i < n; i++) {
value[i] = scanner.nextInt();
for (int j = sum; j >= 0; j- ) {
if (j >= value[i]) {
dp[j] += dp[j - value[i]];
}
}
}
System.out.println(dp[sum]);
}
}
