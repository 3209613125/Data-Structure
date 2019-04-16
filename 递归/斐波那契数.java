//斐波那契数列
//0 1 1 2 3 5 8
//n=(n-1)+(n-2)
//打印20以内斐波那契数列
class Test {

    public static void main(String[] args) {
//
        feibo j=new feibo();
       for (int n = 1; n < 20; n++) {
            System.out.println(j.hh(n));
       }

    }
}
   class feibo {


     static int hh(int n) {

            if (n == 2||n==1) {
              return 1;
            } else {
        return hh(n - 2) + hh(n - 1);

        }




        }
        }
