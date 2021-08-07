package Test_0807;


import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import com.sun.org.apache.bcel.internal.generic.LNEG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ListNode {
    int val;
    ListNode next;
     ListNode(int x) { val = x; }
}
 class TreeNode {
     int val;
     TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null && l2==null){
            return null;
        }
        if (l1==null){
            return l2;
        }
        if (l2==null){
            return l1;
        }

        ListNode newHead=new ListNode(0);
        ListNode newNode=newHead;
        while (l1!=null || l2!=null){
            if (l1.val<l2.val){
                newNode.next=new ListNode(l1.val);
                l1=l1.next;
            }else {
                newNode.next=new ListNode(l2.val);
                l2=l2.next;
            }

        }
        if (l1==null) {
            newNode.next = l2;
        }else if (l2==null){
            newNode.next=l1;
        }
        return newHead.next;
    }
    public int hammingWeight(int n) {
      int count=0;
      while (n!=0){
          n=n&(n-1);
          count++;
      }
      return count;
    }
    public int[] printNumbers(int n) {
        int m=(int) Math.pow(10,n);
        int[] arr=new int[m-1];
        for(int i=0;i<m-1;i++){
            arr[i]=i+1;
        }
        return arr;
    }

    public double myPow(int x,int n){
        if (n<0){
            return 1/Power(x,n);
        }
        return Power(x,n);
    }

    private double Power(int x, int n) {
        if (n==0){
            return 1;
        }
        double half=Power(x,n/2);
        if (n%2==0){
            return  half*half;
        }
        return x*half*half;
    }

    public ListNode deleteNode(ListNode head, int val) {
        ListNode prev=null;
        ListNode cur=head;
        if(head !=null && head.val==val){
            head=head.next;
        }
       while (cur!=null &&cur.val!=val){
           prev=cur;
           cur=cur.next;
       }
       prev.next=cur.next;
        return head;
    }
//    public ListNode deleteNode(ListNode head, int val) {
//        if(head.val == val) return head.next;
//        ListNode pre = head, cur = head.next;
//        while(cur != null && cur.val != val) {
//            pre = cur;
//            cur = cur.next;
//        }
//        if(cur != null) pre.next = cur.next;
//        return head;
//    }
//
//    作者：jyd
//    链接：https://leetcode-cn.com/problems/shan-chu-lian-biao-de-jie-dian-lcof/solution/mian-shi-ti-18-shan-chu-lian-biao-de-jie-dian-sh-2/
//    来源：力扣（LeetCode）
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

    public int[] exchange(int[] nums) {
        int len=nums.length;
        int left=0;
        int right=len-1;
        while (left<right){
            if (nums[left]%2!=0 && left<right){
                left++;
            }
            if (nums[right]%2==0 && left<right){
                right--;
            }
            if(left<right){
                int tmp=nums[left];
                nums[left]=nums[right];
                nums[right]=tmp;
            }
        }
        return nums;
    }

    public ListNode getKthFromEnd(ListNode head, int k) {
           int len=0;
           for (ListNode cur=head;cur!=null;cur=cur.next){
               len++;
           }
           int step=len-k;
           ListNode cur=head;
           for (int i=0;i<step;i++){
             cur=cur.next;
           }
           return cur;
    }


    public ListNode reverseList(ListNode head) {
        if(head==null){
            return  null;
        }
        if (head.next==null){
            return  head;
        }
        ListNode prev=null;
        ListNode newNode=null;
        ListNode cur=head;

        while (cur!=null){
            ListNode next=cur.next;
            if (next==null){
                newNode=cur;
            }
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return newNode;
    }

    public TreeNode mirrorTree(TreeNode root) {
     if (root==null){
         return null ;
     }
    TreeNode tmpNode=mirrorTree(root.left);
     root.left=mirrorTree(root.right);
     root.right=tmpNode;
     return root;
    }

    public boolean isSymmetric(TreeNode root) {
        if (root==null){
            return true;
        }
        TreeNode p=root.left;
        TreeNode q=root.right;
        return isMirror(p,q);
    }

    private boolean isMirror(TreeNode p, TreeNode q) {
        if (p==null && q==null){
            return true;
        }
        if (p==null ||q==null){
            return false;
        }
        return  p.val==q.val && isMirror(p.right,q.left) &&isMirror(p.left,q.right);
    }
    public int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        int[] tmp=new int[k];
        for (int i=0;i<k;i++){
          tmp[i]=arr[i];
        }
        return tmp;
    }

    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[0];
        }
        int l = 0;
        int r = matrix[0].length - 1;
        int t = 0;
        int b = matrix.length - 1;
        int x = 0;
        int[] res = new int[(r + 1) * (b + 1)];
        while (true) {
            for (int i = l; i <= r; i++) {
                res[x++] = matrix[t][i];
            }
            if (++t > b) break;
            for (int i = t; i <= b; i++) {
                res[x++] = matrix[i][r];
            }
            if (--r < l) break;
            for (int i = r; i >= l; i--) {
                res[x++] = matrix[b][i];
            }
            if (--b < t) break;
            for (int i = b; i >= t; i--) {
                res[x++] = matrix[i][l];
            }
            if (++l > r) break;
        }
        return res;
    }
