//动态规划青蛙跳台阶 动态规划
//一次可以跳到1到n阶台阶，跳到n阶的多少种跳法
//状态：跳到i级台阶的方法数  从f1到fn-1 假设已经求出来 ，可以一次跳完，也可以跳1   -  n-1组合
//第一步跳1级，剩下i-1有多少种方法？1，f(i-1)  2,f(i-2) 3,f(i-3) n,f(i-n)
//f(i) = f(i-1)+f(i-2)+f(i-3)+...+f(1)
//f(i-1) = f(i-2)+f(i-3)+f(i-4)+...+f(1)
//f(i) = 2*f(i-1)

//初始状态:f(1)=1
//返回结果:f(n)
//前面的n-1次台阶都有两种选择，跳或者不跳，最后一级必须跳,2^n-1*1

class Test2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();
        int n = scanner.nextInt();
        System.out.println(main.jump(n));
        //前面的n-1次台阶都有两种选择，跳或者不跳，最后一级必须跳,2^n-1*1
        System.out.println((int) Math.pow(2,n-1));
        System.out.println(1<<n-1);
    }
}

class Main{
    public  int jump(int n){
        int f1 = 1;
        for (int i =2;i<=n;++i){
            f1 *= 2;
        }
        return f1;
    }
}
