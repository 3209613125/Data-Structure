//链接：https://www.nowcoder.com/questionTerminal/2f13c507654b4f878b703cfbb5cdf3a5
来源：牛客网

小红想买些珠子做一串自己喜欢的珠串。卖珠子的摊主有很多串五颜六色的珠串，但是不肯把任何一串拆散了卖。于是小红要你帮忙判断一
下，某串珠子里是否包含了全部自己想要的珠子？如果是，那么告诉她有多少多余的珠子；如果不是，那么告诉她缺了多少珠子。

为方便起见，我们用[0-9]、[a-z]、[A-Z]范围内的字符来表示颜色。例如，YrR8RrY是小红想做的珠串；那么ppRYYGrrYBR2258可以买，因为包含了
全部她想要的珠子，还多了8颗不需要的珠子；ppRYYGrrYB225不能买，因为没有黑色珠子，并且少了一颗红色的珠子。

输入描述:
每个输入包含1个测试用例。每个测试用例分别在2行中先后给出摊主的珠串和小红想做的珠串，两串都不超过1000个珠子。


输出描述:
如果可以买，则在一行中输出“Yes”以及有多少多余的珠子；如果不可以买，则在一行中输出“No”以及缺了多少珠子。其间以1个空格分隔。
示例1
输入
ppRYYGrrYBR2258
YrR8RrY
输出
Yes 8



import java.util.*;
import java.util.Map.Entry;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String have = sc.nextLine();
        String need = sc.nextLine();
        Map<Character , Integer> h = new HashMap<>();
        for(char c : have.toCharArray()){
            if(h.containsKey(c)){
                h.put(c,h.get(c)+1);
            }
            else{
                h.put(c,1);
            }
        }
        
        
         Map<Character, Integer> n = new HashMap<>();
        for (char c : need.toCharArray()) {
            if (n.containsKey(c)) {
                n.put(c, n.get(c) + 1);
            } else {
                n.put(c, 1);
            }
        }
        
        
        boolean weatherBy = true;
        int lack = 0;
        for(Entry<Character, Integer> en : n.entrySet()) {
            char k = en.getKey();
            int v = en.getValue();
            if (h.containsKey(k) && h.get(k) < v) {//商人的珠子包含用户的珠子但是不够
                weatherBy = false;
                lack += v - h.get(k);
            } else if (!h.containsKey(k)) {//商人的珠子不包含用户的珠子
                weatherBy = false;
                lack += v;
            }
        }
        if (weatherBy==true) {
            System.out.println("Yes " + (have.length() - need.length()));
        } if(weatherBy==false) {
            System.out.println("No " + lack);
        }
    }
}


import java.util.*;
public class Main {
    public static void main(String[] args) {
        treasure();

    }
    public static void treasure(){
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        char[] str_ = new char[str.length()];
        for (int i = 0;i<str.length();i++){
            str_[i] =  str.charAt(i);

        }
        String str1 = scanner.nextLine();
        char[] str1_ = new char[str1.length()];
        for (int i = 0;i<str1.length();i++){
            str1_[i] =  str1.charAt(i);

        }
        List list = new ArrayList();
        for (int i = 0;i < str1_.length;i++){
            for (int j = 0;j < str_.length;j++){
                if (str_[j] == str1_[i]){
                    list.add(str1_[i]);
                    str_[j] =(char) -1;
                    break;
                }
            }
        }
        if (list.size() == str1_.length){
            int num = str_.length-list.size();
            System.out.println("Yes"+" "+num);
        }
        else {
            int num = str1_.length-list.size();
            System.out.println("No"+" "+num);
        }

    }
}

