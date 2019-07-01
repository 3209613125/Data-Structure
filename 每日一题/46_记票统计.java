输入候选人的人数，第二行输入候选人的名字，第三行输入投票人的人数，第四行输入投票。



输出描述:
每行输出候选人的名字和得票数量。

示例1
输入
4
A B C D
8
A B C D E F G H
输出
A : 1
B : 1
C : 1
D : 1
Invalid : 4

import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n=sc.nextInt();
            LinkedHashMap<String, Integer> map=new LinkedHashMap<String, Integer>();
            for(int i=0;i<n;i++) {
                map.put(sc.next(), 0);
            }
            int Invalid=0;
            int m=sc.nextInt();
            for(int i=0;i<m;i++) {
                String str=sc.next();
                if(map.containsKey(str)) {
                    map.put(str, map.get(str) + 1);
                }
                else{
                    Invalid++;
                }
            }
            Object[] objects=map.keySet().toArray();
            for(int i=0;i<objects.length;i++) {
                System.out.println(objects[i]+" : "+map.get(objects[i]));
            }
            System.out.println("Invalid"+" : "+Invalid);
        }
    }
}
