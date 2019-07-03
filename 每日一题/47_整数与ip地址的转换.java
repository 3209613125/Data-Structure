package www.hhy;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = "";

//        while (scanner.hasNext()) {
//            str = scanner.next();
        str = "215561";
            if (str.contains(".")) {
                System.out.println(ipToInt(str));
            } else {
                System.out.println(intToIp(str));
            }
        }

//        scanner.close();
//    }

    private static String intToIp(String str) {
        String result = "";
        Long input = Long.parseLong(str);
        for (int i = 3; i >= 0; i--) {

            //就相当于全部转化为二进制之后再进行"与"运算
            //& 0x000000ff直接作用就是只保留最后8位(一个16进制位是4个2进制位),屏蔽掉前面的数字
            result = (input & 0x000000FF) + "." + result;
            input >>>= 8;
        }
        return result.substring(0, result.length() - 1);
    }

    private static long ipToInt(String str) {
        String[] array;
        long result = 0;
        array = str.split("[.]");
        for (String s : array) {
            result = (result << 8) + Integer.parseInt(s);

        }
        return result;
    }

}



//        int result = 8;
//        result = (result<<2);


//        int d = Integer.parseInt("00001010000000000000001111000001",2);

//        System.out.println((int) Math.pow(2,27));
