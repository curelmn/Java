package Test_0806;

import java.util.Arrays;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
      ListNode(int val) { this.val = val; }
   ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class Test_0806 {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[0];
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode newHead=new ListNode(0);
       ListNode newNode=newHead;
        int flag=0;
        while (l1!=null ||l2!=null){
            int x=l1!=null ?l1.val:0;
            int y=l2!=null ?l2.val:0;

            int sum=x+y+flag;
            if (sum>9){
                sum=sum%10;
                flag=1;
            }else {
                flag=0;
            }
            newNode.next=new ListNode(sum);
            l1=l1!=null?l1.next:null;
            l2=l2!=null?l2.next:null;

            newNode=newNode.next;
        }
        if (flag!=0){
            newNode.next=new ListNode(flag);
        }
        return newHead.next;
    }
    public int findRepeatNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i=0;i<nums.length;i++){
            if (nums[i]==nums[i+1]){
                return nums[i];
            }
        }
        return -1;
    }
    public String replaceSpace(String s) {
        if (s == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                stringBuilder.append("%20");
            } else {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }

    public int[] reversePrint(ListNode head) {
       ListNode cur=head;
       int len=0;
       while (cur!=null){
           cur=cur.next;
           len++;
       }
       int[] arr=new int[len];
       for (int i=len-1;i>=0;i--) {

               arr[i] = head.val;
               head = head.next;
       }
       return arr;
    }
    public int fib(int n) {
        if (n==1 ||n==0){
            return n;
        }

        int[] arr=new int[n+1];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<=n;i++){
            arr[i]=(arr[i-1]+arr[i-2])%1000000007;
        }
        return arr[n];
    }

    public int numWays(int n) {
        if (n==1 ||n==0){
            return n;
        }

        int[] arr=new int[n+1];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<=n;i++){
            arr[i]=(arr[i-1]+arr[i-2])%1000000007;
        }
        return arr[n];
    }

//    public int minArray(int[] numbers) {
//        int min=numbers[0];
//        for(int i=0;i<numbers.length;i++){
//            if (min>numbers[i]){
//                min=numbers[i];
//            }
//        }
//        return min;
//    }
    public int minArray(int[] numbers) {
       int low=0;
       int high=numbers.length-1;
       while (low<high){
           int pivot=low+(high-low)/2;
           if (numbers[pivot]<numbers[high]){
               high=pivot;
           }else if(numbers[pivot]>numbers[high]){
           low=pivot+1;
           }else {
               high=high-1;
           }
       }
       return numbers[low];
    }
}
