import java.util.Scanner;
        import java.util.LinkedList;

public class Main{
    public static void main(String[] args){
        Scanner In = new Scanner(System.in);
        while(In.hasNext()){
            int num = In.nextInt();
            int ascOrDesc = In.nextInt();
            LinkedList<String>[] lists = new LinkedList[101];
            for(int i = 0;i<num;i++){
                String name = In.next();
                int grade = In.nextInt();
                if(lists[grade]==null){
                    lists[grade] = new LinkedList<>();

                }
                lists[grade].addLast(name);
            }
            if(ascOrDesc==1){
                for(int i = 0;i<=100;i++){
                    if(lists[i]!=null){
                        while(!lists[i].isEmpty()){
                            System.out.println(lists[i].pollFirst() + " "+i);
                        }
                    }
                }

            }else{
                for(int i = 100;i>=0;i--){
                    if(lists[i]!=null){
                        while (!lists[i].isEmpty()){
                            System.out.println(lists[i].pollFirst()+" "+ i);
                        }
                    }
                }
            }
        }
    }
}
