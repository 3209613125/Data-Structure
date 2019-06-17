链接：https://www.nowcoder.com/questionTerminal/1221ec77125d4370833fd3ad5ba72395
来源：牛客网

一只兔子，从出生后第3个月起每个月都生一只兔子，小兔子长到第三个月后每个月又生一只兔子，假如兔子都不死，问每个月的兔子总数为多少？

 

    /**
     * 统计出兔子总数。
     * 
     * @param monthCount 第几个月
     * @return 兔子总数
     */
    public static int getTotalCount(int monthCount)
    {
        return 0;
    }
    
    输入描述:
输入int型表示month



输出描述:
输出兔子总数int型

示例1
输入
9
输出
34


我的代码:
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            System.out.println(rabbit(n));
        }
        sc.close();
    }
    
    public static int rabbit(int n){
        if(n <= 2){
            return 1;
        }
        
        return rabbit(n-1)+rabbit(n-2);
    }
}
