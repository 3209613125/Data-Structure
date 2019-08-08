import java.util.*;
public class ZuiXiaoGongBeiShu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        if(a >= b) {
            int i = a;
            while(i >= a) {
                if(i%a == 0 && i%b == 0) {
                    System.out.println(i);
                    break;
                }
                i++;
            }
        }else {
            int i = b;
            while(i >= b) {
                if(i%a == 0 && i%b == 0) {
                    System.out.println(i);
                    break;
                }
                i++;
            }
        }
    }
}
