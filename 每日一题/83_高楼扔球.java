class Main{
    public static void main(String[] args) {
        int building = 100;
        //初始化，考虑数组边界0
        int[] dp = new int[building+1];
        //根据上面的思路，假设每一层都有碎的可能性，遍历求解，假设第i层球碎
        for (int i = 2;i <=building;i++){
            //最坏次数里面最优解法，假设为building，当然building-1更贴切，但并不影响程序结果
            int Min = building;//每一次i层碎的情况引发后续的 最小次数不同，需要重置Min的次数
            //第二层遍历，假设在第j层球碎
            for (int j = 1;j < i;j++){
                //那么用到的最大次数，要么从i层开始从上往下数到j层(i-j)+1(原来的第一次在i层碎的那一次)，
                // 要么从第1层开始到j层，即用了j-1+1=j次
                int Max = dp[i-j]+1;
                //因为要考虑最坏情况，所以要取最大值
                if (Max < j){
                    Max = j;
                }
                //Min当然要取最小值了
                if (Max < Min){
                    Min = Max;
                }
            }
            //第一次在i层碎的之后，后续个种情况的最小次数
            dp[i] = Min;
        }
        //遍历各种在i层碎的可能情况
        System.out.println(dp[building]);
    }
}
