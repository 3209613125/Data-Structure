//输入一个正整数n,求n!(即阶乘)末尾有多少个0？ 比如: n = 10; n! = 3628800,所以答案为2
//时间限制：1秒空间限制：32768K
//时间和内存超出，未通过测试
import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long i = scanner.nextLong();
        long count = 0,j = jiecheng(i);

      while (j%10==0){

         count++;
         j = j/10;

      }

        System.out.println(count);


    }


    public static long jiecheng(long i){


        if(i<=0){
            throw new IllegalArgumentException("必须输入为正整数");
        }

        if(i==1){
            return 1;
        }

      return   i*jiecheng(i-1);
    }
}


//通过的代码:
//最简单的思路就是把所有的数字进行分解质因数，例如：
//6 = 2*3
//15 = 3*5
//64 = 2*2*2*2*2*2 = 2^6
//100 = 2^2 * 5^2
//576 = 2^6 * 3^2
//那么我们在计算n的阶乘时，实际上就是把所有小于等于n的正整数分解成质因数，然后再将其乘到一起，
// 那么末尾0的个数实际上就是2*5的个数，而2的个数明显是很多很多的，所以问题就转化成了5的个数。
// 而只有5的倍数才有5这个因数，所以，问题就进一步简化为小于等于n的数中有多少个数是5的倍数，
// 当然25的倍数，125的倍数，625还要单独考虑。


import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        for(int i = n; i >= 5; i--) {
            int tmp = i;
            while(tmp % 5 == 0) {
                res++;
                tmp =tmp/ 5;
            }
        }
        System.out.println(res);
    }
}
