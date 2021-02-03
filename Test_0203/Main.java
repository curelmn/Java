package Test_0203;

public class Main {
    public static Node createList(){

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;
        return a;
    }
      //带傀儡节点的链表
    public static Node createListWithDummy(){
        Node dummy=new Node(0);
        Node a=new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        dummy.next=a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;
        return dummy;
    }
    //遍历一个不带傀儡节点的链表
    public static void print(Node head){
        for(Node cur=head;cur!=null;cur=cur.next){
            System.out.println(cur.val);
        }
    }
    //遍历一个带傀儡节点的链表
    public static void printWithDummy(Node head){
        for(Node cur=head.next;cur!=null;cur=cur.next){
            System.out.println(cur.val);
        }
    }
    //尾插一个节点
    public static  Node insertTail(Node head,int val) {
        Node newNode = new Node(val);
        if (head == null) {
            return newNode;
        }
        //先找到尾节点
        Node prev = head;
        while (prev.next != null) {
            prev = prev.next;
        }
        newNode.next = prev.next;
        prev.next = newNode;
        return head;
    }

   //删除节点，按照值删除
    public static  void remove(Node head,int value){
        Node prev=head;
        while (prev!=null && prev.next!=null &&prev.next.val!=value){
            prev=prev.next;
        }
        if(prev==null || prev.next==null){
            return ;
        }
        Node toDelete=prev.next;
        prev.next=toDelete.next;
    }

    //删除节点，按照位置来删除
    public static void  remove(Node head,Node toDelete){
        Node prev=head;
        while(prev!=null && prev.next!= toDelete){
            prev=prev.next;
        }
        if(prev==null){
            return;
        }
        prev.next=toDelete.next;
    }
    public static void remove2(Node head,Node toDelete){
        Node nextNode=toDelete.next;
        toDelete.val=nextNode.val;
        toDelete.next=nextNode.next;
    }
    public static int size(Node head){
        int size=0;
        for(Node cur=head;cur!=null;cur=cur.next){
            size++;
        }
        return size;
    }
    //给定节点下标来删除
    public static void remove3(Node head,int index){
        if(index<0 || index>=size(head)){
            return;
        }
        if(index==0){
//
        }
        Node prev=head;
        for(int i=0;i<index-1;i++){
            Node toDelete=prev.next;
            prev.next=toDelete.next;
        }
    }
    public static void main(String[] args) {
//       Node head=createList();
//        print(head);

//        Node head=createListWithDummy();
//        printWithDummy(head);

 //         Node head=createList();
//        insertTail(head,100);
//        print(head);

//        remove(head,2);
//        print(head);
        //在 1 和 2 之间插入节点
        Node head=createList();
        Node newNode= new Node(100);
//        Node one=head;
//        newNode.next=one.next;
//        one.next=newNode;
//        print(head);
        //把节点插入到链表的头部
//        newNode.next=head;
//        head=newNode;
//        print(head);
        //创建傀儡节点链表，依然在 1 和 2 之间插入节点
//         Node head=createListWithDummy();
//         Node newNode=new Node(100);
//         Node prev=head.next;
//         newNode.next=prev.next;
//         prev.next=newNode;

        //往链表头部加入
//        Node prev=head;
//        newNode.next=prev.next;
//        prev.next=newNode;
//        printWithDummy(head);

        //Node head=createList();
//        Node head=null;
//        head=insertTail(head,100);
//        print(head);

    }
}
