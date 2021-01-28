public class Test_0128 {
    public static void main(String[] args) {
        int[] arr={2,16,6,8,9,3,4};
        int ret=findUnsortedSubarray(arr);
        System.out.println(ret);
    }
    public static int findUnsortedSubarray(int[] nums) {
        int l=nums.length;
        int  r=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    l=Math.min(l,i);
                    r=Math.max(r,j);
                }
            }
        }
        return r-1<0?0:r-l+1;
    }
}
