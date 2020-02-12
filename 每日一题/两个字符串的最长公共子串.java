//https://www.nowcoder.com/questionTerminal/181a1a71c7574266ad07f9739f791506

import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s1 = scanner.next();
            String s2 = scanner.next();
            longsertStr(s1,s2);
        }
    }
    public static String longsertStr(String s1,String s2){
       String max = (s1.length() > s2.length())?s1:s2;
       String min = (s1.equals(max))?s2:s1;
        for (int i = 0; i < min.length(); i++) {
            for (int j = 0,k=min.length()-i; k <= min.length(); j++,k++) {
                if (max.contains(min.substring(j,k))){
                    System.out.println(min.substring(j,k));
                    return min.substring(j,k);
                }
            }
        }
        return null;
    }
}
