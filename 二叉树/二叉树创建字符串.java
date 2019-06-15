//二叉树创建字符串
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
