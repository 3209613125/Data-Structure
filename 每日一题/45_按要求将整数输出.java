//第一个输出取各位和
//第二个输出取各位平方和
import  java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()){
            int num = scan.nextInt();
            System.out.println(sum(num)+" "+pow_sum(num));
        }

        scan.close();


    }
    public static int sum( int num){
        int count = 0;
        while(num/10!=0){
            count += num%10;
            num = num/10;
        }
        count += num;
        return count;
    }

    public static int pow_sum(int num){
        int count1 = 0;
        while(num/10!=0){
            count1 += Math.pow(num%10,2);
            num = num/10;
        }
        count1 += Math.pow(num,2);
        return count1;
    }
}
