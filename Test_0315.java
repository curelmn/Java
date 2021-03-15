public class Test_0315 {
        public int reverse(int x) {
            long n=0;
            while(x!=0){
                n=n*10+x%10;
                x=x/10;
            }
            return  (int)n==n?(int)n:0;
        }


    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }


    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int n=0;
        int m=x;
        while(x !=0){
            n=n*10+x%10;
            x=x/10;
        }
        return m==n;
    }
}
