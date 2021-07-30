package Test_0730;

public class LinkedList {
    public  int getLength(ListNode head){
        int length=0;
        //遍历链表
        for (ListNode cur=head;cur!=null;cur=cur.next){
            length++;
        }
        return length;
    }
    public ListNode middleNode(ListNode head){
        if (head==null){
            return  null;
        }
        int len=getLength(head)/2;
        ListNode cur=head;
        for (int i=0;i<len;i++){
            cur=cur.next;
        }
        return cur;
    }
   public ListNode FindKthToTail(ListNode head,int k){
   if (head==null){
       return null;
   }
   if (k<=0){
       return null;
   }
   int len=getLength(head);
   if (k>len){
       return null;
   }
   int steps=len-k;
   ListNode cur=head;
   for (int i=0;i<steps;i++){
       cur=cur.next;
   }
   return cur;
   }


    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
      if (l1==null){
          return l2;
      }
      if (l2==null){
          return l1;
      }
      ListNode cur1=l1;
      ListNode cur2=l2;
      ListNode newHead=new ListNode(0);
      ListNode newTail=newHead;
      while (cur1!=null && cur2!=null){
          if (cur1.val<cur2.val){
              newTail.next=cur1;
              cur1=cur1.next;
          }else {
              newTail.next=cur2;
              cur2=cur2.next;
          }
          if (cur1==null){
              newTail.next=cur2;
          }else{
              newTail.next=cur1;
          }
      }
      return newHead.next;
    }
    public ListNode partition(ListNode pHead, int x) {
       if (pHead==null){
           return null;
       }
       if (pHead.next==null){
           return pHead;
       }
       ListNode smallHead=new ListNode(0);
       ListNode smallTail=smallHead;
       ListNode  largeHead=new ListNode(0);
       ListNode largeTail=largeHead;

       for (ListNode cur=pHead;cur!=null;cur=cur.next){
           if (cur.val<x){
               smallTail.next=new ListNode(cur.val);
               smallTail=smallHead.next;
           }else {
               largeTail.next=new ListNode(cur.val);
               largeTail= smallTail.next;
           }
       }
        smallTail.next=largeTail;
       return smallHead.next;
    }


    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead==null){
            return null;
        }
        if (pHead.next==null){
            return pHead;
        }
        ListNode newHead=new ListNode(0);
        ListNode newTail=newHead;
        ListNode cur=pHead;
        while (cur!=null){
            if (cur.next!=null && cur.val==cur.next.val){
                while (cur!=null &&cur.next!=null && cur.val==cur.next.val){
                    cur=cur.next;
                }
            }else {
                newTail.next=new ListNode(cur.val);
                newTail=newTail.next;
            }
            cur=cur.next;
        }
        return newHead.next;
    }

    public boolean chkPalindrome(ListNode A) {
       if(A==null){
           return true;
       }
       if (A.next==null){
           return true;
       }
       ListNode newHead=new ListNode(0);
       ListNode newTail=newHead;
       for (ListNode cur=A;cur!=null;cur=cur.next){
           newTail.next=new ListNode(cur.val);
           newTail=newTail.next;
       }
       ListNode B=newHead.next;

       ListNode prev=null;
       ListNode cur=B;
       while (cur!=null){
           ListNode nextNode=cur.next;
           if (nextNode==null){
               B=nextNode;
           }
           cur.next=prev;
           prev=cur;
           cur=nextNode;

           ListNode cur1= A;
           ListNode cur2= B;
           while (cur1!=null && cur2 !=null){
               if (cur1.val!=cur2.val){
                   return false;
               }
               cur1=cur1.next;
               cur2=cur2.next;
           }
       }
     return true;
    }

}
