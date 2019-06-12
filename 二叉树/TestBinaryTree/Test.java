import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;


public class TestDemo {

    public static void main(String[] args) {
        TestBinaryTree testBinaryTree = new TestBinaryTree();

        TestBinaryTree.TreeNode root =
                testBinaryTree.createTestTree("ABC##DE#G##F###");
        testBinaryTree.binaryTreePrevOrder(root);
        System.out.println();
        testBinaryTree.binaryTreePrevOrderNonR(root);
        System.out.println("================");
        testBinaryTree.binaryTreeInOrder(root);
        System.out.println();
        testBinaryTree.binaryTreeInOrderNonR(root);
        System.out.println("================");
        testBinaryTree.binaryTreePostOrder(root);
        System.out.println();
        testBinaryTree.binaryTreePostOrderNonR(root);
        System.out.println("================");
        System.out.println(testBinaryTree.getSize(root));
        System.out.println(testBinaryTree.getLeafSize(root));
        System.out.println(testBinaryTree.getKLevelSize(root,3));
        System.out.println(testBinaryTree.find(root,'C').value);
        testBinaryTree.binaryTreeLevelOrder(root);
    }

    public static void main1(String[] args) {
        TestHeap testHeap = new TestHeap();
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        testHeap.initHeap(array);
        testHeap.show();
        testHeap.pushHeap(11);
        testHeap.show();
        testHeap.popHeap();
        testHeap.show();
        testHeap.HeapSort();
        testHeap.show();
    }
}
