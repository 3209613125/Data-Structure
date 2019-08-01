链接：https://www.nowcoder.com/questionTerminal/bd891093881d4ddf9e56e7cc8416562d?orderByHotValue=0&page=1&onlyReference=false
来源：牛客网

/*算法思想：用max表示经过的数字长度最大值，count表示数字计数器，当为字母时重置为0
*end表示数字尾部，每次满足数字时，对max进行判断，当max小于于count时，更新max和end
*/

import java.util.Scanner;
 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str = scanner.nextLine();
            int max = 0,count=0,end=0;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                    count++;
                    if(max<count){
                        max= count;
                        end = i;
                    }
                }else{
                    count = 0;
                }
            }
            System.out.println(str.substring(end-max+1,end+1));
        }
    }
}
