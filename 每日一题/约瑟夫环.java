//1
import java.util.LinkedList;

 class MonkeyKing{
    public static void main(String[] args) {
        LinkedList<Integer> monkeys = new LinkedList<Integer>(){{
            for (int i = 1; i <= 100; i++)
                add(i);
        }
        };
        int count = 15;
        int i = -1;
        while (count > 1){
            int temp = i + 7;
            if (temp >= count)
                temp = temp % count;
            monkeys.remove(temp);
            count--;
            i = --temp;
        }
        System.out.println(monkeys.get(0));
    }
}




//2
import java.util.ArrayList;
 class MonkeyKing {
    public int selectKing(ArrayList list){
        int k=0;//报数的猴子的索引
        int count=1;// 报的数
        //当猴子有两只或两只以上时时
        while(list.size()>1){
            //报到7的猴子出局
            if(count%7==0){
                System.out.println("第"+(Integer)list.get(k)+"只猴子出局");
                list.remove(k);
                if(k>list.size()-1) k=0; //出局的是末尾的猴子，从头开始
                count=1;
            }else{
                count++;
                if(k<list.size()-1) k++;
                else k=0; //报到了末尾的那只猴子，从头开始
            }
        }
        return (Integer)list.get(0);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayList mylist=new ArrayList();
        for(int i=1;i<=15;i++)
            mylist.add(i);
        MonkeyKing mk=new MonkeyKing();
        System.out.println("大王是第"+mk.selectKing(mylist)+"只猴子");
    }
}




//3
 class Test
{
    public static void main(String[]args)
    {
        //功能：定义数组并向每个下标赋值
        int[] arr = new int[15];
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = i;
        }

        //调用example方法，并由arr接收返回值
        int[] arr1 = example(arr);

        //打印arr[0]的原因：因为arr数组接收example的返回值后arr的长度为1。
        System.out.println("大王是编号为："+arr1[0]+"的猴子");
    }

    public static int[] example(int[] arr)
    {
        int counter = 0;

        while(arr.length!=1)
        {
            int a = 0;//用于记录每一次循环时对arr操作的次数

            //功能：将报数为7的元素变成无效元素
            for(int i=0; i<arr.length; i++)
            {
                counter++;
                if(counter==7)
                {
                    System.out.println("Test: 即将删除"+arr[i]);
                    arr[i] = 0;
                    counter = 0;
                    a++;
                }
            }

            //功能：将arr中存储无效元素的下标删除
            int[] newarr = new int[arr.length-a];
            int index = 0;
            for(int i=0; i<arr.length; i++)
            {
                if(arr[i]!=0)
                {
                    newarr[index++] = arr[i];
                }
            }
            arr = newarr;
        }
        return arr;
    }
}
