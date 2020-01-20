//给你六种面额1、5、10、20、50、100元的纸币，假设每种币值的数量都足够多，
// 编写程序求组成N元（N为0-10000的非负整数）的不同组合的个数

//db(n) = db(n-1) + db(n-2) +db(n-3) + db(1)
import java.util.Scanner;

class Main{
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int N = scanner.nextInt();
        int[] p = {1, 5, 10, 20, 50, 100};
        int l = p.length;
        long[] a = new long[N + 1];

        for (int j = 0; j <= N; j++){
            a[j] = 1;
        }

        for (int i = 1; i < l; i++) {
            for (int j = 1; j <= N; j++) {
                if (j >= p[i]) {
                    a[j] += a[j - p[i]];
                }
            }
        }

         System.out.println(a[N]);
    }

}
