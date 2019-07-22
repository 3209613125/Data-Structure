//链接：https://www.nowcoder.com/questionTerminal/1a92fbc771a54feb9eb5bd9b3ff2d0a9
//来源：牛客网
//
//Emacs号称神的编辑器，它自带了一个计算器。与其他计算器不同，它是基于后缀表达式的，即运算符在操作数的后面。例如“2 3 +”等价于中缀表达式的“2 + 3”。
//请你实现一个后缀表达式的计算器。
//
//输入描述：
//输入包含多组数据。
//
//每组数据包括两行：第一行是一个正整数n（3≤n≤50）;紧接着第二行包含n个由数值和运算符组成的列表。
//
//“+  -  * /”分别为加减乘除四则运算，其中除法为整除，即‘5/3 = 1’。
//
//
//输出描述：
//对应每一组数据，输出它们的运算结果。
//示例1
//输入
//3
//2 3 +
//5
//2 2 + 3 *
//5
//2 2 3 + *
//输出
//5
//12
//10
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class AnswerEmacsCalculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            List<String> list = new ArrayList<String>();
            int n=sc.nextInt();
            if(n<3) continue;
            for(int i=0;i<n;i++){
                list.add(sc.next());
            }
            while(list.size()!=1){
                int size = list.size();
                int num=0;
                for(int i=0;i<size;i++){
                    if(list.get(i).equals("+")){
                        num = Integer.valueOf(list.get(i-2))+Integer.valueOf(list.get(i-1));
                        list.remove(i-2);list.remove(i-2);list.remove(i-2);
                        list.add(i-2, Integer.toString(num));
                        break;
                    }else if(list.get(i).equals("-")){
                        num = Integer.valueOf(list.get(i-2))-Integer.valueOf(list.get(i-1));
                        list.remove(i-2);list.remove(i-2);list.remove(i-2);
                        list.add(i-2, Integer.toString(num));
                        break;
                    }else if(list.get(i).equals("*")){
                        num = Integer.valueOf(list.get(i-2))*Integer.valueOf(list.get(i-1));
                        list.remove(i-2);list.remove(i-2);list.remove(i-2);
                        list.add(i-2, Integer.toString(num));
                        break;
                    }else if(list.get(i).equals("/")){
                        num = Integer.valueOf(list.get(i-2))/Integer.valueOf(list.get(i-1));
                        list.remove(i-2);list.remove(i-2);list.remove(i-2);
                        list.add(i-2, Integer.toString(num));
                        break;
                    }

                }
            }
            System.out.println(list.get(0));
        }

        sc.close();
    }
}
