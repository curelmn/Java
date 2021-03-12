package Test_0321;

import java.util.Scanner;
import java.util.Stack;

class MinStack {
    // 创建两个栈.
    Stack<Integer> A = new Stack<>();
    // B 里头存的就是当前 A 的最小值.
    Stack<Integer> B = new Stack<>();

    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int x) {
        // 先把 x 插入 A 中.
        A.push(x);
        // 比较 x 和 B 的栈顶, 看谁小, 谁小就插入谁.
        if (B.isEmpty()) {
            B.push(x);
            return;
        }
        int min = B.peek();
        if (x < min) {
            min = x;
        }
        B.push(min);
    }

    public void pop() {
        if (A.isEmpty()) {
            return;
        }
        A.pop();
        B.pop();
    }

    public int top() {
        if (A.isEmpty()) {
            return 0;
        }
        return A.peek();
    }

    public int getMin() {
        if (B.isEmpty()) {
            return 0;
        }
        return B.peek();
    }
}

