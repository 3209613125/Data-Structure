import java.util.ArrayList;
import java.util.PriorityQueue;

class Main {
    public static void main(String[] args) {
        int[] array = new int[100000000];
        for(int i = 0;i < 100000000;i++){
            array[i] = i;
        }

        System.out.println(Solution(array,10));

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
