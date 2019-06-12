package www.bittech;

/**
 * @Information:
 * @Author: HeHaoYuan
 * @Date: Created at 11:34 on 2019/6/12
 * @Package_Name: www.bittech
 */


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

//层序遍历递归版本
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
//层序遍历递归调用函数
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


}

class Test{
    public static void main(String[] args) {
        Binarytree binarytree =new Binarytree();
        Binarytree.TreeNode root = binarytree.creatTesttree("ABC##DE#G##F###");
        binarytree.BTreeLevelOrder(root);
        System.out.println();
        System.out.println("-----------------");
        binarytree.binaryTreePrevOrder(root);


    }
}
