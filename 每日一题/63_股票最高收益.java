import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }
        System.out.println(calculateMax(prices));
    }

    public static int calculateMax(int[] prices) {
        int firstbuy = Integer.MAX_VALUE;
        int firstsell = 0;
        int secondbuy = Integer.MIN_VALUE;
        int secondsell = 0;
        for (int price : prices) {
            firstbuy = Math.min(firstbuy, price);
            firstsell = Math.max(firstsell, price - firstbuy);
            secondbuy = Math.max(secondbuy, firstsell - price);
            secondsell = Math.max(secondsell, price + secondbuy);
        }
        return secondsell;
    }
}
