//java桶排序算法复杂度，O(n)
//101个桶，分别保存0~100分的学生的名称，然后按照ascOrDesc打印出来
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
                
                //升序排列
            if(ascOrDesc==1){
                for(int i = 0;i<=100;i++){
                    if(lists[i]!=null){
                        while(!lists[i].isEmpty()){
                            System.out.println(lists[i].pollFirst() + " "+i);
                        }
                    }
                }

               //降序排列
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
