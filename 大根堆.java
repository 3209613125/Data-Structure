/**
 * @Information:
 * @Author: HeHaoYuan
 * @Date: Created at 10:40 on 2019/7/31
 * @Package_Name: PACKAGE_NAME
 */
import java.util.Arrays;


public class TestHeap implements IHeap{

    private int[] elem;
    private int usedSize;
    private static final int  DEFAULT_SIZE = 10;

    public TestHeap(){
        this.elem = new int[DEFAULT_SIZE];
        this.usedSize = 0;
    }

    @Override
    //从每棵子树的根节点开始调整，调整的长度len
    public void AdjustDown(int root, int len) {
        int parent = root;
        int child = 2*parent+1;
        while (child < len) {
            //找左右孩子的最大值
            if( child+1 < len && elem[child] < elem[child+1]){
                //右孩子大，child+1有可能越界
                ++child;//若右边孩子大，则child指针右移一位，child下标存放的是左右孩子的最大值
            }
            //child下标存放的是左右孩子的最大值
            
            //如果左右孩子的最大值大于父节点，则进行交换
            if(elem[child] > elem[parent]){
                //交换
                int tmp = elem[child];
                elem[child] = elem[parent];
                elem[parent] = tmp;
                parent = child;//孩子节点变成了父母节点，parent指向孩子节点，child节点指向左孩子，因为不一定只执行一次
                child = 2*parent+1;
            }else {
                break;
            }
        }
    }
    //创建一个大根堆
    @Override
    public void initHeap(int[] array) {
        for (int i = 0; i < array.length; i++) {
            this.elem[i] = array[i];
            this.usedSize++;
        }

        //从最后一棵子树的父节点开始向下调整
        //子推父，孩子节点为n，父节点为(n-1)/2
        //父推子，父节点为n，左孩子节点为2n+1，右孩子节点为2n+2
        for (int i = (array.length-1-1)/2; i >= 0 ; i--) {
            AdjustDown(i,this.usedSize);
        }
    }

    @Override
    public void AdjustUp(int child) {
        int parent = (child-1)/2;
        while (child > 0){
            if(elem[child] > elem[parent]){
                int tmp = elem[child];
                elem[child] = elem[parent];
                elem[parent] = tmp;
                //孩子节点变为父节点，父节点向上走
                child = parent;
                parent = (child-1)/2;
            }else {
                break;
            }
        }
    }
    public boolean isFull() {
        return this.usedSize == this.elem.length;
    }
    @Override
    public void pushHeap(int item) {
        if(isFull()){
            //2倍扩容
            this.elem = Arrays.copyOf(this.elem,
                    2*this.elem.length);
        }
        this.elem[this.usedSize] = item;
        this.usedSize++;
        //插入节点后就不是大根堆了，需要向上调整
        AdjustUp(this.usedSize-1);
    }
    public boolean isEmpty() {
        return this.usedSize == 0;
    }
    @Override
    //删除堆顶元素
    public int popHeap() {
        if(isEmpty()){
            throw new UnsupportedOperationException("堆为空");
        }
       //堆顶元素和最后一个元素进行交换，之后删除原来的堆顶元素
        int oldData = elem[0];
        int tmp = elem[0];
        elem[0] = elem[this.usedSize-1];
        elem[this.usedSize-1] = tmp;
        this.usedSize--;
        又不是大根堆了，从根元素开始向下调整
        AdjustDown(0,this.usedSize);
        return oldData;
    }

    @Override
    //返回堆顶元素，不删除数据
    public int getHeapTop() {
        if(isEmpty()){
            throw new UnsupportedOperationException("堆为空");
        }
        return elem[0];
    }

    /**
     * 时间复杂度：
     * O(n log 2n)
     * 空间复杂度:o(1)
     * 稳定性：不稳定
     */
    @Override
    public void HeapSort() {
       /* for (int i = (array.length-1-1)/2; i >= 0 ; i--) {
            AdjustDown(i,this.usedSize);
        }*/
        //要交换的最后一个下标
        int end = this.usedSize-1;
        while (end > 0) {
            int tmp = elem[0];
            elem[0] = elem[end];
            elem[end] = tmp;
            AdjustDown(0,end);
            end--;
        }
    }
    //  topK     作业：一亿个数据找出十个最大/最小的数据
    @Override
    public void show() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(elem[i] +" ");
        }
        System.out.println();
    }
}


class Test_Heap{
    public static void main(String[] args) {
        TestHeap testHeap = new TestHeap();
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        testHeap.initHeap(array);
        System.out.print("初始化:   "); testHeap.show();
        testHeap.pushHeap(11);
        System.out.print("将11插入到堆中： ");testHeap.show();
        testHeap.popHeap();
        System.out.print("返回堆顶元素，删除数据元素:   ");  testHeap.show();
        testHeap.HeapSort();
        System.out.print("堆排序:   "); testHeap.show();
        System.out.print("返回堆顶元素：");
        System.out.println(testHeap.getHeapTop());
    }
}


interface IHeap {
    //向下调整
    void AdjustDown(int root,int len);
    //初始化建立大根堆
    public void initHeap(int[] array);
    //向上调整，从孩子节点开始调整
    void AdjustUp(int child);
    // 插入 item 到堆中
    void pushHeap(int item);
    // 返回堆顶元素，删除数据元素
    int popHeap();
    // 返回堆顶元素，不删除数据元素
    int getHeapTop();
    //堆排序
    void HeapSort();
    //打印堆
    void show();
}
