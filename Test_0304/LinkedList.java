package Test_0304;

import Test_0203.Node;

import java.util.List;

class ListNode{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        return "["+val+"]";
    }
}
public class LinkedList {
    //1.获取链表的中间节点
    public static int getLength (ListNode head){
        int length=0;
        for(ListNode cur=head;cur!=null;cur=cur.next){
            length++;
        }
        return length;
    }
    public static ListNode middleNode(ListNode head){
        if (head==null){
            return null;
        }
        int length=getLength(head);
        int steps=length/2;
        ListNode cur=head;
        for(int i=0;i<steps;i++){
            cur=cur.next;
        }
        return  cur;
    }
    //2.获取链表的中间节点
    public static ListNode FindkthToTail(ListNode head,int k){
        if(head==null){
            return null;
        }
        if(k<=0){
            return null;
        }
        int length=getLength(head);
        if(k>length){
            return null;
        }
        int steps=length-k;
        ListNode cur=head;
        for(int i=0;i<steps;i++){
            cur=cur.next;
        }
        return cur;
    }
    //3.合并两个有序链表
public static ListNode mergeTwoLists(ListNode l1,ListNode l2){
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        ListNode cur1=l1;
        ListNode cur2=l2;
        ListNode newHead=new ListNode(0);
        ListNode newTail=newHead;
        while(cur1!=null && cur2 !=null){
            if(cur1.val<cur2.val){
                newTail.next=cur1;
                cur1=cur1.next;
            }else{
                newTail.next=cur2;
                cur2=cur2.next;
            }
            newTail=newTail.next;
        }
        if(cur1==null){
            newTail.next=cur2;
        }else{
            newTail.next=cur1;
        }
        return newHead.next;
}
//4.给定 x, 把一个链表整理成前半部分小于 x, 后半部分大于等于 x 的形式
    public static ListNode partition (ListNode pHead,int x){
        if(pHead==null){
            return null;
        }
        if(pHead.next==null){
            return pHead;
        }
        ListNode smallHead=new ListNode(0);
        ListNode smallTail=smallHead;
        ListNode largrHead=new ListNode(0);
        ListNode largeTail=largrHead;
        for(ListNode cur=pHead;cur!=null;cur=cur.next){
            if(cur.val<x){
                smallTail.next=new ListNode(cur.val);
                smallTail=smallTail.next;
            }else{
                largeTail.next=new ListNode(cur.val);
                largeTail=largeTail.next;
            }
        }
        smallTail.next=largrHead.next;
        return  smallHead.next;
    }
    public static ListNode creatListNode(){
        ListNode n1=new ListNode(1);
        ListNode n2=new ListNode(9);
        ListNode n3=new ListNode(4);
        ListNode n4=new ListNode(3);
        ListNode n5=new ListNode(7);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=null;
        return  n1;
    }
    public static ListNode creatListNode2(){
        ListNode n1=new ListNode(1);
        ListNode n2=new ListNode(3);
        ListNode n3=new ListNode(5);
        ListNode n4=new ListNode(8);
        ListNode n5=new ListNode(9);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=null;
        return  n1;
    }
    public static ListNode creatListNodeWithDummy(){
        ListNode dummy=new ListNode(0);
        ListNode n1=new ListNode(1);
        ListNode n2=new ListNode(2);
        ListNode n3=new ListNode(3);
        ListNode n4=new ListNode(4);
        ListNode n5=new ListNode(5);
        dummy.next=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=null;
        return dummy;
    }
    public static void main(String[] args) {
        ListNode l1=creatListNode();
//        ListNode l2=creatListNode2();
//      ListNode head=mergeTwoLists(l1,l2);
        ListNode head=partition(l1,4);
      for(ListNode cur=head;cur!=null;cur=cur.next){
          System.out.println(cur);
      }
//        ListNode n=middleNode(head);
//        System.out.println(n);
       // System.out.println(FindkthToTail(head,2));

    }
}
