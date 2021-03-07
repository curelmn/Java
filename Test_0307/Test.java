package Test_0307;

import java.util.List;

class ListNode{
    int val;
    ListNode next;

    public ListNode(int v){
        val=v;
        next=null;
    }
}
public class Test {
    public ListNode detectCycle(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while(fast != null && fast.next !=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                break;
            }
        }
        if(fast==null || fast.next==null){
            return null;
        }
        ListNode cur1=head;
        ListNode cur2=fast;
        while(cur1 !=cur2){
            cur1=cur1.next;
            cur2=cur2.next;
        }
        return cur1;
    }
}
