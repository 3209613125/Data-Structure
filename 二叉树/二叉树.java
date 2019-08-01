package www.hhy;


import java.beans.beancontext.BeanContextChild;
import java.util.*;
 class Binarytree {

     class TreeNode{
         int value;
         TreeNode left;
         TreeNode right;

         public TreeNode(int value) {
             this.value = value;
         }
     }


     //用递归创建二叉树
     public int i = 0;
     TreeNode creatTesttree(String s){
         TreeNode root = null;
         if (s.charAt(i)!='#') {
             root = new TreeNode(s.charAt(i));
             i++;
             root.left = creatTesttree(s);
             root.right = creatTesttree(s);
         }
         else{
             i++;
         }
         return  root;
     }


     //二叉树的前序遍历递归
     void binaryTreePrevOrder(TreeNode root){
         if(root==null){
             return;
         }
         System.out.println(root.value+" ");
         binaryTreePrevOrder(root.left);
         binaryTreePrevOrder(root.right);
     }


     //二叉树的中序遍历递归
     void binaryTreeInOrder(TreeNode root){
         if(root==null){
             return;
         }
         binaryTreeInOrder(root.left);
         System.out.println(root.value+" ");
         binaryTreeInOrder(root.right);

     }

     //二叉树的后续遍历递归
     void binaryTreePostOrder(TreeNode root){
         if(root==null){
             return;
         }
         binaryTreePostOrder(root.left);
         binaryTreePostOrder(root.right);
         System.out.println(root.value+" ");
     }

//层序遍历
     void binaryTreeLevelOrder(TreeNode root,int level){
         if(root ==null||level<1){
             return;
         }
         if(level==1){

                 System.out.print(root.value+" ");


         }

         binaryTreeLevelOrder(root.left,level-1);
         binaryTreeLevelOrder(root.right,level-1);
     }

     void BTreeLevelOrder(TreeNode root)
     {
         if (root == null)
             return;
         int dep = getHeight(root);
         for (int i = 1; i <= dep; i++)
         {
            binaryTreeLevelOrder(root,i);
         }

     }



     //二叉树的层序遍历 非递归
     void binaryTreeLevelOrder(TreeNode root) {
         Queue<TreeNode> queue = new LinkedList<>();
         if(root != null) {
             queue.offer(root);
             //LinkedList  offer  add
         }
         while (!queue.isEmpty()) {
             //1、拿到队头的元素 把队头元素的左右子树入队
             TreeNode cur = queue.poll();
             System.out.print(cur.value+" ");
             //2、不为空的时候才能入队
             if(cur.left != null) {
                 queue.offer(cur.left);
             }
             if(cur.right != null) {
                 queue.offer(cur.right);
             }
         }
     }

     //二叉树的前序遍历非递归
     void binaryTreePrevOrderNonR(TreeNode root){
         Stack<TreeNode> stack = new Stack<>();
         TreeNode cur = root;
         TreeNode top = null;
         while (cur != null || !stack.empty()) {
             while (cur != null) {
                 stack.push(cur);
                 System.out.print(cur.value + " ");
                 cur = cur.left;
             }
             top = stack.pop();
             cur = top.right;
         }
         System.out.println();
     }
     //二叉树的中序遍历非递归
     void binaryTreeInOrderNonR(TreeNode root){
         Stack<TreeNode> stack = new Stack<>();
         TreeNode cur = root;
         TreeNode top = null;
         while (cur != null || !stack.empty()) {
             while (cur != null) {
                 stack.push(cur);
                 cur = cur.left;
             }
             top = stack.pop();
             System.out.print(top.value+" ");
             cur = top.right;
         }
         System.out.println();
     }
     //二叉树的后序遍历非递归
     void binaryTreePostOrderNonR(TreeNode root) {
         Stack<TreeNode> stack = new Stack<>();
         TreeNode cur = root;
         TreeNode prev = null;
         while (cur != null || !stack.empty()) {
             while (cur != null) {
                 stack.push(cur);
                 cur = cur.left;
             }
             cur = stack.peek();//L  D
             //cur.right == prev 代表的是 cur的右边已经打印过了
             if(cur.right == null || cur.right == prev) {
                 stack.pop();
                 System.out.println(cur.value);
                 prev = cur;
                 cur = null;
             }else {
                 cur = cur.right;
             }
         }
     }


     //二叉树的节点个数递归
     int getSize(TreeNode root){
         if(root==null){
             return 0;
         }
         return  getSize(root.left)+getSize(root.right)+1;
     }


     //二叉树的叶子节点的个数递归
     int getLeafSize(TreeNode root){
         if(root==null){
             return  0;
         }
         if(root.left==null && root.right==null){
             return 1;
         }
         return getLeafSize(root.left)+getLeafSize(root.right);

     }


     //二叉树得到第K层结点的个数

     int getKlevelSize(TreeNode root ,int k){
         if(root==null){
             return 0;
         }

          if(k == 1){
             return 1;
         }
         return  getKlevelSize(root.left,k-1)+getKlevelSize(root.right,k-1);
     }
     //二叉树查找并返回该结点递归
     // 查找，依次在二叉树的 根、左子树、
     // 右子树 中查找 value，如果找到，返回结点，否则返回 null
     TreeNode find(TreeNode root, int value){
         if(root == null) {
             return null;
         }
         if(root.value == value){
             return root;
         }
         TreeNode ret = find(root.left,value);
         if(ret != null) {
             return ret;
         }
         ret =  find(root.right,value);
         if(ret != null) {
             return ret;
         }
         return null;
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



     //判断一个树是不是完全二叉树
     public int binaryTreeComplete(TreeNode root) {
         Queue<TreeNode> queue = new LinkedList<TreeNode>();
         if(root != null) {
             queue.add(root);//offer
         }
         while(!queue.isEmpty()) {
             TreeNode cur = queue.peek();
             queue.poll();
             if(cur != null) {
                 queue.add(cur.left);
                 queue.add(cur.right);
             }else {
                 break;
             }
         }
         while(!queue.isEmpty()) {
             TreeNode cur = queue.peek();
             if (cur != null){
                 //说明不是满二叉树
                 return -1;
             }else{
                 queue.poll();
             }
         }
         return 0;//代表是完全二叉树
     }



     //检查两棵树是否是相同的，如果两棵树结构相同，并且在结点上的值相同，那么这两棵树是相同返回true
     public  boolean isSameTree(TreeNode p,TreeNode q){
         if((p==null&&q!=null)||(p!=null&&q==null)){
    return false;


         }
         if(p==null && q==null){
             return  true;

         }
         if(p.value!=q.value){
             return  false;
         }
         return isSameTree(p.left,q.left)&&isSameTree(p.right,q.left);
     }


     //检查是否为子树
     public boolean isSubTree(TreeNode s,TreeNode t){
         if(s==null||t==null){
             return  false;
         }
         if(isSameTree(s,t)){
             return true;
         }
         else if (isSubTree(s.left,t)){
             return  true;

         }
         else if(isSubTree(s.right,t)){
             return true;
         }
         else{
             return false;
         }
     }

     //1.判断是否为平衡二叉树，左右子树的高度之差不超过 "1"(大根本身是平衡二叉树，左右子树也必须是平衡二叉树)
     // 时间复杂度为n^2
     //2.求复杂度为O(n)的解法
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



     //判断是否为对称二叉树
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




      //二叉树创建字符串 非递归写法
     public String tree2str(TreeNode t){
         StringBuilder sb = new StringBuilder();
         tree2strchild(t,sb);
         return  sb.toString();

     }
     public void tree2strchild(TreeNode t ,StringBuilder sb){
         if (t==null){
             return;
         }
         sb.append(t.value);
         if (t.left!=null){
             sb.append("(");
             tree2strchild(t.left,sb);
             sb.append(")");
         }
         else {
             if (t.right==null){

             }
         }
     }



//二叉树字符串 递归写法
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



         public int rob(TreeNode root) {
             if (root == null) return 0;
             return Math.max(robOK(root), robNG(root));
         }

         private int robOK(TreeNode root) {
             if (root == null) return 0;
             return root.value + robNG(root.left) + robNG(root.right);
         }

         private int robNG(TreeNode root) {
             if (root == null) return 0;
             return rob(root.left) + rob(root.right);
         }




//二叉树的公共祖先
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






     //根据一棵树的中序遍历与后序遍历构造二叉树



 }

class Test{
    public static void main(String[] args) {
        Binarytree binarytree =new Binarytree();
        Binarytree.TreeNode root =// binarytree.creatTesttree("ABC##DE#G##F###");
                binarytree.creatTesttree("AB##C##");


        binarytree.BTreeLevelOrder(root);
        System.out.println();
        System.out.println("-----------------");
        binarytree.binaryTreePrevOrder(root);


    }
}

