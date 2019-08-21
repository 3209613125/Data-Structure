import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       while (scanner.hasNextLine()){
           System.out.println(isOctNumber(scanner.nextLine()));
       }
    }
    private static boolean isOctNumber(String str) {
        boolean flag = false;
        int flag_dian = 0;
        int flag_0 = 0;

        for(int i=0,n=str.length();i<n;i++){
            char c = str.charAt(i);
            //0的判断
            if (str.charAt(i) == '0'){
                flag_0++;
                if (flag_0 > 1){
                    flag = false;
                    break;
                }
            }
            else {
                if (flag_0 == 0){
                    flag_0 = 0;
                }
                else {
                    flag_0--;
                }
            }
            if (i >=1 &&'-' == str.charAt(i)){
                flag = false;
                break;
            }
            //.的判断
            if (i>0&&i<str.length()-1&&str.charAt(i)=='.'){
                    flag_dian++;
                    if (flag_dian>1){
                        flag = false;
                        break;
                    }
                }
                if (i==0||i==str.length()-1){
                if (str.charAt(i)=='.') {
                    flag = false;
                    break;
                }
                }

            if(c=='0'|c=='1'|c=='2'|c=='3'|c=='4'|c=='5'|c=='6'|c=='7'|c=='8'|c=='9'
                    |c=='.'|c=='-'){
                flag =true;
            }
            else {
                flag = false;
                break;
            }
            }

        return flag;
    }
    }
