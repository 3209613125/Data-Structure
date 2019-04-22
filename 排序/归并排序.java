//实现归并排序
import java.util.Arrays;
import java.io.*;


//交互
class MergeSort {
    public static void main(String[] args) {



   int[] data1=new int[]{9,8,7,6,88,4,3,2,1,0};

        System.out.println("排序结果如下:");


        sort(data1);

        System.out.println(Arrays.toString(data1));
    }
    public static void sort(int []data1){
        int []temp = new int[data1.length];//在排序前，先建好一个长度等于原数组长度的临时数组，避免递归中频繁开辟空间
        sort(data1,0,data1.length-1,temp);
    }
    private static void sort(int[] data1,int left,int right,int []temp){
        if(left<right){
            int mid = (left+right)/2;
            sort(data1,left,mid,temp);//左边归并排序，使得左子序列有序
            sort(data1,mid+1,right,temp);//右边归并排序，使得右子序列有序
            merge(data1,left,mid,right,temp);//将两个有序子数组合并操作
        }
    }
    private static void merge(int[] data1,int left,int mid,int right,int[] temp){
        int i = left;//左序列指针
        int j = mid+1;//右序列指针
        int t = 0;//临时数组指针
        while (i<=mid && j<=right){

            if(data1[i]<=data1[j]){
                temp[t++] = data1[i++];
            }else {
                temp[t++] = data1[j++];
            }
        }
        while(i<=mid){//将左边剩余元素填充进temp中
            temp[t++] = data1[i++];
        }
        while(j<=right){//将右序列剩余元素填充进temp中
            temp[t++] = data1[j++];
        }
        t = 0;
        //将temp中的元素全部拷贝到原数组中
        while(left <= right){
            data1[left++] = temp[t++];
        }
    }
}
