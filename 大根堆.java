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
    public void AdjustDown(int root, int len) {
        int parent = root;
        int child = 2*parent+1;
        while (child < len) {
            if( child+1 < len && elem[child] < elem[child+1]){
                ++child;
            }
            //child下标存放的是左右孩子的最大值
            if(elem[child] > elem[parent]){
                //交换
                int tmp = elem[child];
                elem[child] = elem[parent];
                elem[parent] = tmp;
                parent = child;
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
            this.elem = Arrays.copyOf(this.elem,
                    2*this.elem.length);
        }
        this.elem[this.usedSize] = item;
        this.usedSize++;
        AdjustUp(this.usedSize-1);
    }
    public boolean isEmpty() {
        return this.usedSize == 0;
    }
    @Override
    public int popHeap() {
        if(isEmpty()){
            throw new UnsupportedOperationException("堆为空");
        }
        int oldData = elem[0];
        int tmp = elem[0];
        elem[0] = elem[this.usedSize-1];
        elem[this.usedSize-1] = tmp;
        this.usedSize--;
        AdjustDown(0,this.usedSize);
        return oldData;
    }

    @Override
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
