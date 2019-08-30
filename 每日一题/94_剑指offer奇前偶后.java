//奇前偶后
class Main{
    public static void main(String[] args) {
        int[] array  = new int[]{2,3,6,9,8,7,4,5,32,12,65,4,59,8,21,53};
        int start = 0;
        int end = array.length-1;
        sort(start,end,array);

    }
    public static void sort(int start,int end,int[] array){
        int i = start;
        int j = end;
        int t = 0;
        if (i > j || array.length==0){
            return;
        }
        while (i < j){
            while (i <j && array[i]%2==1){
                i++;
            }
            while (i < j && array[j]%2!=1){
                j--;
            }
             t = array[j];
            array[j] = array[i];
            array[i] = t;
        }
        for (int num : array){
            System.out.print(num+" ");
        }
    }
}
