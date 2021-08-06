package Test_0806;

import java.util.Stack;

class CQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public CQueue() {
        stack1=new Stack<>();
        stack2=new Stack<>();
    }

    public void appendTail(int value) {
         stack2.push(value);
    }

    public int deleteHead() {
     if (stack1.isEmpty() && stack2.isEmpty()){
         return -1;
     }
     if (stack1.isEmpty()){
         while (!stack2.isEmpty()){
             int tmp=stack2.pop();
             stack1.push(tmp);
         }
     }
     return stack1.pop();
    }
}
