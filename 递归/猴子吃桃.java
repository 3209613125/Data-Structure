//题目：猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个
//第二天早上又将剩下的桃子吃掉一半，又多吃了一个
//以后每天早上都吃了前一天剩下   的一半零一个。到第10天早上想再吃时，见只剩下一个桃子了。
//求第一天共摘了多少。
//n,n/2,n/2-1,...,1
public class Main{
    public static void main(String[] args) {
        System.out.println(eat(10));
    }
    public static int eat(int day){
        if(day== 10){
            return  1;
        }
        //10:1 (1+1)*2 (4+1)*2
        else{
            return (1+eat(day+1))*2;
        }
    }
}


//方法2 循环
class Test {
    public static void main(String[] args) {
        int sum = 0, remain = 1;
//每天吃剩的桃子加一个正好是前一天桃子的一半，每天桃子的总数就是前一天剩下桃子的数量
        for (int day = 9; day >= 1; day--) {
            sum = (remain + 1) * 2;
            remain = sum;
            System.out.println("第" + day + "天还剩" + remain + "个桃子");
        }
        System.out.println(sum);
    }
}
