package Test_0124;

import java.util.Arrays;

public class T0124 {
//    public void getCustomerInfo() {
//
//        try {
//
//            // do something that may cause an Exception
//
//        } catch (java.io.FileNotFoundException ex) {
//
//            System.out.print("FileNotFoundException!");
//
//        } catch (java.io.IOException ex) {
//
//            System.out.print("IOException!");
//
//        } catch (java.lang.Exception ex) {
//
//            System.out.print("Exception!");
//
//        }
//
//    }
//
//    public int[] sortedSquares(int[] nums) {
//        int  i=0;
//        for(i=0;i<nums.length;i++){
//            nums[i]*=nums[i];
//        }
//        Arrays.sort(nums);
//        return   nums;
//    }
//    public String reverseOnlyLetters(String S) {
//        char[] ch = S.toCharArray();
//        int left = 0;
//        int right = ch.length - 1;
//        while (left < right) {
//            // 找到是字母的 left
//            while (left < ch.length && !Character.isLetter(ch[left])) {
//                left++;
//            }
//
//            // 找到是字母的 right
//            while (right >= 0 && !Character.isLetter(ch[right])) {
//                right--;
//            }
//
//            if (left < right) {
//                char temp = ch[left];
//                ch[left] = ch[right];
//                ch[right] = temp;
//                left++;
//                right--;
//            }
//        }
//        return new String(ch);
//    }
//public  static  void loop() {
//    int x= 10;
//    while ( x ) {
//        System.out.print("x minus one is " + (x - 1));
//        x -= 1;
//    }
//}
//
//    public static void main(String[] args) {
//        loop();
//    }
//public int[] sortArrayByParity(int[] A) {
//    int left=0;
//    int right=A.length-1;
//    while(left<right){
//        while(left<right&&A[left]%2==0){
//            left++;
//        }
//        while(left<right&&A[right]%2!=0){
//            right--;
//        }
//        int temp=A[left];
//        A[left]=A[right];
//        A[right]=temp;
//    }
//    return A;
//}
//
//    public int pivotIndex(int[] nums) {
//        int sum=0;
//        int leftsum=0;
//        for(int i=0;i<nums.length;i++){
//            sum+=nums[i];
//        }
//        for(int i=0;i<nums.length;i++){
//            if (leftsum==sum-leftsum-nums[i]){
//                return i;
//            }
//            leftsum+=nums[i];
//        }
//        return -1;
public int[] plusOne(int[] digits) {
    for(int i=digits.length-1;i>=0;i--){
        if(digits[i]!=9){
            digits[i]++;
            return digits;
        }
        digits[i]=0;
    }
    int[] temp=new int[digits.length+1];
    temp[0]=1;
    return temp;
}
//    }


    public int thirdMax(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return nums[0] > nums[1] ? nums[0] : nums[1];
        }
        long firstMax = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;
        for (int n : nums) {
            if (n > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = n;
            } else if (firstMax == n){
                continue;
            }else  if (n > secondMax) {
                thirdMax = secondMax;
                secondMax = n;
            } else if (n == secondMax) {
                continue;
            } else if (n > thirdMax) {
                thirdMax = n;
            }
        }
        return thirdMax == Long.MIN_VALUE ? (int)firstMax : (int)thirdMax;

    }
}
