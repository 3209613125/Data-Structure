//二叉搜索树，若他的左子树不为空，左子树上的所有节点都小于根节点，
//如果他的右子树不为空，右子树上的所有节点都大于根节点
//最终他的中序排列都是有序结果
//输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
// 要求不能创建任何新的结点，只能调整树中结点指针的指向。

     TreeNode prev = null;

     public void ConvertChild(TreeNode pCur) {
         if(pCur == null) {
             return ;
         }
         ConvertChild(pCur.left);

         pCur.left = prev;
         if(prev != null)
             prev.right = pCur;

         prev = pCur;

         ConvertChild(pCur.right);
     }

     public TreeNode Convert(TreeNode pRootOfTree) {
         ConvertChild(pRootOfTree);

         TreeNode head = pRootOfTree;

         while(head != null&& head.left != null) {
             head = head.left;
         }
         return head;

     }
