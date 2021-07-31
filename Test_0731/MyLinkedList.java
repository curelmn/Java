package Test_0731;
//
//class Node{
//    int val=0;
//    Node prev=null;
//    Node next=null;
//    public Node(int val){
//        this.val=val;
//    }
//}
//public class MyLinkedList {
////    private  Node head;
////    private  Node tail;
////    private int length=0;
////    public MyLinkedList(){
////        head=null;
////        tail=null;
////    }
////    public int length(){
////        return this.length;
////    }
//      private Node head;
//      private Node tail;
//      private int length=0;
//      public  MyLinkedList(){
//        head=null;
//        tail=null;
//     }
//      public int  getLength(){
//      return this.length;
//}
//
//    //插入节点 头插
//    public void addFirst(int val) {
//        Node newNode = new Node(val);
//      if (head==null){
//          head=newNode;
//          tail=newNode;
//          length++;
//          return;
//      }
//      newNode.next=head;
//      head.prev=newNode;
//      head=newNode;
//      length++;
//      return;
//
//    }
//    // 尾插
//    public void addLast(int val){
//        Node newNode=new Node(val);
//        if (head==null){
//            head=newNode;
//            tail=newNode;
//            length++;
//            return;
//        }
//        tail.next=newNode;
//        newNode.prev=tail;
//        tail=newNode;
//        length++;
//        return;
//    }
//    //指定位置插入
//    public void  add(int index,int val){
//        if (index<0||index>=length){
//            return;
//        }
//        if (index==0){
//            addFirst(index);
//        }
//        if (index==length){
//            addLast(index);
//        }
//        Node nextNode=getNode(index);
//        Node prevNode=nextNode.prev;
//        Node newNode=new Node(val);
//
//        prevNode.next=nextNode;
//        newNode.prev=prevNode;
//
//        newNode.next=nextNode;
//        nextNode.prev=newNode;
//        length++;
//        return;
//
//    }
//    public  void removeFirst(){
//        if (head==null){
//            return;
//        }
//        if (head.next==null){
//            head=null;
//            tail=null;
//            length=0;
//            return;
//        }
//        Node nextNode=head.next;
//        nextNode.prev=null;
//        head=nextNode;
//        length--;
//        return;
//    }
//
//    public void removeLast(){
//        if (head==null){
//            return;
//        }
//        if (head.next==null){
//            head=null;
//            tail=null;
//            length=0;
//            return;
//        }
//        Node prevNode=tail.prev;
//        prevNode.next=null;
//        tail=prevNode;
//        length--;
//    }
//    public  void removeByIndex(int index){
//        if (index<0 ||index>=length){
//            return;
//        }
//        if (index==0){
//            removeFirst();
//            return;
//        }
//        if (index==length-1){
//            removeLast();
//            return;
//        }
//        Node toRemove=getNode(index);
//        Node prevNode=toRemove.prev;
//        Node nextNode=toRemove.next;
//
//
//        prevNode.next=nextNode;
//        nextNode.prev=prevNode;
//
//        length--;
//    }
//    public void removeByValue(int val){
//        int index=indexOf(val);
//        if (index==-1){
//            return;
//        }
//        removeByIndex(index);
//    }
//
//    public int get(int index){
//        if (index<0 ||index>=length){
//            throw  new ArrayIndexOutOfBoundsException();
//        }
//        return getNode(index).val;
//    }
//
//    public  void set(int index,int value){
//        if (index<0 || index>=length){
//            throw new ArrayIndexOutOfBoundsException();
//        }
//        Node node=getNode(index);
//        node.val=value;
//    }
//
//    private int indexOf(int val) {
//        Node cur=head;
//        for (int i=0;i<length;i++){
//            if (cur.val==val){
//                return i;
//            }
//            cur=cur.next;
//        }
//        return -1;
//    }
//
//    public Node getNode(int index){
//        if (index<0 || index>=length){
//            return null;
//        }
//        Node cur=head;
//        for (int i=0;i<index;i++){
//            cur=cur.next;
//        }
//        return  cur;
//    }
//
//}
