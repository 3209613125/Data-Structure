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