//        if (matrix.length==0){
//            return new int[0];
//        }
//        int l=0;
//        int r=matrix[0].length-1;
//        int t=0;
//        int b=matrix.length;
//        int x=0;
//        int[] res=new int[(r+1)*(b+1)];
//        while (true){
//            for (int i=l;i<=r;i++){
//                res[x++]=matrix[t][i];//左到右
//            }
//            if (++t>b) break;
//            for (int i=t;i<=b;i++){
//                res[x++]=matrix[i][r];//上到下
//            }
//            if (l>--r)break;
//            for (int i=r;i>=l;i--){
//                res[x++]=matrix[b][i];//右到左
//            }
//            if (t>--b)break;
//            for (int i=b;i>=t;i--){
//                res[x++]=matrix[i][l];//上到下
//            }
//            if (++l>r)break;
//        }
//        return res;

//    public List<List<Integer>> result=null;
//    public List<List<Integer>> levelOrder(Test_0802.TreeNode root){
//        result=new ArrayList<List<Integer>>();
//        if (root==null){
//            return result;
//        }
//        helper(root,0);
//        return result;
//    }
//    public  void helper(Test_0802.TreeNode root, int level){
//        if (level==result.size()){
//            result.add(new ArrayList<Integer>());
//        }
//        result.get(level).add(root.val);
//        if (root.left!=null){
//            helper(root.left,level+1);
//        }
//        if (root.right!=null){
//            helper(root.right,level+1);
//        }
//    }
        public  List<List<Integer>> result=null;
        public List<List<Integer>> levelOrder(TreeNode root) {
          result=new ArrayList<List<Integer>>();
          if (root==null){
              return result;
          }
          helper(root,0);
          return result;

        }

    private void helper(TreeNode root, int level) {
        if (result.size()==level){
            result.add(new ArrayList<>());
        }
        result.get(level).add(root.val);
        if (root.right!=null ){
            helper(root.right,level+1);
        }
        if (root.left!=null){
            helper(root.left,level+1);
        }
    }
    public int majorityElement(int[] nums) {
     if (nums.length==0){
         return 0;
     }
     Arrays.sort(nums);
     int k=nums.length/2;
     return nums[k];
    }
    public int maxSubArray(int[] nums) {
      int len=nums.length;
      int[] dp=new int[len];
      dp[0]=nums[0];
       int  max=dp[0];
      for (int i=1;i<len;i++){
          dp[i]=Math.max(dp[i-1]+nums[i],nums[i]);
          max=Math.max(dp[i],max);
      }
      return max;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int b=matrix.length;
        System.out.println(b);
    }
}
