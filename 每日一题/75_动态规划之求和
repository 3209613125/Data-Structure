import java.util.ArrayList;
import java.util.Scanner;

class TestDemo2{
    static ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int count = scanner.nextInt();
            int n = scanner.nextInt();
            find_sum(1,count,n);
            for (ArrayList l: res){
                for (int i = 0;i < l.size();i++){
                    System.out.print(l.get(i)+" ");
                }
                System.out.println();
            }

        }
    }

    public static void find_sum(int index,int count,int n){
        if (count == 0){
            res.add(new ArrayList<>(list));
        }
        for (int i = index;i <= count && i<=n;i++){
            list.add(i);
            find_sum(i+1,count-i,n);
            list.remove(list.size()-1);
        }
    }

}
