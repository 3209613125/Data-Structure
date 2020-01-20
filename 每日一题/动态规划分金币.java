//给定一个n，问能组成w的钱币最少有多少种？f（n）= min（f（n-11），f（n-5），f（n-1））+1   n = 100
//f(15) = f(15-11)+1 = f(4)+1 = f(3)+1+1 = 5
//f(15) = f(15-5)+1 = f(10)+1 = f(10-5)+1+1 = f(5) +1 +1 = 3

class Dynamic_Programming{
    public static void main(String[] args) {
       int n = 100;
       int[] f = new int[106];
       int cost = 0;
        for (int i = 1; i <= n; i++) {
             cost = Integer.MAX_VALUE;
            if (i >= 1){
                cost = Integer.min(cost,f[i-1]+1);
            }
            if (i >= 5){
                cost = Integer.min(cost,f[i-5]+1);
            }
            if (i >= 10){
                cost = Integer.min(cost,f[i-10]+1);
            }
            f[i] = cost;
            System.out.println(f[i]);
        }
    }
}
