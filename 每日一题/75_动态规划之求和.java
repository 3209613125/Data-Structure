链接：https://www.nowcoder.com/questionTerminal/11cc498832db489786f8a03c3b67d02c
来源：牛客网

输入两个整数n和m，从数列1,2,3 ....... n中随意取几个数，使其和等于m，要求将其中所有的可能组合列出来

输入描述：
每个测试输入包含2个整数，N和米


输出描述：
按每个组合的字典序排列输出，每行输出一种组合
示例1
输入
5 5
输出
1 4 
2 3 
5



import java.util.ArrayList;
import java.util.Scanner;

class TestDemo2{
    static ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int count = scanner.nextInt();
            int n = scanner.nextInt();
            find_sum(1,count,n);
            for (ArrayList l: res){
                for (int i = 0;i < l.size();i++){
                    System.out.print(l.get(i)+" ");
                }
                System.out.println();
            }

        }
    }

    public static void find_sum(int index,int count,int n){
        if (count == 0){
            res.add(new ArrayList<>(list));
        }
        for (int i = index;i <= count && i<=n;i++){
            list.add(i);
            find_sum(i+1,count-i,n);
            list.remove(list.size()-1);
        }
    }

}
