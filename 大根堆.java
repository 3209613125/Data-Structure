public interface IHeap {
    //向下调整
    void AdjustDown(int root,int len);
    //初始化建立大根堆
    public void initHeap(int[] array);
    //向上调整，从孩子节点开始调整
    void AdjustUp(int child,int len);
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
    public void AdjustUp(int child, int len) {

    }

    @Override
    public void pushHeap(int item) {

    }

    @Override
    public int popHeap() {
        return 0;
    }

    @Override
    public int getHeapTop() {
        return 0;
    }

    @Override
    public void HeapSort() {

    }

    @Override
    public void show() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(elem[i] +" ");
        }
        System.out.println();
    }
}


public class TestDemo {
    public static void main(String[] args) {
        TestHeap testHeap = new TestHeap();
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        testHeap.initHeap(array);
        testHeap.show();
    }
}
