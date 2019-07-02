//斐波那契数列
//1 1 2 3 5 8
//n=(n-1)+(n-2)
//打印20以内斐波那契数列


class Main{
    public static void main(String[] args) {
        for(int i = 1;i<=20;i++){
            System.out.print(feibo(i)+" ");

        }
    }
    public static int feibo(int num){
        if(num==1||num==2){
            return 1;
        }
        return feibo(num-1)+feibo(num-2);
    }
}
