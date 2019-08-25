     //判断是否为平衡二叉树，左右子树的高度之差不超过 "1"(大根本身是平衡二叉树，左右子树也必须是平衡二叉树)
     //时间复杂度为n^2
     public boolean isBanlanced(TreeNode root){
         if(root==null){
             return  true;
         }
         else{
             int leftHeight = getHeight(root.left);
             int rightHeight = getHeight(root.right);
             return Math.abs(leftHeight-rightHeight)<=1
                     &&isBanlanced(root.left)
                     &&isBanlanced(root.right);
         }
     }


  //二叉树的高度
     int getHeight(TreeNode root){
         if(root==null){
             return 0;
         }
         int leftHeight = getHeight(root.left);
         int rightHeight = getHeight(root.right);
         return leftHeight>rightHeight ? leftHeight+1:rightHeight+1;
     }


//2.复杂度为O(n)的解法:

class IsBalance{
    public int height;
    public boolean blance;
}

class Solution {
    
    public IsBalance function(TreeNode root){
       
        IsBalance ret = new IsBalance();
        ret.height = 0;
        ret.blance = true;
        
        if(root == null){
            return ret;
        }
        
        IsBalance lret = new IsBalance();
       
        lret = function(root.left);
        if(lret.blance == false){//左子树不平衡
            return lret;
        }
        
        IsBalance rret = new IsBalance();
        rret = function(root.right);
        if(rret.blance == false){//左子树不平衡
            return rret;
        }
        
        
        ret.blance = Math.abs(lret.height - rret.height) < 2;
        
        ret.height = lret.height > rret.height ? lret.height+1 : rret.height+1;
        return ret;
        
    }
    
    public boolean isBalanced(TreeNode root) {
        return function(root).blance;
    }
   
}

public class Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
        return getdepth(root) != -1;
    }
    public int getdepth(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = getdepth(root.left);
        if(left == -1){
            return -1;
        }
            int right = getdepth(root.right);
            if(right == -1){
                return -1;
            }
        return Math.abs(left-right) > 1 ? -1:1+Math.max(left,right);
        
        
    }
}
