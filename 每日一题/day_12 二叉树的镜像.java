操作给定的二叉树，将其变换为源二叉树的镜像。

输入描述:
二叉树的镜像定义：源二叉树 
    	    8
    	   /  \
    	  6   10
    	 / \  / \
    	5  7 9 11
    	镜像二叉树
    	    8
    	   /  \
    	  10   6
    	 / \  / \
    	11 9 7  5
【解题思路】
源二叉树：
8
/ \
6 10
/ \ / \
5 7 9 11
镜像二叉树：
8
/ \
10 6
/ \ / \
11 9 7 5
通过上述图示，可以看出，源二叉树镜面成像变成镜像二叉树。 一个节点的左右节点进行互换，可以通过递归来实
现。

public class Solution {
public void Mirror(TreeNode root) {
//节点为null 不处理
if(root == null)
return;
//节点的左右子节点为null(即就是节点为叶子节点）同样不处理
if(root.left == null && root.right == null)
return;
//节点的左右子节点交换
TreeNode pTemp = root.left;
root.left = root.right;
root.right = pTemp;
//递归处理
if(root.left != null)
Mirror(root.left);
if(root.right != null)
Mirror(root.right);
}
}
