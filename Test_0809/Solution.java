package Test_0809;

import java.nio.file.Watchable;
import java.util.HashMap;
import java.util.Map;

class TreeNode {
      int val;
      TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
  }
class ListNode {
     int val;
       ListNode next;
       ListNode(int x) {
      val = x;
      next = null;
   }
  }
public class Solution {
    public int maxDepth(TreeNode root) {
      if(root==null){
          return 0;
      }
      return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      if(headA==null || headB==null){
          return null;
      }
      ListNode cur1=headA;
      ListNode cur2=headB;
      int len1=0;
      int len2=0;
      for (ListNode cur=headA;headA!=null;headA=headA.next){
          len1++;
      }
      for (ListNode cur=headB;headB!=null;headB=headB.next){
            len2++;
      }
      if (len1>len2){
          int step=len1-len2;
          for (int i=0;i<step;i++){
              cur1=cur1.next;
          }
      }
        if (len1<len2){
            int step=len2-len1;
            for (int i=0;i<step;i++){
                cur2=cur2.next;
            }
        }
        while (cur1!=null && cur2 !=null){
            if (cur1==cur2){
                return cur1;
            }
            cur1=cur1.next;
            cur2=cur2.next;
        }
        return null;
    }

    public int search(int[] nums, int target) {
//        int left=0;
//        int right=nums.length-1;
//        int count=0;
//        while (left<right){
//            int mid=(left+right)/2;
//            if (nums[mid]>=target){
//                right=mid;
//            }
//            if (nums[mid]<target){
//                left=mid+1;
//            }
//        }
//        while (left<nums.length && nums[left++]==target){
//            count++;
//        }
//        return count;
        int left=0;
        int right=nums.length-1;
        int count=0;
        while (left<right){
            int mid=(left+right)/2;
            if (nums[mid]>=target){
                right=mid;
            }
            if (nums[mid]<target){
                left=mid+1;
            }
        }
        if (left<nums.length && nums[left++]==target){
            count++;
        }
        return count;
    }

    public int missingNumber(int[] nums) {
        int left=0;
        int right=nums.length-1;
        while (left<right){
            int mid=(left+right)/2;
            if (nums[mid]==mid){
                left=mid+1;
            }else {
                right=mid-1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        
    }
}
