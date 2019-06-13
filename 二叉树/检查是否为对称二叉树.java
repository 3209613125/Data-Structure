     //判断是否为镜像二叉树



     public boolean isSymmetric(TreeNode root){
         if(root==null){
             return true;
         }
         return  isSymmetric(root.left,root.right);
     }

     public boolean isSymmetric(TreeNode lefttree,TreeNode righttree){
         if((lefttree==null && righttree!=null)||(lefttree!=null && righttree ==null)){
             return  false;
         }
         if(lefttree == null && righttree == null){
             return  true;
         }
         return lefttree.value == righttree.value && isSymmetric(lefttree.left,righttree.right)
                 && isSymmetric(lefttree.right,righttree.left);
     }
