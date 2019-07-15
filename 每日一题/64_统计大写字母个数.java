import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
        String str = scanner.nextLine();
        count(str);

    }
}

public static Object[] count(String str){
    Map<Character,Integer> map = new HashMap<>();
    for (int i = 65;i < 91;i++){
        map.put((char)i,0);
    }
    for (int i = 0;i < str.length();i++){
        if (map.containsKey(str.charAt(i))){
            map.put(str.charAt(i),map.get(str.charAt(i))+1);
        }
    }
    Object[] coll = map.entrySet().toArray();
    for (Object i : coll){
        System.out.println(i);
    }
    return coll;
}


}
