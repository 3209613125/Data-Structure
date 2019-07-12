import java.util.*;
 class Binarytree {

     class TreeNode{
         char value;
         TreeNode left;
         TreeNode right;

         public TreeNode(char value) {
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

     TreeNode find(TreeNode root,int value){
         if(root==null){
             return null;
         }
         if(root.value==value){
             return root;
         }
         TreeNode ret = find(root.left,value);
         if(ret!=null){
             return  ret;
         }


         ret = find(root.right,value);
         if(ret!=null){
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
     public int binaryTreeComplete(Node root) {
         Queue<Node> queue = new LinkedList<Node>();
         if(root != null) {
             queue.add(root);//offer
         }
         while(!queue.isEmpty()) {
             Node cur = queue.peek();
             queue.poll();
             if(cur != null) {
                 queue.add(cur.left);
                 queue.add(cur.right);
             }else {
                 break;
             }
         }
         while(!queue.isEmpty()) {
             Node cur = queue.peek();
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
