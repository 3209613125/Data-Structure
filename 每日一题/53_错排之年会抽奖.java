//错排
//设第n步的放法有D（n）种
//第一步：n个元素放到k位置，有n-1种放法
//第二步：n-1个元素中k若放到n位置，剩下的n-2个元素，有n-2种放法；若不放到n为值，剩下的n-1个为值有n-1种放法
//综上所述：D（n） = （n-1）（D（n-1）+D（n-2））
import java.util.Scanner;

//新年抽奖
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            float a = fenmu(n);
            float b = fenzi(n);
            float result = (b/a)*100;
            System.out.println(String.format("%.2f",result)+"%");
        }
       


    }
    public static float fenzi(int n){
        if (n == 1){
            return 0;
        }
        if (n == 2){
            return 1;
        }
        else {
            return (n-1)*(fenzi(n-1)+fenzi(n-2));
        }

    }
    public static float fenmu(int n){
        if (n == 0){
            return 1;
        }
           return  n*fenmu(n-1);

    }

}
