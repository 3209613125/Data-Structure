import java.util.Scanner;
/*密码要求:
1.长度超过8位
2.包括大小写字母.数字.其它符号,以上四种至少三种
3.不能有相同长度超2的子串重复
说明:长度超过2的子串
输入描述:
一组或多组长度超过2的子符串。每组占一行
输出描述:
如果符合要求输出：OK，否则输出NG
输入例子:
021Abc9000
021Abc9Abc1
021ABC9000
021$bc9000
输出例子:
OK
NG
NG
OK
*/
public class PassWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext())
        {
            String key=sc.next();
            if(isQualified(key))
            {
                System.out.println("OK");
            }
            else{
                System.out.println("NG");
            }
        }
    }


    public static boolean isQualified(String key)
    {
        int Low=0,Up=0,num=0,other=0;
        if(key.length()<=8)
        {
            return false;
        }
        for(int i=0;i<key.length();i++)
        {
            char ch=key.charAt(i);
            if('0'<=ch&&ch<='9')
            {
                num=1;
            }
            else if('a'<=ch&&ch<='z')
            {
                Low=1;
            }
            else if('A'<=ch&&ch<='Z')
            {
                Up=1;
            }
            else
            {
                other=1;
            }
        }
        if(num+Low+Up+other<3)
        {
            return false;
        }
/*
021Abc9Abc1
*/
        for(int j=0;j<key.length()-4;j++)
        {
            for(int k=j+1;k<key.length()-3;k++)
            {
                if(key.substring(j,j+3).equals(key.substring(k,k+3)))
                {
                    return false;
                }
            }
        }
        return true;
    }
}


--------------------------------------------------------------------------------------------------


import java.util.*;
public class Main {
// 1.长度超过8位
public static boolean checkLength(String password){
if (password==null || password.length()<=8)
return false;
return true;
}
// 2.包括大小写字母.数字.其它符号,以上四种至少三种
public static boolean checkCharKinds(String password){
int Digit=0 , lowercase=0,uppercase=0,others=0;
char[] ch = password.toCharArray();
for (int i = 0; i < ch.length; i++) {
if (ch[i]>='0'&&ch[i]<='9') {
Digit=1;
continue;
}
else if (ch[i]>='a'&&ch[i]<='z') {
lowercase=1;
continue;
}
else if (ch[i]>='A'&&ch[i]<='Z') {
uppercase=1;
continue;
}else {
others=1;
continue;
}
}
int total = Digit+lowercase+uppercase+others;
return total>=3 ? true : false;
}
// 3.不能有相同长度超2的子串重复
public static boolean checkCharRepeat(String password){
for(int i=0 ;i<password.length()-2 ;i++){
//子串校验
//a.从下标i开始，每次截取2个字符的字符串
//b.从下标i+1开始截取剩余字符构成字符串，判断是否包含a中截取的字符串
//包含说明出现重复，不包含说明没有重复
String substr1 =password.substring(i, i+3);
if (password.substring(i+1).contains(substr1))
return false;
}
return true;
}
public static void main(String[] args) {
Scanner cin = new Scanner(System.in);
    while (cin.hasNextLine()) {
String psw = cin.nextLine();
if (checkLength(psw)&&checkCharKinds(psw)&&checkCharRepeat(psw))
System.out.println("OK");
else
System.out.println("NG");
}
}
}
