public class Main{
    public static void main(String[] args) {
        System.out.println(count_5(25));
    }
    public static int count_5(int n){
        int count = 0;
        int j = 0;
        for (int i = 1; i <= n; i++) {
            j = i;
            while (j % 5 == 0){
                count++;
                j /= 5;
            }
        }
        return count;
    }
}
