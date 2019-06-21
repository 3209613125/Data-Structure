//二叉树的公共节点
public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
         if(root==null){
             return  null;
         }
         if(root==p||root==q){
             return  root;
         }
         TreeNode leftTree = lowestCommonAncestor(root.left,p,q);
         //p||q null
         TreeNode rightTree = lowestCommonAncestor(root.right,p,q);
         //p||q null
         //3
         if(leftTree!=null && rightTree!=null){
             return root;
         }
         //左边找到
         else if (leftTree!=null ){
             return leftTree;
         }
         //右边找到
         else if(rightTree!=null){
             return  rightTree;
         }
         //都没找到的情况下
         return null;
}
