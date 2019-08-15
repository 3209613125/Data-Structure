
/**
* @Author: HeHaoYuan
* @Date: 2019/8/15
* @Description:
    前k小，大堆

*/
public class Main {
    public static void main(String[] args) {
        int[] array = {5,4,1,2,3,10,9,8,6,7};
        System.out.println(Solution(array,4));

    }
    public static ArrayList<Integer> Solution(int[] array, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        int length = array.length;
        if (k > length || k == 0) {
            return result;
        }
        PriorityQueue<Integer> maxheap = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for (int i = 0;i < length;i++){
            if (maxheap.size() != k){
                maxheap.offer(array[i]);
            }
            else if (maxheap.peek() > array[i]){
                maxheap.poll();
                maxheap.offer(array[i]);
            }
        }
        for (Integer integer : maxheap){
            result.add(integer);
        }
        return result;
    }
}

    /**
    * @Author: HeHaoYuan
    * @Date: 2019/8/15
    * @Description:

    前k大，小堆
    */
public class Main {
    public static void main(String[] args) {
        int[] array2 = {5,4,1,2,3,10,9,8,6,7};
        System.out.println(Solution(array2,4));

    }
    public static ArrayList<Integer> Solution(int[] array, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        int length = array.length;
        if (k > length || k == 0) {
            return result;
        }
        PriorityQueue<Integer> maxheap = new PriorityQueue(k);
        for (int i = 0;i < length;i++){
            if (maxheap.size() != k){
                maxheap.offer(array[i]);
            }
            else if (maxheap.peek() < array[i]){
                maxheap.poll();
                maxheap.offer(array[i]);
            }
        }
        for (Integer integer : maxheap){
            result.add(integer);
        }
        return result;
    }
}
