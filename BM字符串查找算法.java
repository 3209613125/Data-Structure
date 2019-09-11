import java.util.Scanner;

public class Main{


//时间复杂度为n^2
    public  int find(String str,String s){
        int length = str.length();
        int l = s.length();
        if (str != null){
            if (s == null){
                return 0;
            }
            else {
                for (int i = 0; i < length-l; i++) {
                    int j;
                    for ( j = 0; j < l; j++) {
                        if (str.charAt(i+j) != s.charAt(j)){
                            break;
                        }
                    }
                    if (l == j){
                        return i;
                    }

                }

            }
        }
        return -1;
    }

    //BM算法
public  int search(String text, String pattern) {
        int N = text.length();
        int M = pattern.length();

        // 构建right数组
        int R = 256; // 字母表大小
        int[] right = new int[R]; // 记录字母表中的每个字符在模式字符串中出现的最右的索引
        for (int i = 0;  i < R; i++)
            right[i] = -1;
        for (int j = 0; j < M; j++)
            right[pattern.charAt(j)] = j;
        
        int skip;
        for (int i = 0; i <= N-M; i+=skip) {
            skip = 0;
            for (int j = M-1; j >= 0; j--) {
                if (pattern.charAt(j) != text.charAt(i+j)) { // 不匹配的情况
                    skip = j - right[text.charAt(i + j)]; // 这里包括情景1和情景2.1，如果情景1，right[text.charAt(i + j)]为-1
                    if (skip < 1) skip = 1; // 情景2.2
                    break;
                }
            }
            if (skip == 0) return i; // 匹配成功
        }
        return -1; // 未找到匹配
    }
}

class Test{
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.nextLine();
            String  s = scanner.nextLine();
            System.out.println(main.search(str,s));
        }
    }
}
