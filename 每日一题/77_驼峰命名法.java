链接：https://www.nowcoder.com/questionTerminal/aed1c7bbc2604e7c9661a2348b0541b8?pos=46&mutiTagIds=579&orderByHotValue=1
来源：牛客网

语言风格使用下划线分隔多个单词，例如“hello_world”；而Java则采用一种叫骆驼命名法的规则：除首个单词以外，所有单词的首字母大写，例如“helloWorld”。
请你帮可怜的程序员们自动转换变量名。

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            String str=scanner.nextLine();
// 先将字符串按 _ 切分
            String[] words=str.split("_");
            String result=words[0];
            for(int i=1;i<words.length;i++){
// 将首字母转为大写即可.
                result+=(char)(words[i].charAt(0)-'a'+'A');
                for(int j=1;j<words[i].length();j++){
                    result+=words[i].charAt(j);
                }
            }
            System.out.println(result);
        }
    }
}
