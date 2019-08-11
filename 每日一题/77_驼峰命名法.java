链接：https://www.nowcoder.com/questionTerminal/aed1c7bbc2604e7c9661a2348b0541b8?pos=46&mutiTagIds=579&orderByHotValue=1
来源：牛客网

语言风格使用下划线分隔多个单词，例如“hello_world”；而Java则采用一种叫骆驼命名法的规则：除首个单词以外，所有单词的首字母大写，例如“helloWorld”。
请你帮可怜的程序员们自动转换变量名。

import java.util.*;
public class Main {
    public static void main(String[] args) {
     strtransform();
    }
    public static void strtransform(){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.nextLine();
            String[] str1 = str.split("_");
            String str3 = str1[0];
            for (int i = 1;i <str1.length;i++){
                //char取得的字符，不能再用UpperCase方法
                str3 += (char)(str1[i].charAt(0)-'a'+'A');
                for (int j = 1;j < str1[i].length();j++){
                    str3 += str1[i].charAt(j);
                }
            }
            System.out.println(str3);
        }
    }

}
