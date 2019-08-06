//在判断上层结点的时候，会多次重复遍历下层结点，增加了不必要的开销。如果改为从下往上遍历，
//如果子树是平衡二叉树，则返回子树的高度；如果发现子树不是平衡二叉树，则直接停止遍历，
//这样至多只对每个结点访问一次。

public class Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
     return getdepth(root)!=-1;
        }
      public int getdepth(TreeNode root){
          if(root == null){
              return 0;
          }
          int left = getdepth(root.left);
          if(left == -1) return -1;
          int right = getdepth(root.right);
          if(right == -1) return -1;
          return Math.abs(left-right)> 1 ? -1 : 1 + 
              Math.max(left , right);   
      }
}
