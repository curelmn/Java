package Test_0801;


import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    private Queue<Integer> A=new LinkedList<>();
    private Queue<Integer> B=new LinkedList<>();

    public MyStack(){}

    public void push(int x){
        A.offer(x);
    }
    public int pop(){
        if (A.isEmpty() && B.isEmpty()){
            return 0;
        }
        while (A.size()>1){
            int tmp=A.poll();
            B.offer(tmp);
        }
        int ret=A.poll();
        swapAB();
        return ret;
    }
    public void swapAB(){
        Queue<Integer> tmp=A;
        A=B;
        B=tmp;
    }
    //取栈顶元素
    public int top(){
        if (A.isEmpty() && B.isEmpty()){
            return 0;
        }
        while (A.size()>1){
            int tmp=A.poll();
            B.offer(tmp);
        }
        int ret=A.poll();
        B.offer(ret);
        swapAB();
        return ret;
    }
    public boolean empty(){
        return A.isEmpty() && B.isEmpty();
    }
}
