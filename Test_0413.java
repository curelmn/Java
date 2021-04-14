import java.util.Arrays;
import java.util.Scanner;

public class Test_0413 {
//    public abstract class   MyClass{
//        public int constInt=5;
//      public abstract  void methodq();
//        public void method(){
//
//        }
//    }
//    public  int method(){
//        static int i=0;
//        i++;
//        return  i;
//
//    }

//    public static  boolean is(String s){
//        return s.toLowerCase()=="admin";
//    }

//    public static void main(String[] args) {
////        Test_0413 test=new Test_0413();
////        test.method();
////        int j=test.method();
////        System.out.println(j);
//        System.out.println(is("Admin"));
//    }
//

//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//         while(scanner.hasNext()){
//             int n=scanner.nextInt();
//             scanner.nextLine();
//             int[] arr=new int[n];
//             for (int i=0 ;i<n;i++){
//                 arr[i]=scanner.nextInt();
//             }
//
//             int count=1;
//             int flag=0;
//             for (int i=1;i<n;i++){
//                 if (arr[i]>arr[i-1]){
//                     if (flag==0){//flag==1 递增
//                         flag=1;
//                     }
//                     if (flag==-1){//由减变增 count+1
//                         flag=0;
//                         count++;
//                     }
//                 }else if (arr[i]<arr[i-1]){//flag==-1 递减
//                     if (flag==0){
//                         flag=-1;
//                     }
//                     if (flag==1){ //由增变减 count+1
//                         flag=0;
//                         count++;
//                     }
//                 }
//             }
//             System.out.println(count);
//         }
//
//    }

//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        String s=scanner.nextLine();
//        String[] str=s.split(" ");
//        for (int i=str.length-1;i>=0;i--){
//            System.out.print(str[i]+" ");
//        }
//    }

//   public class person{
//        private String name="person";
//        int age=0;
//
//    }
//
//    public class child extends person{
//        public  String grade;
//
//        public void main(String[] args) {
//            person p=new child();
//            System.out.println(p.name);
//        }
//    }
//}

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()) {
//            String str = scanner.nextLine();
//
//            char[] ch = str.toCharArray();
//            StringBuffer stringBuffer = new StringBuffer();
//
//            for (int i = 0; i < ch.length; i++) {
//                if (ch[i] >= '0' && ch[i] <= '9') {
//                    stringBuffer.append(ch);
//                } else {
//                    stringBuffer.append(" ");
//                }
//            }
//
//            String str2 = ch.toString();
//            String[] str3 = str2.split("\\s+");
////            int maxsize = str3[0].length();
////            for (int i = 0; i < str3.length; i++) {
////                if (str3[i].length() > maxsize) {
////                    maxsize = str3[i].length();
////                }
////            }
//            int maxsize=0;
//            for (int i = 0; i < str3.length; i++) {
//                //如果String数组中的任意一个变量的长度大于maxSize,则更新maxSize的值
//                maxsize = str3[i].length() > maxsize ? str3[i].length() : maxsize;
//            }
//            for (int j = 0; j < str3.length; j++) {
//                if (maxsize == str3[j].length()) {
//                    System.out.print(str3[j]);
//                }
//            }
//        }
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while(sc.hasNext()){
//
//            String str = sc.nextLine();
//            StringBuffer stringBuffer = new StringBuffer();
//            for (char ch:str.toCharArray()) {
//
//                if(ch >= '0' && ch <= '9'){
//                    stringBuffer.append(ch);
//                }else{
//
//                    stringBuffer.append(" ");
//                }
//            }
//
//            String str1 = stringBuffer.toString();
//
//
//            String[] nums = str1.split("\\s+");
////            int maxSize = 0;
////            for (int i = 0; i < nums.length; i++) {
////
////                maxSize = nums[i].length() > maxSize ? nums[i].length() : maxSize;
////            }
//            int maxSize=nums[0].length();
//            for(int i=0;i<nums.length;i++){
//                if(nums[i].length()>maxSize){
//                    maxSize=nums[i].length();
//                }
//            }
//            for (int i = 0; i < nums.length; i++) {
//
//                if(maxSize == nums[i].length()){
//
//                    System.out.print(nums[i]);
//                }
//            }
//        }
//    }

    public int MoreThanHalfNum_Solution(int [] array) {
        Arrays.sort(array);
        int key=array[array.length/2];
        int count=0;
        for (int i=0;i<array.length;i++){
            if (key==array[i]){
                count++;
            }
        }
        if (count>array.length/2){
            return  key;
        }
        return 0;
    }
}