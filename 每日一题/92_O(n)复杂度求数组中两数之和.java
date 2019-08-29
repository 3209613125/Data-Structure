import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        int [] array = {1,2,3,4,50,7,8,12,13};
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int x = scanner.nextInt();
            int start = 0;
            int end = array.length-1;
            find(start,end,x,array);
        }
    }
    public static void find(int start,int end,int x,int[] array){
        List list = new ArrayList();
        int i = start;
        int j = end;
        while (i < j){
            while (i < j && x <= array[i] + array[j]){
                if (i < j && x < array[i] + array[j]){
                    j--;
                }
                if (i < j && x== array[i] + array[j]){
                   list.add(i);
                   list.add(j);
                    System.out.println("array["+i+"]"+" "+"array["+j+"]");
                    j--;
                }
            }
            while (i < j && x >= array[i] + array[j]){
                if (i < j && x > array[i] + array[j]){
                    i++;
                }
                if (i < j && x== array[i] + array[j]){
                    list.add(i);
                    list.add(j);
                    System.out.println("array["+i+"]"+" "+"array["+j+"]");
                    i++;
                }
            }
        }
        if (array[i] == x){
            list.add(i);
            System.out.println("array["+i+"]");
        }
        if (list.isEmpty()){
            System.out.println("null");
        }
    }
}
