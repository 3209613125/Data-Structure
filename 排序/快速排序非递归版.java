
import java.util.Stack;

class QuictSort{
    public static void main(String[] args) {
        int[] array = new int[]{6,5,4,9,8,8,15};
        sort(array);
        for (int i : array){
            System.out.print(i+" ");
        }
    }

    public static int partation(int[] arrray,int low,int high) {
        int temp = arrray[low];
        while (low < high) {
            while (low < high && arrray[high] >= temp) {
                high--;
            }
            arrray[low] = arrray[high];

            while (low < high && arrray[low] <= temp) {
                low++;
            }
            arrray[high] = arrray[low];
        }
        arrray[high] = temp;
        return low;
    }

    public static void sort(int[] array) {
        int low = 0;
        int high = array.length - 1;
        Stack<Integer> stack = new Stack<>();
        int par = partation(array, low, high);
        if (par>low+1){
            stack.push(low);
            stack.push(par-1);
        }
        if (par<high-1){
            stack.push(par+1);
            stack.push(high);
        }
        while (!stack.isEmpty()){
            high = stack.pop();
            low = stack.pop();
            par = partation(array,low,high);
            if (par>low+1){
                stack.push(low);
                stack.push(par-1);
            }
            if (par<high-1){
                stack.push(par+1);
                stack.push(high);
            }
        }
    }
}
