     //判断是否为平衡二叉树，左右子树的高度之差不超过 "1"(大根本身是平衡二叉树，左右子树也必须是平衡二叉树)
     public boolean isBanlanced(TreeNode root){
         if(root==null){
             return  true;
         }
         else{
             int leftHeight = getHeight(root.left);
             int rightHeight = getHeight(root.right);
             return Math.abs(leftHeight-rightHeight)<2
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

