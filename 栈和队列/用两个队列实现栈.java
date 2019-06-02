import java.util.LinkedList;
import java.util.Queue;

public class TestMyStack {

    private Queue<Integer> queue1;
    private Queue<Integer> queue2;
    private int usedSize;

    /** Initialize your data structure here. */
    public TestMyStack() {
        this.queue1 = new LinkedList<>();
        this.queue2 = new LinkedList<>();
        this.usedSize = 0;
    }

    /** Push element x onto stack. */
    //入到不为空的队列
    public void push(int x) {
        if(!queue1.isEmpty()) {
            queue1.add(x);
        }else if(!queue2.isEmpty()) {
            queue2.add(x);
        }else {
            queue1.add(x);
        }
       this.usedSize++;
    }

    /** Removes the element on top of the stack and returns that element. */
    //从不为空的队列中删除
    public int pop() {
        int data = 0;
        if (!queue1.isEmpty()) {
            for (int i = 1; i <= usedSize-1; i++) {
                queue2.add(queue1.poll());
            }
            data = queue1.poll();
        }else {
            for (int i = 1; i <= usedSize-1; i++) {
                queue1.add(queue2.poll());
            }
            data = queue2.poll();
        }
        this.usedSize--;
        return data;
    }

    /** Get the top element. */
    public int top() {
        if (empty()) {
            throw new UnsupportedOperationException("无数据");
        }
        int data = 0;
        if (!queue1.isEmpty()) {
            for (int i = 0; i < this.usedSize; i++) {
                data = queue1.poll();
                queue2.add(data);
            }
        }else {
            for (int i = 0; i < this.usedSize; i++) {
                data = queue2.poll();
                queue1.add(data);
            }
        }
        return data;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return this.usedSize == 0;
    }
}
