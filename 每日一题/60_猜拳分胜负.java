import java.util.Scanner;

public class Win {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = Integer.parseInt(sca.nextLine());
        int aWin = 0;
      //  int aLose = 0;
        int bWin = 0;
      //  int bLose = 0;
        int peace = 0;
        int C = 0;
        int B = 0;
        int J = 0;
        while(n!=0){
            //C锤子J剪子B布
            String A = sca.next();
            String G= sca.next();
            if(A.equals("C")&& G.equals("J")){
                aWin += 1;
                C++;
            }
            if(A.equals("J")&& G.equals("B")){
                aWin += 1;
                J++;
            }if(A.equals("B")&& G.equals("C")){
                aWin += 1;
                B++;
            }
            if((A.equals("C")&& G.equals("C"))||
                    (A.equals("J")&& G.equals("J"))||
                    (A.equals("B")&& G.equals("B"))){
                peace += 1;
            }if(A.equals("J")&& G.equals("C")){
                bWin += 1;
            }
            if(A.equals("C")&& G.equals("B")){
                bWin += 1;
            }if(A.equals("B")&& G.equals("J")){
                bWin += 1;
            }
            n--;
        }
        System.out.print(aWin+" "+peace+" "+bWin);
        System.out.println();
        System.out.print(bWin+" "+peace+" "+aWin);
        System.out.println();
        if(J>B&&J>C){
            System.out.print("J");
            if(B<=C){
                System.out.print(" "+"B");
            }
            else{
                System.out.print(" "+"C");
            }
        }
       else if(C>B&&C>=J){
            System.out.print("C");
            if(B<=J){
                System.out.print(" "+"B");
            }
            else{
                System.out.print(" "+"J");
            }
        }else{
            System.out.println("B");
            if(C<=J){
                System.out.print(" "+"C");
            }
            else{
                System.out.print(" "+"J");
            }
        }
//        int AWin = Math.max(Math.max(J,B),C);
//        int BWin = Math.min(Math.min(J,B),C);
//        System.out.print(AWin+" "+BWin);
    }
}
