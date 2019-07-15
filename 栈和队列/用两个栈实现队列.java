import java.util.Stack;


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


-------------------------------------------------------------------------------------------------------
    
    
    import java.util.*;

/**
 * @Information:
 * @Author: HeHaoYuan
 * @Date: Created at 16:46 on 2019/7/14
 * @Package_Name: www.hhy.java_7
 */
public class lianxi {
    public static void main(String[] args) {

        Test test = new Test();
        int[]a = {1,2,3,4,5};
        test.push(a);
        test.pop1();
        int size = test.stack1.size();
        for (int i = 0;i < size ;i++){
            System.out.print(test.stack1.pop()+" ");
        }




    }
}
class Test{
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> stack1 = new Stack<>();
    public void push(int[] a){
        for(int i = 0;i < a.length;i++){
            stack.push(a[i]);
        }

    }

    public void pop1(){
        if(stack1.isEmpty()){
            while (!stack.empty()){
                stack1.push(stack.pop());
            }
        }
    }
}
