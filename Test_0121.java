import java.util.Arrays;

public class Test_0121 {
//    String str=new String("hello");
//    char[]ch={'a','b'};
//    public static void main(String args[]){
//        Test_0121 ex=new Test_0121();
//        ex.change(ex.str,ex.ch);
//        System.out.print(ex.str+" and ");
//        System.out.print(ex.ch);
//    }
//    public void change(String str,char ch[]){
//        str="test ok";
//        ch[0]='c';
//    }

//    private float f = 1.0f;
//    int m = 12;
//    static int n = 1;
//    public static void main (String args[]) {
//        Test_0121 t = new Test_0121();
//        t.m
//    }

//判断是否有重复元素
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
//合并两个有序数组
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i != n; ++i) {
            nums1[m + i] = nums2[i];
        }
        // Arrays.sort(nums1);
        bubblesort(nums1);
    }
    public static void  bubblesort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=arr.length-1;j>i;j--){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }


}
