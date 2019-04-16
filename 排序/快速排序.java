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
        System.out.println("请输入十个数字");
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
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
