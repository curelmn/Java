package Test_0908;
import java.util.Stack;

class ListNode {
   int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
      ListNode dummy=new ListNode(0);
      int len=0;
      dummy.next=head;
      ListNode cur=head;
      ListNode prev=dummy;
      Stack<ListNode> stack=new Stack<>();
      while (head!=null){
          len++;
          head=head.next;
      }
      for (int i=0;i<len/k;i++){
          for (int j=0;j<k;j++){
              stack.push(cur);
              cur=cur.next;
          }
          for (int j=0;j<k;j++){
              prev.next=stack.pop();
              prev=prev.next;
          }
      }
      prev.next=cur;
      return  dummy.next;
    }

    public  static int[] sortArray(int[] nums) {
    _quicksort(nums,0,nums.length-1);
    return nums;
    }

    private static void _quicksort(int[] nums, int left, int right) {
        if (left>=right){
            return;
        }
        int index=partition(nums,left,right);
        _quicksort(nums,left,index-1);
        _quicksort(nums,index+1,right);
    }

    private static int partition(int[] nums, int left, int right) {
     int v=nums[right];
     int l=left;
     int r=right;
     while (l<r) {
         while (l < r && nums[l] <= v) {
             l++;
         }
         while (l < r && nums[r] >= v) {
             r--;
         }
         swap(nums, l, r);
     }
     swap(nums,l,right);
     return l;
    }

    private static void swap(int[] nums, int i, int j) {
        int tmp=nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;
    }

    public static void main(String[] args) {
        int[] arr={2,5,1,3,8,4,0};
        sortArray(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
