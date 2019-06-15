//二叉树创建字符串
//思路是:你需要采用前序遍历的方式，将一棵二叉树转换为一个由括号及整数组成的字符串
//空结点则用一对空括号来表示"()"

//非递归完成:
class Solution {
    public String tree2str(TreeNode t) {
        StringBuilder sb = new StringBuilder();
        tree2strChild(t,sb);
        return sb.toString();
    }
    
    public void tree2strChild(TreeNode t,StringBuilder sb) {
        if(t == null) {
            return ;
        }
        sb.append(t.val);
        if(t.left != null) {
            sb.append("(");
            tree2strChild(t.left,sb);
            sb.append(")");
        }else {
           if(t.right == null) {
                return;
            }else {
                sb.append("()");
            }
        }
        if(t.right == null) {
            return;
        }else{
            sb.append("(");
            tree2strChild(t.right,sb);
            sb.append(")");
        }
    }
    
}


//递归完成：
     public String CreateStr(TreeNode t){
         if(t==null){
             return "";

         }
         if(t.left==null&&t.right==null){
             return t.value+"";
         }
         if(t.left==null){
             return t.value+"()"+"("+CreateStr(t.right)+")";
         }
         if(t.right==null){
             return t.value+"("+CreateStr(t.left)+")";
         }

         return t.value+"("+CreateStr(t.left)+")"+"("+CreateStr(t.right)+")";

     }
