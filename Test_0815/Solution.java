package Test_0815;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int jokder=0;
        for (int i=0;i<nums.length-1;i++){
            if (nums[i]==0){
                jokder++;
            }
            else if (nums[i]==nums[i+1]){
                return false;
            }

        }
        return nums[4]-nums[jokder]<5;
    }
    public int lastRemaining(int n, int m) {
        int pos=0;
        List<Integer> List=new ArrayList<>();
        for(int i=0;i<n;i++){
            List.add(i);
        }
        while(n>1){
            int tmp=(pos+m-1)%n;
            List.remove(tmp);
            pos=tmp;
            n--;
        }
        return List.get(0);
    }
    public int add(int a, int b) {
        while(b != 0) { // 当进位为 0 时跳出
            int c = (a & b) << 1;  // c = 进位
            a ^= b; // a = 非进位和
            b = c; // b = 进位
        }
        return a;
    }
}
