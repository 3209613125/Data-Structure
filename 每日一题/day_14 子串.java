给定一个字符数组和它的长度，再给定一个字符串，判断该字符串是否为字符数组的子串


class Substr {
    public boolean[] chkSubStr(String[] p, int n, String s) {
        // write code here
        boolean[] res = new boolean[n];
        for(int i = 0;i < n;i++){
            res[i] = s.contains(p[i]);
        }
        return res;
    }
}




测试： class Substr {
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
