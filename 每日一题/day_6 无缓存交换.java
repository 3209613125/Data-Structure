/**
* @Author: HeHaoYuan
* @Date: 2019/6/2
* @Description:   


*/
//无缓存交换

//这道题是一个很经典的不使用额外空间进行两个数交换的经典问题。可以尝试使用加减法或者位运算来
//解决此问题。
//【解题思路】：
//下面给出位运算的理论计算基础: x ^ x == 0 x ^ 0 == x
//设M，N是常数，且a=M，b=N，则交换使用异或运算交换a和b的过程如下： a = a^b=M^N; b = a^b =
//M^N^N = M^0 = M;//b交换成功 a = a^b = M^N^M = M^M^N = 0^N = N;//a交换成功

class Exchange{
    public static void main(String[] args) {
        int[] AB = new int[]{7,9};
        AB(AB);
        for (int data:AB){
            System.out.println(data);
        }

    }


    public static int[] AB(int[] AB){
        AB[0]^=AB[1];
        AB[1]^=AB[0];
        AB[0]^=AB[1];

        return AB;
    }
}
