//辗转相除法（欧几里得算法）,求最大公约数
import java.util.Scanner;
class test{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        System.out.println(OJLD(a,b));
    }
    public static int OJLD(int a,int b){
        int temp;
        while (b>0){
            temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }

}
