import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Main{


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

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> levelList = new LinkedList<>();
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                levelList.add(node.value);
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            result.add(levelList);
        }
        return result;
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 1;
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> levelList = new LinkedList<>();
            while (levelSize-- > 0) { // to deal with level nodes
                TreeNode node = queue.poll();
                levelList.add(node.value);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            if (level % 2 == 0) // be stack order when level is even
                Collections.reverse(levelList);
            result.add(levelList);
            level++;
        }
        return result;
    }
}
class Test{
    public static void main(String[] args) {
        Main main = new Main();
        Main.TreeNode root = main.creatTesttree("AB##C##");
        System.out.println(main.levelOrder(root));
        System.out.println(main.zigzagLevelOrder(root));


    }
}
