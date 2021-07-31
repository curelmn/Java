package Test_0731;

public class MyStack {
    private  int[] data=new int[100];
    private int size=0;

    //1.入栈
    public void push(int val){
        if (size>=data.length){
            return;
        }
        data[size]=val;
        size++;
    }
    //2.出栈
    public Integer pop(){
     if (size==0){
         return null;
     }
     int ret=data[size-1];
     size--;
     return ret;
    }
    //3.取栈顶的元素
    public  Integer peek(){
        if (size==0){
            return null;
        }
        return data[size-1];
    }
}
