package Test_0307;


import java.util.Scanner;

class Node{
    int val;
    Node prev=null;
    Node next=null;

    public Node(int val){
        this.val=val;
    }

    @Override
    public String toString() {
        return "["+val+"]";;
    }
}
public class MyLinkedList{
 private Node head;
 private  Node tail;
 private int length=0;

 public MyLinkedList(){
     //不使用傀儡节点
     head=null;
     tail=null;
 }
 public int length(){
     return this.length;
 }
 //插入节点（头插
    public void addFirst(int val){
     Node newNode=new Node(val);

     if(head==null){
         head=newNode;
         tail=newNode;
         length++;
         return;
     }
     //非空
        newNode.next=head;
     head.prev=newNode;
     head=newNode;
     length++;
     return;
    }
    //尾插
    public void addLast(int val){
     Node newNode=new Node(val);
     if(head==null){
         head=newNode;
         tail=newNode;
         length++;
         return;
     }

     //非空
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
        length++;
    }
//找指定位置插入
    public void add(int index,int val){
     if(index<0 || index>length){
         return;
     }
     if(index==0){
         addFirst(val);
         return;
     }
      if(index==length){
          addLast(val);
      }
      Node newNode=new Node(val);
      Node nextNode=getNode(index);
      Node prevNode=nextNode.prev;

      prevNode.next=nextNode;
      newNode.prev=prevNode;

      newNode.next=nextNode;
      newNode.prev=newNode;
      length++;

    }
     public void removeFirst(){
     if(head==null){
         return;
     }
     if(head.next==null){
         head=null;
         tail=null;
         length=0;
         return;
     }
     Node nextNode=head.next;
     nextNode.prev=null;
     head=nextNode;
     length--;
     }

     public void removeLast(){
     if(head==null){
         return;
     }
     if(head.next==null){
         head=null;
         tail=null;
         length=0;
         return;
     }
     Node prevNode=tail.prev;
     prevNode.next=null;
     tail=prevNode;
     length--;
     }
     //删除
    public void removeByIndex(int index){
     if(index<0 || index>=length){
         return;
     }
     if(index==0){
         removeFirst();
         return;
     }
     if(index==length-1){
         removeLast();
         return;
     }
     //1.根据下标，找到位置
        Node toRemove=getNode(index);
     //2.记录前后节点的位置
        Node prevNode=toRemove.prev;
        Node nextNode=toRemove.next;
        //3.删除节点
        prevNode.next=nextNode;
        nextNode.prev=prevNode;
        length--;
    }

    public void removeByValue(int val){
     int  index=indexOf(val);
     if(index==-1){
         return;
     }
     removeByIndex(index);
    }
    //根据下标找到节点

    public Node getNode(int index){
    if(index<0 || index>=length){
        return null;
    }
    Node cur=head;
    for(int i=0;i< index;i++){
        cur=cur.next;
    }
    return cur;
    }
//查找
    public int get(int index){
     if(index<0 || index>=length){
         throw new ArrayIndexOutOfBoundsException();
     }
     return getNode(index).val;
    }

    public int indexOf(int value){
     Node cur=head;
     for(int i=0;i<length;i++){
         if(cur.val==value){
             return i;
         }
         cur=cur.next;
     }
     return -1;
    }
    public void set(int index,int value){
     if(index<0 || index>=length){
         throw new ArrayIndexOutOfBoundsException();
     }
     Node node=getNode(index);
     node.val=value;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        sc.next();
    }
}
