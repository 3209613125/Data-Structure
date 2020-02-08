class Main{
    public static void main(String[] args) {
        /*排序问题*/
        int[] arr = new int[]{9,8,7,6,5,4,3,2,1};
        // QuickSort(0,arr.length-1,arr);  //快排
        // sort(arr);  //归并
        //insertSort(arr);  //插入排序
        //chooseSort(arr);  //选择排序
        //bubble_sort(arr);  //冒泡排序


        for (int num:arr){
            System.out.print(num+" ");
        }


    }

    //冒泡排序
    public static void bubble_sort(int arr[]) {
        int arr_length = arr.length;
        for (int i = 0; i < arr_length; arr_length--) {
            for (int j = i + 1; j < arr_length; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    

    //快速排序
    public static void QuickSort(int start,int end,int arr[]){
        int i,j,tmp,t;
        if (start > end){
            return;
        }
        i = start;
        j = end;
        tmp = arr[start];
        while (i < j){
            while (i < j && tmp<=arr[j]){
                j--;
            }
            while (i < j && tmp >= arr[j]){
                i++;
            }
            if (i < j){
                t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        arr[start] = arr[i];
        arr[i] = tmp;
        QuickSort(start,j-1,arr);
        QuickSort(i+1,end,arr);
    }

    //归并排序
    public static void sort(int[] arr){
        int[] tmp = new int[arr.length];
        sort(arr,tmp,0,arr.length-1);

    }

    public static void sort(int[] arr,int[] tmp,int left,int right){
        if (left < right){
            int mid = (left+right)/2;
            sort(arr,tmp,left,mid);
            sort(arr,tmp,mid+1,right);
            merge(arr,tmp,left,mid,right);

        }
    }

    public static void merge(int[] arr,int[] tmp,int left,int mid,int right){
        int i,j;
        i = left;
        j = mid+1;
        int t = 0;
        while (i <=mid && j<=right){
            if (arr[i] <= arr[j]){
                tmp[t++] = arr[i++];
            }
            else {
                tmp[t++] = arr[j++];
            }
        }
        while (i <=mid){
            tmp[t++] = arr[i++];
        }
        while (j <= right){
            tmp[t++] = arr[j++];
        }
        t = 0;
        while (left<=right){
            arr[left++] = tmp[t++];
        }
    }


    //插入排序
    public static void insertSort(int arr[]){
        int n = arr.length;
        int i,j,target = 0;
        for (i = 1; i <n; i++) {
            j = i;
            target = arr[i];
            while (j > 0 && target < arr[j-1]){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = target;

        }

    }

    //选择排序
    public static void chooseSort(int[] arr){
        for (int i = 0;i < arr.length;i++){
            for (int j = i+1;j < arr.length;j++){
                if (arr[j] < arr[i]){
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
    }

}
