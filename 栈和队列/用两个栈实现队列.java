import java.util.Stack;

/**
 * Description: 两个栈实现一个队列
 * Author: Administrator
 * Date: 2019/6/1
 * Time: 15:32
 */
public class TestMyQueue {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
