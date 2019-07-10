import java.util.Scanner;

 public class Count2 {
    public int countNumberOf2s(int n) {
        int count = 0;
        for( int i = 0;i <= n;i++){
           if( String.valueOf(i).contains("2")){
               for (int i1 = 0;i1<String.valueOf(i).length();i1++){
                   if(String.valueOf(i).charAt(i1)=='2'){
                       count ++;

                   }
               }
            }

        }
        return  count;
    }


}
class Test{
    public static void main(String[] args) {
        Count2 count2 = new Count2();
        Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            System.out.println(count2.countNumberOf2s(n));
        
    }
 }
