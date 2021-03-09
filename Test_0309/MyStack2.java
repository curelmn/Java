package Test_0309;
//使用链表实现

class Node{
    int val;
    Node next;
    public  Node(int val){
        this.val=val;
    }
}
public class MyStack2 {
    private Node  head=null;//使用不带傀儡节点的链表

    //1.入栈
    public void push(int val){
        Node newNode= new Node(val);
        //相当于给链表进行头插，需要判断链表是否为空
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    //2.出栈
    public  Integer pop(){
        //相当于进行头删
        if(head==null){
            return  null;
        }
        if(head.next==null){
            int ret=head.val;
            head=null;
            return  ret;
        }
        int ret=head.val;
        head=head.next;
        return  ret;
    }

    //3.取出栈顶元素
    public Integer pek(){
        if(head==null){
            return  null;
        }
        return  head.val;
    }
}
