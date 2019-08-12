链接：https://www.nowcoder.com/questionTerminal/bd891093881d4ddf9e56e7cc8416562d?orderByHotValue=0&commentTags=JavaScript
来源：牛客网

输入描述:
个测试输入包含1个测试用例，一个字符串str，长度不超过255。


输出描述:
在一行内输出str中里连续最长的数字串。
示例1
输入
abcd12345ed125ss123456789
输出
123456789

class Main{
    public static void main(String[] args) {
        String s = "adf123d98777s9999999999";
        int end = 0;
        int max = 0;
        int count = 0;
        for (int i = 0;i < s.length();i++){
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                count++;
                if (count > max){
                    max = count;
                    end = i;
                }

            }
            else {
                count = 0;
            }
        }

      System.out.println(s.substring(end-max+1,end+1));
    }
}
