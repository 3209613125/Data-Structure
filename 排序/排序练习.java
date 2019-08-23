import java.util.Arrays;

class Main{
    public static void main(String[] args) {
        int[] array = new int[10000];
        int[] tmp = new int[array.length];
        for (int i = array.length-1;i > 0;i--){
            array[i] = i;
        }
        mergesort(0,array.length-1,array,tmp);
        System.out.println(Arrays.toString(array));

    }
    public static void merge(int start,int mid,int end,int[] array,int[] tmp){
        int i = start;
        int tmpindex = start;
        int s2 = mid+1;
        while (start<=mid&&s2<=end){
            if (array[start]<=array[s2]){
                tmp[tmpindex++] = array[start++];
            }
            else {
                tmp[tmpindex++] = array[s2++];
            }
        }

        while (start<=mid){
            tmp[tmpindex++] = array[i++];
        }
        while (s2<=end){
            tmp[tmpindex++] = array[s2++];
        }
        while (i<=end){
            array[i] = tmp[i];
            i++;
        }
    }
    public static void mergesort(int start,int end,int[] array,int[] tmp){

        if (start>=end){
            return;
        }
       int mid = (start+end)/2;
        mergesort(start,mid,array,tmp);
        mergesort(mid+1,end,array,tmp);
        merge(start,mid,end,array,tmp);
    }

}
