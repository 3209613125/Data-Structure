public class Main {
    public static void main(String[] args) {
        System.out.println("富人"+_return(30+1));
        System.out.println("陌生人"+100000*30);

    }
    public static int _return(int day){

        if(day==1){
            return 1;
        }

     return _return(day-1)*2;
    }
}
