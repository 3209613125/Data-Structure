import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            int[] arr = new int[str.length()];
            for (int i = 0; i < str.length(); i++) {
                //字符串->字符char->String->Integer
                arr[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
                System.out.print(arr[i] + " ");
            }
        }
    }
