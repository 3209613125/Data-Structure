public class Main{
    public static void main(String[] args) {
        //2 5 6 9 5 1 2 3 5 4 5
//        System.out.println(binarySearch(new int[]{1,3,55,98,321,546,981,1024},0));
        int[] arr = new int[]{1,3,55,98,321,546,981,1024};
        System.out.println(binarySearch(arr,1024,0,arr.length-1));

    }
    //循环查找
//    public static int binarySearch(int[] arr, int i) {
//        int low = 0;
//        int high = arr.length-1;
//        while (low <= high){
//            int mid = (low+high)/2;
//            if (arr[mid] == i){
//                return mid;
//            }
//            else if(arr[mid] < i){
//                low = mid+1;
//            }
//            else {
//                high = mid-1;
//            }
//        }
//        return -1;
//    }

   //递归查找
   public static int binarySearch(int[] arr, int i,int low,int high) {
        int mid = (low + high) / 2;
   if (i < arr[low] || i > arr[high] || low > high){
       return -1;
   }

   if (i < arr[mid]){
      return binarySearch(arr,i,low,mid-1);
   }
   if (i > arr[mid]){
      return binarySearch(arr,i,mid+1,high);
   }
   else {
       return mid;
   }
    }
    }
