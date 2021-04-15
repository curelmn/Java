
import java.util.Scanner;
import java.util.*;
public class Test_0415 {

//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        while (scanner.hasNext()){
//            String str=scanner.nextLine();
//            String[] arr=str.split(" ");
//
//            int a1=Integer.parseInt(arr[0]);
//            int a2=Integer.parseInt(arr[1]);
//            int a3=Integer.parseInt(arr[2]);
//            int a4=Integer.parseInt(arr[3]);
//
//            int A=(a1+a3)/2;
//            int B=(a4+a2)/2;
//            int B1=(a3-a1)/2;
//            int C=(a4-a2)/2;
//
//
//            if (B!=B1){
//                System.out.println("No");
//            }else{
//                System.out.print(A+" "+B+" "+C);
//            }
//        }
//    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        String[] arr=str.split(" ");
        int M=Integer.parseInt(arr[0]);
        int N=Integer.parseInt(arr[1]);


        StringBuffer  stringBuffer=new StringBuffer();
        int flag=1;
        if (M==0){
            System.out.println(0);
        }
        if (M<0){
            M=-M;
            flag=-1;
        }

        while (M>0){
            int div=M/N;
            int rem=M%N;
            if (0<=rem && rem<=9){
                stringBuffer.append(rem);

            }else{
               stringBuffer.append('A'+rem-10);
            }
            M=div;
        }
        if (flag==-1){
            stringBuffer.append('-');
        }
        stringBuffer.reverse();
        System.out.println(stringBuffer.toString());
    }
//    public String solve (int M, int N) {
//        // write code here
//        char[] arr = new char[32];
//        boolean positiveSign = true;
//        // 处理负数的情况
//        if (M < 0) {
//            M = -M;
//            positiveSign = false;
//        }
//        int index = arr.length - 1;
//        while (M != 0) {
//            // 计算除数
//            int divid = M / N;
//            // 计算余数
//            int rem = M - divid * N;
//            // 判断余数，从数组最后赋值
//            if (0 <= rem && rem <= 9) {
//                // 0 字符 + 数字 = 字符
//                arr[index--] = (char) ('0' + rem);
//            } else {
//                // 大写 + 数字 = 大写
//                arr[index--] = (char) ('A' + rem - 10);
//            }
//            // 继续计算除数
//            M = divid;
//        }
//        // 负数添加负号
//        if (!positiveSign) {
//            arr[index--] = '-';
//        }
//        // 截取结果
//        return new String(arr, index + 1, arr.length - index - 1);
//    }
}
