//当要快速排列的序列已经从小到大的序列排序好的话
//快速排序就类似于冒泡排序，每次扫一个元素，且要遍历整个数组，时间复杂度为n^2;
//时间复杂度最好为 nlogn，最坏为n^2
//空间复杂度:logn，最坏为n
//稳定性：不稳定，含有跳跃式交换

import java.util.Scanner;
class QuickSort {
    public static  void QuickSort(int[] arr,int low,int high){
        int i,j,temp,t;
        if(low>high){
            return;
        }
        i=low;
        j=high;
        temp=arr[low];
        while(i<j){
            while(temp<=arr[j]&&i<j){
                j--;
            }
            while(temp>=arr[i]&&i<j){
                i++;
            }
            if(i<j){
                t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
        }
        arr[low]=arr[i];
        arr[i]=temp;
        QuickSort(arr,low,j-1);
        QuickSort(arr,j+1,high);
    }
    public static void main(String[] args){
        System.out.println("请输入十个整形数");
        Scanner scanner=new Scanner(System.in);
        int[] arr=new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }
       for(int i:arr){
           System.out.print(i+" ");
       }
        System.out.println("\n");
        QuickSort(arr, 0, arr.length-1);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }

            System.out.println(Arrays.toString(arr));
    }
}
