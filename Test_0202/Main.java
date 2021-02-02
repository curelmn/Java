package Test_0202;

public class Main {

    public static Node createList(){
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=null;
        return  a;
    }

    public static void main(String[] args) {
        Node head=createList();
//        //1.遍历链表，打印链表中的每一个元素
//        for( Node cur=head;cur!=null;cur=cur.next){
//            System.out.println(cur.val);
        //2.遍历链表，找到链表的最后一个节点
//        Node cur=head;
//        while(cur!=null && cur.next!=null){
//            cur=cur.next;
//        }
//        System.out.println(cur.val);
         //3.遍历链表，找到链表的倒数第二个节点
//        Node cur=head;
//        while(cur!=null &&cur.next!=null && cur.next.next!=null){
//            cur=cur.next;
//        }
//        System.out.println(cur.val);
        //4.取链表的第N个节点
//        int N=3;
//        Node cur=head;
//        for(int i=1;i<N;i++){
//            cur=cur.next;
//        }
//        System.out.println(cur.val);
        //5.获取链表的长度
//        int count=0;
//        for(Node cur=head;cur!=null;cur=cur.next){
//            count++;
//        }
//        System.out.println(count);
        //6.遍历链表，查找链表上是否存在某个元素
        int toFind=2;
        Node cur=head;
        for(;cur!=null;cur=cur.next){
            if(cur.val==toFind){
                break;
            }
        }
        if(cur!=null){
            System.out.println("find");
        }else{
            System.out.println("not find");
        }
    }
}
