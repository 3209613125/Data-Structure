import java.util.Arrays;
import java.util.Random;

class MyMergeSort{
    //递归
    private void merge(int[] array, int start,int mid, int end,int[] tmpArray) {
     //   int[] tmpArray = new int[array.length];
        int tmpIndex = start;
        int i = start;
        int s2 = mid+1;
        //有俩个归并段
        while(start<=mid && s2<=end){
            //俩个归并段都从头开始比较
            // 小的拉到创建好的数组里
            //再将索引++；直到有一个归并段没数据，跳出循环
            if (array[start] <= array[s2]){
                tmpArray[tmpIndex++] = array[start++];
            }else{
                tmpArray[tmpIndex++] = array[s2++];
            }
        }
        //说明第一个归并段有数据
        while (start <= mid){
            tmpArray[tmpIndex++] = array[start++];
        }
        //第二个归并段有数据
        while (s2 <= end){
            tmpArray[tmpIndex++] = array[s2++];
        }
        //把排好序的数据从tmpArray拷贝array
        while (i<=end){
            array[i] = tmpArray[i];
            i++;
        }
    }


    void mergeSort(int[] array, int start, int end,int[] tmpArray){
        if(start>=end){
            return;
        }
        int mid = (start+end)/2;
        mergeSort(array,start,mid,tmpArray);
        mergeSort(array,mid+1,end,tmpArray);
        merge(array,start,mid,end,tmpArray);
    }
    //非递归
    //归并
    public void merge2(int[] array,int gap){
        int[] tempArray = new int[array.length];
        int i = 0;//tempArray下标
        int start1 = 0;
        int end1 = start1+gap-1;
        int start2 = end1+1;
        int end2 = start2+gap-1<=array.length-1?start2+gap-1:array.length-1;
        //保证有俩个归并段
        while (start2 < array.length) {
            //保证俩个归并段都有数据
            while(start1<=end1 && start2<=end2){
                //比较
                if(array[start1]<array[start2]){
                   tempArray[i++] = array[start1++];
                }else{
                    tempArray[i++] = array[start2++];
                }
            }
            //退出循环是因为start2<=end2不成立，及说明start1~end1里还有未比较的数据
            while (start1 <= end1){
                tempArray[i++] = array[start1++];
            }
            //退出循环是因为start1<=end1不成立，及说明start2~end2里还有未比较的数据
            while (start2<=end2){
                tempArray[i++] = array[start2++];
            }
            //至此，及说明一次二路归并已走完,以下为修改指针，准备下一段归并
            start1 = end2 + 1;
            end1 = start1 + gap - 1;
            start2 = end1 + 1;
            end2 = start2+gap-1<=array.length-1?start2+gap-1:array.length-1;
            //当start2，end2，甚至end1已经越界时，start1还有数据，且未处理，要把他作为未归并的
            //数据，拉到tempArray里
            while(start1 <array.length){
            tempArray[i++] = array[start1++];
            }
        }
        //拷贝数据到原始数组
        //此处只能用for遍历去拷贝
        for(int j = 0;j<tempArray.length;j++){
            array[j] = tempArray[j];
        }
    }
    void mergeSort2(int[] array){
        for(int i = 1;i<array.length;i *= 2){
            merge2(array,i);
        }
    }
}

public class MergeSort {
    public static void main(String[] args) {
        MyMergeSort myMergeSort = new MyMergeSort();
        int[] array = new int[100000];
        Random random = new Random();
        for(int i = 0;i<array.length;i++){
            array[i] = random.nextInt(100000)+1;
        }
        int[] tmpArray = new int[array.length];
        myMergeSort.mergeSort(array,0,array.length-1,tmpArray);
        System.out.println(Arrays.toString(array));
    }
}
