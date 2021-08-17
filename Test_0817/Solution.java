package Test_0817;


import org.apache.hadoop.metrics2.util.Metrics2Util;

class TreeNode {
    int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
public class Solution {
    //搜索二叉树
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        if(root==null){
//            return null;
//        }
//        if(root.val >p.val && root.val>q.val){
//            return lowestCommonAncestor(root.left,p,q);
//        }
//        if(root.val<p.val && root.val<q.val){
//            return lowestCommonAncestor(root.right,p,q);
//        }
//        return root;
//    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root==null){
            return null;
        }
        if (root==p || root==q){
            return root;
        }
        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);
        if (left!=null && right!=null){
            return root;
        }
        if (left!=null){
            return left;
        }
        if (right!=null){
            return right;
        }
        return null;
    }
    public int[] countBits(int n) {
        int[] res=new int[n+1];
        for(int i=1;i<n+1;i++){
            res[i]=res[i/2]+i%2;
        }
        return res;
    }
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right= numbers.length-1;
        while(left<right){
            int tmp=numbers[left]+numbers[right];
            if (tmp<target){
                left++;
            }else if(tmp >target){
                right--;
            }else{
                return new int[] {left,right};
            }
        }
        return new  int[0];
    }
    public int pivotIndex(int[] nums) {

    }
}
