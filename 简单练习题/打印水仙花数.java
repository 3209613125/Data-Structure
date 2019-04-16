//打印100-999水仙花数
class Test {
    public static void main(String[] args) {

        for (int num = 100; num < 1000; num++) {
                int gewei = num % 10;
                int shiwei = (num / 10) % 10;
                int baiwei = num / 100;

                    int total = gewei * gewei * gewei + shiwei * shiwei * shiwei + baiwei * baiwei * baiwei;
                    if (total == num) {
                        System.out.println(num);

                    }
                }


        }
    }
