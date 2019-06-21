//给定一个二叉树的前序遍历和中序遍历，确定一棵二叉树
     /**
      * Definition for a binary tree node.
      * public class TreeNode {
      *     int val;
      *     TreeNode left;
      *     TreeNode right;
      *     TreeNode(int x) { val = x; }
      * }
      */


     /**
      * Definition for a binary tree node.
      * public class TreeNode {
      *     int val;
      *     TreeNode left;
      *     TreeNode right;
      *     TreeNode(int x) { val = x; }
      * }
      */


         public TreeNode build(int[] preorder, int[] inorder,
                               int inbegin,int inend) {
              int preindex = 0;

             //当前树 根本没有左子树或者是右子树
             if(inbegin > inend) {
                 return null;
             }

             //根据前序遍历，确定根节点
             TreeNode root = new TreeNode(preorder[preindex]);
             //在中序遍历里面 找到根节点的下标
             int rootIndex = indexOfInorder(inorder,preorder[preindex],inbegin,
                     inend);
             preindex++;

             root.left = build(preorder,inorder,inbegin,rootIndex-1);

             root.right = build(preorder,inorder,rootIndex+1,inend);

             return root;
         }

         public int indexOfInorder(int[] inorder,int val,int inbegin,int inend) {
             for(int i = inbegin;i <= inend;i++) {
                 if(inorder[i] == val) {
                     return i;
                 }
             }
             return -1;
         }

         public TreeNode buildTree(int[] preorder, int[] inorder) {
             if(preorder.length == 0 || inorder.length == 0) {
                 return null;
             }

             return build(preorder,inorder,0,inorder.length-1);
         }
