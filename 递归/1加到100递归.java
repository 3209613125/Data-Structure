////递归1-100
public class Main{
    public static void main(String[] args) {
        System.out.println(sum(100));
    }
  public static int sum(int num){
        if(num==1){
            return 1;
        }
        return num + sum(num-1);
  }

}
