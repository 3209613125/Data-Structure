package www.bittech;

//选择排序
//int i,int j,
//两套for循环
//9 8 7 6 5 4 3 2 1
class Solution{
    public static void main(String[] args) {
        int[] arr = {9,8,4,6,5,7,3,2,1};
        choose_sort(arr);
    }

    public static void choose_sort(int arr[]){
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[j] < arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }

            }
        }
        for(int i : arr){
            System.out.print(i+" ");
        }

    }
}
