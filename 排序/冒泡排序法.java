//冒泡排序法
//时间复杂度，o(n^2)
//空间复杂度:稳定
class Solution{
    public static void main(String[] args) {
        int[] arr = {9,8,4,6,5,7,3,2,1};
        bubble_sort(arr);
    }

    public static void bubble_sort(int arr[]){
        int arr_length = arr.length;
        for(int i = 0;i < arr_length;arr_length--){
            for(int j = i+1;j<arr_length;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        for(int i : arr){
            System.out.print(i+" ");
        }

    }
}


优化:package www.bittech;

//冒泡排序法
//优化:如果数组已经从小到大排序好，则内部for循环不用遍历第二遍
class Solution{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,0};
        bubble_sort(arr);
    }

    public static void bubble_sort(int arr[]){
        int arr_length = arr.length;
        int count = 0;
        for(int i = 0;i < arr_length;arr_length--){
            for(int j = i+1;j<arr_length;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    count++;
                }
            }
            if(count == 0){
                break;
            }

        }
        for(int i : arr){
            System.out.print(i+" ");
        }

    }
}

