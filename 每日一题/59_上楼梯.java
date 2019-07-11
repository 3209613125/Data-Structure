//1

a[i]=((a[i-1]+a[i-2])%1000000007+a[i-3])%1000000007
的解释：
取模运算有这样一个性质：(a+b)%c = ((a%c)+(b%c))%c
所以(a[i-1]+a[i-2])%1000000007就相当于(a[i-1]%X+a[i-2]%X)%X   用X代替1000000007
这样就使得a[i-1]、a[i-2]、a[i-1]+a[i-2]都没有溢出，之后再与a[i-3]相加之后取模，使得全部结果没有溢出。

public class Main {
    public static int countWays(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 4;
        int mod = 1000000007;
        int first = 1;
        int second = 2;
        int third = 4;
        int result = 0;
        for (int i = 4; i <= n; i++) {
            result = (first + second) % mod + third % mod;
            first = second % mod;//依次往后移动一位数
            second = third % mod;
            third = result;
        }
        return result % mod;
    }
}



//2(迭代)
/*
思路：上1级有一种，2级上1级后再上1级，3级有上1级之后上2级或上2级之后上1级或直接上3级
4级有1级上3级，2级上2级，3级上1级
总结起来有：f(1)=1,f(2)=2,f(3)=4,f(4)=f(1)+f(2)+f(3);f(5)=f(2)+f(3)+f(4)
f(n)=f(n-1)+f(n-2)+f(n-3);
本来使用递归做的，结果递归做到最后超时了，只好用迭代了；
*/
 class GoUpstairs {
    public int countWays(int n) {
        if(n<1) return 0;
        if(n==1) return 1;
        if(n==2) return 2;
        if(n==3) return 4;
        int array[] =new int[n];
        array[0] =1;
        array[1] =2;
        array[2] =4;
        for(int i=3;i<n;i++){
            array[i]=((array[i-1]+array[i-2])%1000000007+array[i-3]%1000000007)%1000000007;
        }
        return array[n-1];
    }
}
