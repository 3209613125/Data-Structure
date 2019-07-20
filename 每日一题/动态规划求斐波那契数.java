import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 递归时间复杂度为2^n
 */

//动态规划求Fibo
class Test2{
    public static void main(String[] args) {
        Scanner scanner  =new Scanner(System.in);
        Main main = new Main();
        while (scanner.hasNext()){
            System.out.println( main.fibo(scanner.nextInt()));
        }

    }
}

class Main{
    public int fibo(int n){
        List<Integer> list  =new ArrayList();
        list.add(1);
        list.add(1);
        for (int i = 2;i < n; i++ ){
            list.add(list.get(i-2)+list.get(i-1));
        }
        return list.get(n-1);

    }

}
