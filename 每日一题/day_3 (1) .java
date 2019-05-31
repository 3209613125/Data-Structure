//Fibonacci数列
//Fibonacci数列是这样定义的：
//F[0] = 0
//F[1] = 1
//for each i ≥ 2: F[i] = F[i-1] + F[i-2]
//因此，Fibonacci数列就形如：0, 1, 1, 2, 3, 5, 8, 13, ...，
// 在Fibonacci数列中的数我们称为Fibonacci数。给你一个N，
// 你想让其变为一个Fibonacci数，每一步你可以把当前数字X变为X-1或者X+1，
// 现在给你一个数N求最少需要多少步可以变为Fibonacci数。


import java.util.*;
class Main{
    public static void main(String[] args) {
        int n = 0;
        int a=0,b=1,c=1;
        Scanner scanner =new Scanner(System.in);
        if (scanner.hasNext()){
             n=scanner.nextInt();
        }

        while (c<n){
            a=b;
            b=c;
            c=a+b;
        }
        int dis1=n-b;
        int dis2=c-n;
        System.out.println(dis1<dis2?dis1:dis2);
    }
}
