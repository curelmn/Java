package Test_0731;


class Node{
    int val;
    Node next;

    public Node(int val){
        this.val=val;
    }
}
public class MyStack2 {
    private Node head=null;

    //1.入栈
    public void push(int val){
       Node newNode=new Node(0);
       if (head==null){
           head=newNode;
           return;
       }
       newNode.next=head;
       head=newNode;

    }
    //2.出栈
    public Integer pop(){
        //进行头删
      if (head==null){
          return null;
      }
      if (head.next==null){
          int ret=head.val;
          head.next=null;
          return ret;
      }
      int ret=head.val;
      head=head.next;
      return ret;
    }
    //3.取栈顶元素
    public  Integer peek(){
        if (head==null){
            return null;
        }
        return head.val;
    }
}
