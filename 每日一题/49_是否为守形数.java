import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int num = scan.nextInt();
            isshouxing(num);

            if(isshouxing(num)) {
                System.out.println("Yes!");
            }else {
                System.out.println("No!");
            }


        }
    }

    public static Boolean isshouxing(int num) {

        int tmp = num;
        int num1 = (int) Math.pow(num, 2);
        int count = 1;
        while (num / 10 != 0) {
            if (num / 10 != 0) {
                num = num / 10;
                count++;
            } else {
                break;
            }
        }

        int num3 = num1 % (int) (Math.pow(10, count));
        if (num3 == tmp) {
            return true;
        } else {
            return false;
        }
    }
}
