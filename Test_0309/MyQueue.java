package Test_0309;

//使用链表实现队列
public class MyQueue {
    static class Node{
        int val;
        Node next;

        public Node(int val){
            this.val=val;
        }
    }

    //记录头结点和尾节点
    private  Node head=null;
    private  Node tail=null;

    //1.入队列。返回插入成功/失败

    public boolean offer(int val){
        Node newNode=new Node(val);

        if(head==null){
            head=newNode;
            tail=newNode;
            return  true;
        }
        tail.next=newNode;
        tail=tail.next;
        return true;
    }

    //2.出队列
    public Integer poll(){
        if(head==null){
            return  null;
        }
        int ret=head.val;
        if(head.next==null){
            head=null;
            return  ret;
        }
        head=head.next;
        return ret;
    }

    //3.取队首元素
    public Integer peek(){
        if(head==null){
            return  null;
        }
        return head.val;
    }

    public static void main(String[] args) {
        MyQueue myQueue=new MyQueue();
        myQueue.offer(1);
        myQueue.offer(2);
        myQueue.offer(3);
        myQueue.offer(4);

        Integer ret=null;
        ret=myQueue.poll();
        System.out.println("ret="+ret);
        ret=myQueue.poll();
        System.out.println("ret="+ret);
        ret=myQueue.poll();
        System.out.println("ret="+ret);
        ret=myQueue.poll();
        System.out.println("ret="+ret);

    }
}
