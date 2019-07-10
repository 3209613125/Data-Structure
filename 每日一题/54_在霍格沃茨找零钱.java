
import java.util.Scanner;
 
public class Main {
    public static void findMoney(String p, String a)
    {
        //两个常亮用来表示各个单位到最小单位之间的进制关系
        final int FIRST = 17*29;
        final int SECOND = 29;
        
        String[] ps = p.split("\\.");
        int l1 = ps.length;
        int moneyP = (l1>=1?Integer.parseInt(ps[0])*FIRST:0) +
                (l1>=2?Integer.parseInt(ps[1])*SECOND:0) +
                (l1>=3?Integer.parseInt(ps[2]):0); //5421
 
        String[] as = a.split("\\.");
        int l2 = as.length;
        int moneyA =  (l2>=1?Integer.parseInt(as[0])*FIRST:0) +
                (l2>=2?Integer.parseInt(as[1])*SECOND:0) +
                (l2>=3?Integer.parseInt(as[2]):0); //
        //找的钱数
        int find = moneyA - moneyP;
        if (find < 0)//如果是负数，在最前面先输出一个负号，然后把它当正数处理
        {
            find *= (-1);
            System.out.print("-");
        }
        System.out.println(find/(FIRST)+"."+(find%FIRST)/SECOND+"."+find%FIRST%SECOND);
    }
    public static void main(String[] args) {
 
        Scanner s = new Scanner(System.in);
        while (s.hasNext())
        {
            String p = s.next();
            String a = s.next();
            findMoney(p, a);
        }
    }
}
