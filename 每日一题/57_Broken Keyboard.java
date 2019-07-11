import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
        String s1 = scanner.next().toUpperCase();
        String s2 = scanner.next().toUpperCase();
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        //set不允许有重复元素
        Set<Character> set1 = new LinkedHashSet<>();
        Set<Character> set2 = new LinkedHashSet<>();
        for (int i = 0; i < c1.length; i++) {
            set1.add(c1[i]);
        }
        for (int i = 0; i < c2.length; i++) {
            set2.add(c2[i]);
        }
        for (Character c : set2)
            set1.remove(c);
        for (Character c : set1)
            System.out.print(c);
    }
}
}
