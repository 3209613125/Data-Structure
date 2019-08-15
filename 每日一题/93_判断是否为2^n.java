public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int x = scanner.nextInt();
            if ((x&x-1)==0){
                System.out.println("是");
            }
            else {
                System.out.println("否");
            }
        }
        }
}
