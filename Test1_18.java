import java.util.Arrays;

public class Test1_18 {
//    public static void main(String[] args) {
//        int k=3;
//        int[] nums={1,2,3,4,5,6,7,8};
//        rotate(nums,k);
//    }
//        public static void rotate(int[] nums, int k) {
//            k=k%nums.length;
//            reverse(nums,0,nums.length-1);
//            reverse(nums,0,k-1);
//            reverse(nums,k,nums.length-1);
//        }
//        public static void reverse(int[] nums,int start,int end){
//            while(start<end){
//                int temp=nums[end];
//                nums[end]=nums[start];
//                nums[start]=temp;
//                start++;
//                end--;
//            }
//                System.out.println(Arrays.toString(nums));
//
//        }
//public static void main(String[] args) {
//    int[] nums={1,3,4,5,6,7};
//    int target=2;
//    int ret=searchInsert(nums,target);
//    System.out.println(ret);
//
//}
//public static int  searchInsert(int[] nums, int target) {
//    int left=0;
//    int right=nums.length-1;
//    while(left<=right){
//        int mid=(left+right)/2;
//        if(nums[mid]<target){
//            left=mid+1;
//        }else{
//            right=mid-1;
//        }
//    }
//    return left;
//}
//public static void main(String[] args) {
//    int val=5;
//    int[] nums={2,3,5,6,5,8,9};
//    int ret=removeElement(nums,val);
//    System.out.println(ret);
//}
//public static int  removeElement(int[] nums, int val) {
//    int i=0;
//    for(int j=0;j<nums.length;j++){
//        if(nums[j]!=val){
//            nums[i]=nums[j];
//            i++;
//        }
//    }
//    return i;
//}
//public static void main(String[] args) {
//    String str="ABCDEF";
//    System.out.println(toLowerCase(str));
//}
//public static  String toLowerCase(String str) {
//    char[] ch=str.toCharArray();
//    for(int i=0;i<str.length();i++){
//        if(ch[i]>='A'&&ch[i]<='Z'){
//            ch[i]+=32;
//        }
//    }
//    return String.valueOf(ch);
//}
    }
