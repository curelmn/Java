package Test_0810;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
     TreeNode(int x) { val = x; }
  }

public class Solution {
    public int missingNumber(int[] nums) {
        int left=0;
        int right=nums.length-1;
        while (left<=right){
            int mid=(left+right)/2;
            if (nums[mid]==mid){
                left=mid+1;
            }else {
                right=mid-1;
            }
        }
        return left;
    }
    public boolean isBalanced(TreeNode root) {
        if (root==null){
            return true;
        }
        return Math.abs(getDepth(root.left)-getDepth(root.right)) <=1 && isBalanced(root.left) &&isBalanced(root.right);
    }
    public int getDepth(TreeNode p1){
        if (p1==null){
            return  0;
        }
        int len1=getDepth(p1.left);
        int  len2=getDepth(p1.right);
        return 1+Math.max(len1,len2);

    }

    public int[] twoSum(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        while(i<j){
            if(nums[i]+nums[j]==target){
                return new int[] {nums[i],nums[j]};
            }
            if(nums[i]+nums[j]<target){
                i++;
            }
            if(nums[i]+nums[j]>target){
                j--;
            }
        }
        return new int[0];
    }
    public int kthLargest(TreeNode root, int k) {
        List<Integer> list=new ArrayList<>();
        helper(root,list);
        return  list.get(list.size()-k);

    }

    private void helper(TreeNode root, List<Integer> list) {
        if (root==null){
            return;
        }
        helper(root.left,list);
        list.add(root.val);
        helper(root.right,list);
    }

    public int[][] findContinuousSequence(int target) {

    }
}
