package Test_0801;

import java.util.Stack;

public class MyQueue {
    Stack<Integer> A=new Stack<>();
    Stack<Integer> B=new Stack<>();

    public MyQueue(){

    }

    public void push(int x){
        while (!B.isEmpty()){
            int tmp=B.pop();
            A.push(tmp);
        }
        A.push(x);
    }
    public int pop(){
        if(A.isEmpty() && B.isEmpty()){
            return 0;
        }
        while (!A.isEmpty()){
            int tmp=A.pop();
            B.push(tmp);
        }
        return B.pop();
    }
    public int peek(){
        if (A.isEmpty() && B.isEmpty()){
            return 0;
        }
        while (!A.isEmpty()){
            int tmp=A.pop();
            B.push(tmp);
        }
        return B.peek();
    }

    public boolean empty(){
        return A.isEmpty() && B.isEmpty();
    }

}
