//动态规划求解
//map数组中的值为0表示无障碍，
// 否则表示有障碍，map某个值有障碍时，step数组对应的那个值存储路数计为0
//step数组中每个元素对应的值表示记下的路数

import java.util.Scanner;
 class Main {
     public int overbarrier(int x, int y, int[][] map) {
         int[][] step = new int[x][y];
         if (map[0][0] == 0) {
             step[0][0] = 1;
         } else {
             step[0][0] = 0;
         }
         for (int i = 1; i < x; i++) {
             if (map[i][0] == 0) {
                 step[i][0] = step[i - 1][0];
             } else {
                 step[i][0] = 0;
             }
         }
         for (int j = 1; j < y; j++) {
             if (map[0][j] == 0) {
                 step[0][j] = step[0][j - 1];
             } else {
                 step[0][j] = 0;
             }
         }
         for (int i = 1; i < x; i++) {
             for (int j = 1; j < y; j++) {
                 if (map[i][j] == 0) {
                     step[i][j] = step[i][j - 1] + step[i - 1][j];
                 }
                 else{
                     step[i][j] = 0;
                 }
             }
         }
         return step[x - 1][y - 1];
     }
 }
    class Test2{
        public static void main(String[] args) {
            Main main = new Main();
            Scanner scanner = new Scanner(System.in);
            int[][]map = new int[3][3];
            
            map[0][1]=1;

            while (scanner.hasNext()){
                System.out.println(main.overbarrier(scanner.nextInt(),scanner.nextInt(),map));
            }
        }

    }

