import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()){
            int n = scan.nextInt();
            int[] data = new int[n];
            for(int i = 0;i < n;i++ ){
                data[i] = scan.nextInt();
            }
            int num = scan.nextInt();
            for(int i = 0;i < data.length;i++){
                if(data[i] == num){
                    System.out.println(i);
                    break;
                }
                else{
                    if (i==data.length-1){
                        System.out.println(-1);
                    }

                }

            }

        }


    }
}

