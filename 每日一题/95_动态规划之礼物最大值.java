class GreatestGift2 {
        public static int maxValueOfGifts(int[][] values) {
            if(values==null || values.length<=0 ||values[0].length<=0)
                return 0;
            int rows=values.length;
            int cols=values[0].length;
      int[][] maxValue=new int[rows][cols];

            for(int i=0;i<rows;i++) {
                for(int j=0;j<cols;j++) {
                    int left=0;
                    int up=0;
                    if(i>0)
                 up=maxValue[i-1][j];

                    if(j>0)
                  left=maxValue[i][j-1];

              maxValue[i][j]=Math.max(up, left)+values[i][j];

                }
            }
     return maxValue[rows-1][cols-1];

        }

    public static void main(String[] args) {
        int[][] arr = { { 1, 10, 3, 8 }, { 12, 2, 9, 6 }, { 5, 7, 4, 11 },
                { 3, 7, 16, 5 } };
        System.out.println(maxValueOfGifts(arr));
    }
}
