//模拟斗地主的洗牌，发牌，看牌
public class poker {
    public static void main(String[] args) {
        //拼接花色和数字
        String[] color = {"方片","红桃","梅花","黑桃"};
        String[] num = {"3","4","5","6","7","8","9","10","J","Q","K","A","2",};


        HashMap<Integer,String> hm = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();//存储索引，方便洗牌
        int index = 0;
        //拼接扑克牌，并将索引和扑克牌存储在HashMap中
        for (String s1 : num){
            for (String s2 : color){
                hm.put(index,s2.concat(s1));
                list.add(index);
                index++;
            }
        }
        hm.put(index,"小王");
        list.add(index);
        index++;
        hm.put(index,"大王");
        list.add(index);
        //洗牌
        Collections.shuffle(list);
        //发牌
        TreeSet<Integer> py1 = new TreeSet<>();
        TreeSet<Integer> py2 = new TreeSet<>();
        TreeSet<Integer> py3 = new TreeSet<>();
        TreeSet<Integer> dp = new TreeSet<>();
        for (int i = 0;i < list.size(); i++){
            if (i >= list.size()-3){
                dp.add(list.get(i));
            }
            else if (i % 3 == 0){
                py1.add(list.get(i));
            }
            else if (i % 3 == 1){
                py2.add(list.get(i));
            }
            else{
                py3.add(list.get(i));
            }
        }

        //看牌
        lookPoker(hm,py1,"玩家1");
        lookPoker(hm,py2,"玩家2");
        lookPoker(hm,py3,"玩家3");
        lookPoker(hm,dp,"底牌");

    }
    public static void lookPoker(HashMap<Integer,String> hm,TreeSet<Integer> ts,String name){
        System.out.println(name+"是:");
        for (Integer i : ts){ //i代表双列集合中的每一个键
            System.out.print(hm.get(i)+" ");
        }
        System.out.println();
    }

}





----------------------------------------------------------------------------------------------------------------------------
    
    
    
    
    
    
    
    public class poker {
    public static void main(String[] args) {
        //拼接花色和数字
        String[] color = {"方片","红桃","梅花","黑桃"};
        String[] num = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

        HashMap<Integer,String> poker = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int index = 0;
        for (String s1 : num){
            for (String s2 : color){
                poker.put(index,s2.concat(s1));
                list.add(index);
                index++;
            }
        }
        poker.put(index,"小王");
        list.add(index);
        index++;
        poker.put(index,"大王");
        list.add(index);

        Collections.shuffle(list);


        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();
        TreeSet<Integer> dipai = new TreeSet<>();

        //发牌
        for (int i = 0;i < poker.size();i++){
            if (i >= poker.size()-3){
                dipai.add(list.get(i));
            }
           else if (i % 3 == 0){
                player1.add(list.get(i));
            }
            else if (i % 3 == 1){
                player2.add(list.get(i));
            }
           else {
                player3.add(list.get(i));
            }
        }

        //显示牌
        lookPai(poker,player1,"玩家一");
        lookPai(poker,player2,"玩家二");
        lookPai(poker,player3,"玩家三");
        lookPai(poker,dipai,"底牌");


    }
    public static void lookPai(HashMap<Integer,String> poker,TreeSet<Integer> player,String name){
        System.out.println(name+"是:");
        for (int i : player){
            System.out.print(poker.get(i)+" ");
        }
        System.out.println();

    }


}
