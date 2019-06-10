链接：https://www.nowcoder.com/questionTerminal/ab900f183e054c6d8769f2df977223b5
来源：牛客网

牛牛又从生物科研工作者那里获得一个任务,这次牛牛需要帮助科研工作者从DNA序列s中找出最短没有出现在DNA序列s中的DNA片段的长度。
例如:s = AGGTCTA
序列中包含了所有长度为1的('A','C','G','T')片段,但是长度为2的没有全部包含,例如序列中不包含"AA",所以输出2。

输入描述:
输入包括一个字符串s,字符串长度length(1 ≤ length ≤ 2000),其中只包含'A','C','G','T'这四种字符。


输出描述:
输出一个正整数,即最短没有出现在DNA序列s中的DNA片段的长度。
示例1
输入
AGGTCTA
输出
2

【题目解析】
无
【解题思路】
第一步：从长度为1到长度为n分别进行讨论，将长度为i的子串加入到set容器中去，set容器会自动除去重复
的元素，这样set容器的大小size()就 表示长度为i的种类数量了。
第二步：长度为i的序列总共有4的i次方个（排列组合：每个位置都有四种选择），然后将set容器的size()与
4的i次方进行比较，如果小于4的i次方，那肯定存在不包含的序列。


import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class Main {
public static void main(String[] args)
{ Scanner scanner = new
Scanner(System.in); String str =
scanner.next();
System.out.println(fun(str));
}
static int fun(String str) {
for (int i = 1; i <= str.length(); i++)
{ Set<String> rq = new TreeSet<>();
for (int j = 0; j < str.length() - i; j++)
{ rq.add(str.substring(j, j + i));//长度为i的
子串
}
if (rq.size() < Math.pow(4, i)) {//长度为i的子串没有出现，返回i
return i;
}
}
//字符串包含了所有长度为1的子串，所以此处返回1
return 1;
}
}
