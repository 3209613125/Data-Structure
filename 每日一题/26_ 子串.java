给定一个字符数组和它的长度，再给定一个字符串，判断该字符串是否为字符数组的子串
//题目无难度，但要清楚 字符串.contains()方法返回的是一个布尔值

 class Substr {
     public static void main(String[] args) {
         String[] p = new String[]{"res","tre","yes"};
         int n = 3;
         String s = "yes";
       for (boolean b:  chkSubStr(p,n,s)){
           System.out.println(b);
       }
     }

    public static boolean[] chkSubStr(String[] p, int n, String s) {
        // write code here
        boolean[] res = new boolean[n];
        for(int i = 0;i < n;i++){
            res[i] = s.contains(p[i]);
        }

        return res;
    }
}
