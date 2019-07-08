import java.util.Scanner;

/**
 * @Information:说反话
 * @Author: HeHaoYuan
 * @Date: Created at 20:56 on 2019/7/7
 * @Package_Name: PACKAGE_NAME
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.nextLine();
            String[] strs = str.trim().split(" ");


            for(int i=0;i<strs.length;i++){
                if(i==strs.length-1){
                    System.out.print(strs[strs.length-1-i]);
                }else{
                    System.out.print(strs[strs.length-1-i]+" ");
                }
            }


        }
    }

}
