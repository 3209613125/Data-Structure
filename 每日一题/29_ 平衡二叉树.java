//递归
public class Solution {
    
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root == null){
            return true;
        }
        int leftH = getHeight(root.left);
        int rightH = getHeight(root.right);
        if(Math.abs(leftH-rightH)>1){
            return false;
        }
            return IsBalanced_Solution(root.left)&&IsBalanced_Solution(root.right);
        
    }
    
    //获取二叉树的高度
    public int getHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        return leftHeight > rightHeight ? leftHeight+1:rightHeight+1;
    }
    
   
}
