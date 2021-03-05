package Test_0305;
import java.util.HashMap;
class ListNode{
    int val;
    ListNode next;
    public ListNode(int v){
        val=v;
    }

    @Override
    public String toString() {
        return "["+val+"]";
    }
}
public class LinkedList {

    public static void main(String[] args) {
        ListNode head1 = createList1();
        ListNode head2 = createList2();
        System.out.println(getIntersectionNode(head1, head2));
    }

    public static ListNode createList1() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(6);
        ListNode n5 = new ListNode(12);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;
        return n1;
    }

    public static ListNode createList2() {
        ListNode n1 = new ListNode(4);
        ListNode n2 = new ListNode(5);
        ListNode n3 = new ListNode(6);
        ListNode n4 = new ListNode(3);
        ListNode n5 = new ListNode(6);
        ListNode n6 = new ListNode(12);


        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = null;
        return n1;
    }

    //1.判断链表相交
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1 = getLength(headA);
        int len2 = getLength(headB);
        if (len1 > len2) {
            int steps = len1 - len2;
            for (int i = 0; i < steps; i++) {
                headA = headA.next;
            }
        } else {
            int steps = len2 - len1;
            for (int i = 0; i < steps; i++) {
                headB = headB.next;
            }
        }
            while (headA != null && headB != null) {
                if (headA.val == headB.val) {
                    return headA;
                }
                headA = headA.next;
                headB = headB.next;
            }
            return null;
    }
        public static int getLength (ListNode head){
            int length = 0;
            for (ListNode cur = head; cur != null; cur = cur.next) {
                length++;
            }
            return length;
        }
        //2.判断一个链表是否又环
    public boolean hasCycle(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while(fast !=null && fast.next != null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
    }

    public boolean chkPailndrome(ListNode A){
    if(A==null || A.next==null){
        return true;
    }
    ListNode newHead=new ListNode(0);
    ListNode newTail=newHead;
    for(ListNode cur=A;cur!=null;cur=cur.next){
        newTail.next=new ListNode(cur.val);
        newTail =newTail.next;
    }
    ListNode B=newHead.next;
    ListNode prev=null;
    ListNode cur=B;
    while (cur!=null){
        ListNode next=cur.next;
        if(next==null){
            B=cur;
        }
        cur.next=prev;
        prev=cur;
        cur=next;
    }
    ListNode cur1=A;
    ListNode cur2=B;
    while (cur1!=null && cur2!=null){
        if(cur1.val != cur2.val){
            return false;
        }
        cur1=cur1.next;
        cur2=cur2.next;
    }
    return  true;

    }
    public ListNode deleteDuplication(ListNode pHead) {
    if (pHead==null){
        return null;
    }
    if(pHead.next==null){
        return pHead;
    }
    ListNode newHead=new ListNode(0);
    ListNode newTail=newHead;
    ListNode cur=pHead;
    while(cur !=null){
        if(cur.next!=null && cur.val==cur.next.val){
            while(cur !=null && cur.next !=null && cur.val==cur.next.val){
                cur=cur.next;
            }else{
                newTail.next=new ListNode(cur.val);
                newTail=newTail.next;
            }
            cur=cur.next;
        }
        return  newHead.next;
    }
}
}
