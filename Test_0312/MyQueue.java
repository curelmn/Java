package Test_0321;
import java.util.Stack;

class MyQueue {
    Stack<Integer> A = new Stack<>();
    Stack<Integer> B = new Stack<>();

    /** Initialize your data structure here. */
    public MyQueue() {

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        // 入队列的时候, 需要先把 B 中的元素都倒腾到 A 中, 再往 A 中插入新元素
        while (!B.isEmpty()) {
            int tmp = B.pop();
            A.push(tmp);
        }
        A.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (A.isEmpty() && B.isEmpty()) {
            return 0;
        }
        // 把 A 中的元素往 B 中倒腾. 剩下的最后一个元素就是要被出队列的元素
//        while (A.size() > 1) {
//            int tmp = A.pop();
//            B.push(tmp);
//        }
//        // 此时取到的就是 A 的最后一个元素, 也就是队首元素
//        int ret = A.pop();

        // 使用上面的代码, 在进行连续多次 pop / peek 的时候会存在问题.
        // 为了更优雅的解决这个问题, 换个角度, 先把 A 的所有元素都倒腾到 B 中, 然后再通过 B 进行 pop
        while (!A.isEmpty()) {
            int tmp = A.pop();
            B.push(tmp);
        }
        // 删除 B 中的元素
        return B.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (A.isEmpty() && B.isEmpty()) {
            return 0;
        }
        while (!A.isEmpty()) {
            int tmp = A.pop();
            B.push(tmp);
        }
        // 删除 B 中的元素
        return B.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return A.isEmpty() && B.isEmpty();
    }

    public static void main(String[] args) {
        // 尝试在本地重现刚才的问题.
        // 按照人家给的用例, 一步一步操作下来, 看看是不是会有一样的现象.
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        int ret = myQueue.peek();
        System.out.println("ret = " + ret);
        ret = myQueue.pop();
        System.out.println("ret = " + ret);
        boolean isEmpty = myQueue.empty();
        System.out.println(isEmpty);
    }
}
