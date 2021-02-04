package Test_0204;

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
public class T0204 {
    //删除链表中的所有元素
    public ListNode removeElements(ListNode head,int val){
        if(head==null){
            return null;
        }

        ListNode prev=head;
        ListNode cur=head.next;
        for(;cur!=null;) {
            if (cur.val == val) {
                prev.next = cur.next;
                cur = prev.next;
            } else {
                prev = prev.next;
                cur = cur.next;
            }
        }
            if(head.val==val){
                head=head.next;
            }
        return head;
    }
    public static void main(String[] args) {

    }


    //链表逆置
    public ListNode reverseList(ListNode head){
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        ListNode newHead=null;
        ListNode prevNode=null;
        ListNode curNode=head;
        while(curNode != null){
            ListNode nextNode=curNode.next;
            if(nextNode==null){
                newHead=curNode;
            }
            curNode.next=prevNode;
            prevNode=curNode;
            curNode=nextNode;
        }
        return newHead;
    }
}
