//有一个神奇的口袋，总的容积是40，用这个口袋可以变出一些物品，
// 这些物品的总体积必须是40。John现在有n个想要得到的物品，
// 每个物品的体积分别是a1，a2……an。John可以从这些物品中选择一些，
// 如果选出的物体的总体积是40，那么利用这个神奇的口袋，John就可以得到这些物品。
// 现在的问题是，John有多少种不同的选择物品的方式。
//采用递归思想： ①物品n个，物品体积逐一放入weight[]中 ②递归函数count(int s,int n) : 其
//中s为剩余物品重量，n为剩余可选的物品个数
//则分以下两步递归求解：
//a.从后往前装，装上weight[n]后，若剩余物品仍然有解
//则count(s-weight[n],n-1);
//b.若装了weight[n]后，无解，则删除该包,尝试第n-1个
//count(s,n-1);



import java.util.*;
 class Main {
    static int[] weight;
    static int N;
    static int count=0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            N = input.nextInt();
            weight = new int[N+1];
            for (int i = 1; i <= N; i++) {
                weight[i] = input.nextInt();
            }
            count(40,N);
            System.out.println(count);
        }
    }
    public static void count(int s,int n) {
//如果正好装满
        if(s==0) {
            ++count;
            return ;
        }
//是s<0或n<1则不能完成
        if(s<0||(s>0&&n<1))
            return ;
        count(s-weight[n],n-1);
        count(s,n-1);
    }
}



//方法2：

import java.util.*;
 class Main {
    public static void main(String[] args) {
        System.out.println(solution(40));
    }
    private static int solution(int m){//m代表总体积
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n+1];//p[i]表示第i个物品的体积
        int[][] dp = new int[n+1][m+1];//dp[i][j]表示前i个物品可以凑成j的总方式
        for(int i=1; i<=n; i++){
            p[i] = sc.nextInt();
        }
//前i个物品凑成0的方案只有一种
        for(int i=0; i<=n; i++){
            dp[i][0] = 1;
        }
//前0个物品凑成j的方案有0种
        for(int j=1; j<=m; j++){
            dp[0][j] = 0;
        }
        for(int i=1;i<=n; i++){
            for(int j=0; j<=m; j++){
                if(p[i] <= j){//拿或不拿这个物品
                    dp[i][j] = dp[i-1][j] + dp[i-1][j-p[i]];
                }else{//这个物品大于凑成的体积，只能选择不拿
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][m];
    }
}
