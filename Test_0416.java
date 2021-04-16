import java.util.Scanner;

public class Test_0416 {


//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        String str1=scanner.nextLine();
//        String str2=scanner.nextLine();
//        int count=0;
//        for (int i=0;i<=str1.length();i++){
//            StringBuffer stringBuffer=new StringBuffer(str1);
//            stringBuffer.insert(i,str2);
//            if (isHuiWen(stringBuffer.toString())){
//                count++;
//            }
//        }
//        System.out.println(count);
//
//    }
//    public static boolean isHuiWen(String s){
//        int l=0;
//        int r=s.length()-1;
//        while (l<r){
//            if (s.charAt(l)==s.charAt(r)){
//                r--;
//                l++;
//            }else{
//                return false;
//            }
//        }
//        return true;
//    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] nums=new int[n];
        for (int i=0;i<n;i++){
            nums[i]=scanner.nextInt();

        }
        int maxNum=nums[0];
        int curMax=nums[0];
        for (int i=1;i<n;i++){
            curMax=Math.max(curMax+nums[i],nums[i]);
            if (curMax>maxNum){
                maxNum=curMax;
            }
        }
        System.out.println(maxNum);
    }
}
