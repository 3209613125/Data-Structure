题目如下：假设有N瓶水(当然N>0吧)
每喝一瓶后可以得到的一个空瓶子
而 每3个空瓶子又能换1瓶水，喝掉以后又得到一个空瓶子，

问题是，你总共能喝多少瓶水，最后还剩余多少个空瓶子？
假设有1000瓶水：

非递归：

class Main {
    public static void main(String[] args) {
        int buttle;
        int emptybuttle = 0;
        int count = 0;

        for (buttle = 1000; buttle != 0; buttle--) {
            count++;
            emptybuttle++;
            if (emptybuttle == 3) {
                emptybuttle = 0;
                buttle++;
            }
        }
        System.out.println(buttle);
        System.out.println(emptybuttle);
        System.out.println(count);class Main {
    public static void main(String[] args) {
        int buttle = 8000;
        int emptybuttle = 0;
        int count1 = 0;
        System.out.println(count(emptybuttle, buttle, count1));

    }
    public static int count(int emptybuttle,int buttle,int count1){
//        buttle--;
//        emptybuttle++;
//        count1++;

        if (buttle==0&&emptybuttle==2){
            return count1;
        }
        if (emptybuttle == 3){
            emptybuttle = 0;
            buttle++;
        }
        return count(emptybuttle+1,buttle-1,count1+1);


    }



}

    }
}

递归：
