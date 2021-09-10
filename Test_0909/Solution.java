package Test_0909;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


 class ListNode {
     int val;
   ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
  }
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length<3){
            return  new ArrayList<>();
        }
        Arrays.sort(nums);
        HashMap<Integer,Integer> map=new HashMap<>();
        List<List<Integer>>  resultArr=new ArrayList<>();

        for (int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        Integer t=0;
        int target=0;

        for (int i=0;i<nums.length;i++){
            target-=nums[i];
            if (i>0 && nums[i]==nums[i-1]){
                continue;
            }

            for (int j=i+1;j<nums.length;j++){
                if (j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                if ((t=map.get(target-nums[j]))!=null){
                    resultArr.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[t])));
                }else {
                    break;
                }
            }

        }
        return  resultArr;
    }
    public boolean hasCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while (fast!=null && fast.next !=null){
            fast=fast.next.next;
            slow=slow.next;
            if (slow==fast){
                return  true;
            }
        }
        return  false;
    }


    public int maxSubArray(int[] nums) {
        int res=nums[0];
        int sum=0;
        for(int num :nums){
            if(sum>0){
                sum+=num;
            }else{
                sum=num;
            }
            res=Math.max(res,sum);
        }
        return res;
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
        newTail=newTail.next;
     }
     if (cur1!=null){
         newTail.next=cur1;
     }else {
         newTail.next=cur2;
     }

     return newHead.next;
    }


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      int len1=0;
      int len2=0;
      for (ListNode cur=headA;cur!=null;cur=cur.next){
          len1++;
      }
      for (ListNode cur=headB;cur!=null;cur=cur.next){
          len2++;
      }
      int step=0;
      if (len1>len2){
          step=len1-len2;
          for (int i=0;i<step;i++){
              headA=headA.next;
          }
      }else {
          step=len2-len1;
          for (int i=0;i<step;i++){
              headB=headB.next;
          }
      }

      while (headA!=null  && headB !=null){
          if (headA==headB){
              return headA;
          }
          headA=headA.next;
          headB=headB.next;
      }
      return  null;
    }
    public int maxProfit(int[] prices) {
        if(prices.length<=1){
            return 0;
        }
        int min=prices[0],max=0;
        for (int i=1;i<prices.length;i++){
            max=Math.max(max,prices[i]-min);
            min=Math.min(min,prices[i]);
        }
        return max;
    }
}
