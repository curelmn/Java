package Test_0831;

import com.sun.org.apache.bcel.internal.generic.LNEG;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class ListNode {
    int val;
     ListNode next;
     ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class Solution {
    public ListNode reverseList(ListNode head) {
      if (head==null){
          return null;
      }
      if (head.next==null){
          return head;
      }
    ListNode newHead=null;
      ListNode prev=null;
      ListNode cur=head;
      while (cur!=null){
          ListNode nextNode=cur.next;
          if (nextNode==null){
              newHead=cur;
          }
          cur.next=prev;
          prev=cur;
          cur=nextNode;
      }
      return newHead;
    }
    public int lengthOfLongestSubstring(String s) {
        int res=0;
        Set<Character> set=new HashSet<>();
        for (int l=0,r=0;r<s.length();r++){
            char c=s.charAt(r);
            while(set.contains(c)){
                set.remove(l++);
            }
            set.add(c);
            res= Math.max(res,r-l+1);
        }
        return res;
    }
    public int findKthLargest(int[] nums, int k) {
        return quickSort(nums,0,nums.length-1,k);
    }

    private int quickSort(int[] nums, int l, int r, int index) {
     int  q=_quick(nums,l,r);
     if (q==index){
         return nums[q];
     }else {
         return q>index?_quick(nums,l,q-1):_quick(nums,q+1,r);
     }

    }

    private int _quick(int[] nums, int l, int r) {

    }
}
