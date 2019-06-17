class Test{
    public static void main(String[] args) {
        int[]arr=new int[]{9,8,7,6,4,3,2,1,0,55,68,98,12};
        XIER.InsertSort(arr);
    }
}
class XIER{
    public static void InsertSort(int[] arr)
    {
        int i, j;
        int n = arr.length;
        int target;

        //假定第一个元素被放到了正确的位置上
        //这样，仅需遍历1 - n-1
        for (i = 1; i < n; i++)
        {
            j = i;
            target = arr[i];

            while (j > 0 && target < arr[j - 1])
            {
                arr[j] = arr[j - 1];
                j--;
            }

            arr[j] = target;
        }
                for(int x:arr){
            System.out.print(x+" ");
        }
    }
}


--------------------------------------

import java.util.Date;

class Main {
    public static void main(String[] args) {
        int[] arr = {8,7,9,6,3,2,1,5,4};
        insertSort(arr);
    }
    public static void insertSort(int[] array) {
        long start = System.currentTimeMillis();
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int j = 0;
            for (j = i - 1; j >= 0; j--) {
                if (array[j] > tmp) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = tmp;
        }
        long end = System.currentTimeMillis();
        for(int i:array){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("算法执行时间" + (end - start));
        //前计算机时间和GMT时间(格林威治时间)1970年1月1号0时0分0秒所差的毫秒数。
        System.out.println(System.currentTimeMillis());
        long curtime = System.currentTimeMillis();
        Date date =new Date(curtime);
        System.out.println(date);
    }
}
