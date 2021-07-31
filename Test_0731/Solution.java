package Test_0731;

class ListNode{
    int val=0;
    ListNode next=null;
    public  ListNode(int val){
     this.val=val;
    }
}
public class Solution {
     public int getLength(ListNode head){
         int len=0;
         for (ListNode cur=head;cur!=null;cur=cur.next){
             len++;
         }
         return len;
     }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       int len1=getLength(headA);
       int len2=getLength(headB);

       if (len1>len2){
           int steps=len1-len2;
           for (int i=0;i<steps;i++){
               headA=headA.next;
           }
       }else {
           int steps=len2-len1;
           for (int i=0;i<steps;i++){
               headB=headB.next;
           }
       }

       while (headA!=null && headB!=null){
           if (headA==headB){
               return headA;
           }
           headA=headA.next;
           headB=headB.next;
       }
       return null;
    }


    public boolean hasCycle(ListNode head) {
    ListNode fast=head;
    ListNode slow=head;

    while (fast!=null && fast.next!=null){
        fast=fast.next.next;
        slow=slow.next;
        if (fast==slow){
            return true;
        }
    }
    return false;
    }

    public boolean chkPalindrome(ListNode A) {
         if (A==null){
             return true;
         }
         if (A.next==null){
             return true;
         }
         ListNode  newHead=new ListNode(0);
         ListNode  newTail=newHead;
         for (ListNode cur=A;cur!=null;cur=cur.next){
             newTail.next=new ListNode(cur.val);
             newTail=newTail.next;
         }
         ListNode B=newHead.next;

         ListNode prev=null;
         ListNode cur=B;
         while (cur!=null){
             ListNode next=cur.next;
             if (next==null){
                 B=cur;
             }
             cur.next=prev;
             prev=cur;
             cur=next;
         }

         while (A!=null && B!=null){
             if (A.val!=B.val){
                 return  false;
             }
             A=A.next;
             B=B.next;
         }
         return true;
    }

    public ListNode deleteDuplication(ListNode pHead) {
         if (pHead==null){
             return null;
         }
         if (pHead.next==null){
             return null;
         }
         ListNode newHead=new ListNode(0);
         ListNode newTail=newHead;

         ListNode cur=pHead;
         while (cur!=null){
             if (cur.next!=null && cur.val==cur.next.val){
                 while (cur!=null && cur.next!=null &&cur.val==cur.next.val){
                     cur=cur.next;
                 }
             }else {
                 newTail.next=new ListNode(0);
                 newTail=newTail.next;
             }
             cur=cur.next;

         }
         return newHead.next;
    }
    public ListNode detectCycle(ListNode head) {
         ListNode fast=head;
         ListNode slow=head;

         while (fast!=null && fast.next!=null){
             fast=fast.next.next;
             slow=slow.next;
             if (slow==fast){
                 break;
             }
         }
         if (fast==null || fast.next==null){
             //说明是不带环的
             return  null;
         }
         // 如果带环，从链表表头 和fast slow 交汇位置同时出发，
         // 两个引用相遇位置就是环的入口
         ListNode cur1=head;
         ListNode cur2=fast;
         while (cur1!=cur2){
             cur1=cur1.next;
             cur2=cur2.next;
         }
         return cur1;
    }
}