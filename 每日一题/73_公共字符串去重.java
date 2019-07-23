
import java.util.*;
class Main {
    public static String DeleteChars(String str1,String str2) {
        if(str1==null || str2==null)
            return null;
//数组大小为256因为，字符最多256个
        boolean[] hashTable = new boolean[256];
        int lenStr2 = str2.length();
        int i = 0;
//将str2中字符对应的hashtable数组中的位置上的值设为ture
        while(i < lenStr2){
            int index = str2.charAt(i);
            hashTable[index] = true;
            i++;
        }
        char[] str1s = str1.toCharArray();
        int k = 0;
        int j = 0;
//开始遍历str1,没有出现过的字符，覆盖掉出现过的字符
        while(k < str1s.length) {
            int index = str1s[k];
//如果没有出现过，建议画图理解
            if(!hashTable[index]){
                str1s[j++] = str1s[k];
            }
            k++;
        }
//不进行重新拷贝的话，打印果会包含原有的部分数据。
        str1s = Arrays.copyOf(str1s,j);
        return String.copyValueOf(str1s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String str = DeleteChars(s1,s2);
            System.out.println(str);
        }
    }
}
