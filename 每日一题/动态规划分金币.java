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
