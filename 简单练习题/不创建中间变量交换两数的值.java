import java.util.Scanner;

public class Exchange {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        //int item = sca.nextInt();
        int a[] = {1,2};
        int b[] = exchange(a);
        for (int i = 0;i<2;i++) {
            System.out.println(b[i]);
        }


    }
    public static int[] exchange(int[] a){
        a[0] = a[1] ^ a[0];
        a[1] = a[0] ^ a[1];
        a[0] = a[0] ^a[1];

        return a;
    }
}
