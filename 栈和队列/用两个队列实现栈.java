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




---------------------------------------------------------------------------------------------------------
import java.util.LinkedList;
import java.util.Queue;

class MyQueue {
    private Queue<Integer> queue;
    private Queue<Integer> queue1;
    private int usedSize;


    public MyQueue() {
        this.queue = new LinkedList<>();
        this.queue1 = new LinkedList<>();
        this.usedSize = 0;
    }

    public void push(int[] data) {
        if (queue.isEmpty()) {
            for (int i = 0; i < data.length; i++) {
                queue.add(data[i]);
            }
        }
    }

    public void poll() {
        while (true) {

            while(queue.size() > 1) {
                queue1.add(queue.poll());
            }
            if (queue.size() == 1) {
                System.out.println(queue.peek());
                queue.remove();
                //System.out.println(queue.poll());;Queue的peek方法不会弹出队头元素，只会显示，不会弹出
            }

            while (queue1.size() > 1) {
                queue.add(queue1.poll());
            }
            if (queue1.size() == 1) {
                System.out.println(queue1.peek());
                queue1.remove();
                //System.out.println(queue1.poll());
            }
            if (queue.size() == 0 && queue1.size() == 0) {
                break;
            }
        }

    }
}
class TestDemo{
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        int[] data = {1,2,3,4,5};
        myQueue.push(data);
        myQueue.poll();

    }
}
