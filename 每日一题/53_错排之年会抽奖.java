import java.util.*;
public class Main {
public static void main(String[] args) {
// 输入
Scanner scan = new Scanner(System.in);
while(scan.hasNext()){
int n = scan.nextInt(); // 代表测试数据的组数
float sum1 = factorial(n);
float sum2 = count(n);
//将得到的分子分母进行相除，就可以得到概率了。
float result1 = (sum2/sum1)*100;
System.out.println(String.format("%.2f", result1) + "%");
}
}

public static float count(int n) {
if(n==1){
return 0;
}else if(n==2){
return 1;
}else{
return (n-1)*(count(n-1)+count(n-2));
}
}

public static float factorial(int num) {
float result = 1;
if(num==0){
return 1;
}else if (num > 0) {
result = num * factorial(num - 1);
}
return result;
}
}
