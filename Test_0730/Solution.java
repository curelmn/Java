package Test_0730;

class ListNode{
    int val=0;
    ListNode next=null;
    public ListNode(){

    }
    public ListNode(int val){
        this.val=val;
        this.next=null;

    }
    public ListNode(int val,ListNode next){
        this.val=val;
        this.next=next;
    }

}
public class Solution {
    //删除链表中的指定元素
    public static ListNode removeElements(ListNode head,int val){
        if(head==null){
            return  null;
        }

        ListNode prev=head;
        ListNode cur=head.next;

        for (;cur!=null;){
            if (cur.val==val){
                prev.next=cur.next;
                cur=prev.next;
            }else {
                prev=prev.next;
                cur=cur.next;
            }
        }
        if(head.val==val){
            head=head.next;
        }
        return head;
    }
    public static ListNode  reverseList(ListNode head){
        if(head==null){
            return  null;
        }
        if (head.next==null){
            return  head;
        }
        ListNode prevNode=null;
        ListNode newHead=null;
        ListNode currentNode=head;
        while (currentNode!=null){
            ListNode nextNode=currentNode.next;
            if (nextNode==null){
                newHead=currentNode;
            }
            currentNode.next=prevNode;
            prevNode=currentNode;
            currentNode=nextNode;
        }
        return newHead;
    }
    public static ListNode createList(){
        ListNode a=new ListNode(1);
        ListNode b=new ListNode(2);
        ListNode c=new ListNode(3);
        ListNode d=new ListNode(4);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=null;
        return a;
    }
    public static void main(String[] args) {
        ListNode head=createList();
//        removeElements(head,2);
        reverseList(head);
        for (ListNode cur=head;cur!=null;cur=cur.next){
            System.out.println(cur.val);
        }
    }
}
