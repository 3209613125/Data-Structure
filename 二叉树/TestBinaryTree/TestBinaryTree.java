import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class TestBinaryTree {
    class TreeNode{
        char value;
        TreeNode left;
        TreeNode right;
        public TreeNode(char value){
            this.value = value;
        }
    }
    public int i = 0;
    //根据字符串创建二叉树
    TreeNode createTestTree(String s){
        TreeNode root = null;
        if(s.charAt(i) != '#'){
            root = new TreeNode(s.charAt(i));
            i++;
            root.left = createTestTree(s);
            root.right = createTestTree(s);
        }else {
            i++;
        }
        return root;
    }

    //二叉树的前序遍历
    void binaryTreePrevOrder(TreeNode root){
        if(root == null) {
            return;
        }
        System.out.print(root.value+" ");
        binaryTreePrevOrder(root.left);
        binaryTreePrevOrder(root.right);

    }

    //二叉树的中序遍历 左 根 右
    void binaryTreeInOrder(TreeNode root){
        if(root == null) {
            return;
        }
        binaryTreeInOrder(root.left);
        System.out.print(root.value+" ");
        binaryTreeInOrder(root.right);
    }

    //二叉树的后序遍历
    void binaryTreePostOrder(TreeNode root){
        if(root == null) {
            return;
        }
        binaryTreePostOrder(root.left);
        binaryTreePostOrder(root.right);
        System.out.print(root.value+" ");
    }
    // 结点个数
    int getSize(TreeNode root){
        if(root == null) {
            return 0;
        }
        return getSize(root.left)+getSize(root.right)+1;
    }

    // 叶子结点个数
    int getLeafSize(TreeNode root){
        if(root == null) {
            return 0;
        }
        if(root.left == null && root.right==null){
            return 1;
        }
        return getLeafSize(root.left)+
                getLeafSize(root.right);
    }
    // 第 k 层结点个数
    int getKLevelSize(TreeNode root, int k){
        if(root == null) {
            return 0;
        }else if(k == 1){
            return 1;
        }
       return getKLevelSize(root.left,k-1)+
                getKLevelSize(root.right,k-1);
    }
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
    int height(TreeNode root){
        if(root == null) {
            return 0;
        }else {
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            return leftHeight > rightHeight ? leftHeight+1:
                    rightHeight+1;
        }
        /**
         * height(root.left) > height(root.right) ?
         * height(root.left) + 1 : height(root.right) + 1;
         */
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
    //二叉树的层序遍历
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
}
