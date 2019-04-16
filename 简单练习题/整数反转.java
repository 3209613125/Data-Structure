import java.lang.Math;
class Change{
    public void fun(int num){
        int[] number = new int[32];
        double var ;
        int i = 0;
        double result = 0;
        for (;i <= 31;i++){
            number[i] = num%10;//;将传入数的每一位分别赋值给数组元素
            int ss=number[i];
            System.out.println(i+":"+ss);
            num = num/10;
            int sss=num;
            System.out.println(i+":"+sss);
            System.out.println("******");
            if(num==0)//为0时说明已将该数的最高位剥离赋值给了数组元素
                break;
        }

        for(int j = 0;j - i <= j;j++){
            var = number[i];
            var = var*Math.pow(10,j);//将数组元素对应放置在他的“权”上，并将元素相加输出
            //（如123的1在百位 在变为321时在个位）
            result = var+result;
            i--;
        }
        System.out.println((int)result);
    }
}
class Exchange_text {
    public static void main(String[] args) {
        Change change = new Change();
        change.fun(-123465488);

    }
}



--------------------------------------------------------------------
//低级版本
import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        System.out.println("最大值:"+Integer.MAX_VALUE);
        System.out.println("最小值:"+Integer.MIN_VALUE);
        System.out.println("请输入:");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        function(i);

    }
    public static int function(int i) {
        int[] data = new int[1000];
        for (int k = 0; k < data.length; k++) {
            if(i>0){
                data[k] = i % 10;
                i = i / 10;
                if (i < 10) {
                    data[k + 1] = i;
                    for(int l:data){
                            System.out.print(l+"");
                            if(l==data[k+1]){
                                break;
                        }
                    }
                    break;
                }
            }
            if(i<0){
                System.out.print("-");
            }
            if(i<0){
                i=(i>0)?i:-i;
                data[k] = i % 10;
                i = i / 10;
                if (i < 10) {
                    data[k + 1] = i;
                    for(int l:data){
                        System.out.print(l+"");
                        if(l==data[k+1]){
                            break;

                        }

                    }
                    break;
                }
            }

        }
return  1;
    }
}
