import java.util.Arrays;
import java.util.Scanner;

public class Test_0513 {
    //    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        while (scanner.hasNext()){
//            int  n=scanner.nextInt();
//            int  exp=scanner.nextInt();
//            for (int i=0;i<n;i++){
//               int beast=scanner.nextInt();
//               if (beast<=exp){
//                   exp+=beast;
//               }else{
//                   exp+=yueshu(exp,beast);
//               }
//            }
//
//            System.out.println(exp);
//        }
//    }
//    public static int yueshu(int n,int m){
//         int temp=0;
//         while (n%m!=0){
//             temp=n%m;
//            n=m;
//             m=temp;
//         }
//         return m;
//    }
//public static void main(String[] args) {
//    Scanner scanner=new Scanner(System.in);
//    while (scanner.hasNext()){
//        String s=scanner.nextLine();
//        char[] str=s.toCharArray();
//        int[] hash=new int[256];
//        for (int i=0;i<str.length;i++){
//            int tmp=str[i];
//            hash[tmp]++;
//        }
//        for (int i=0;i<str.length;i++){
//            int tmp=str[i];
//            if (hash[tmp]==1){
//                char c=char[tmp];
//                System.out.println(c);
//            }else {
//                System.out.println(-1);
//            }
//        }
//    }
//}
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()) {
//            String s = scanner.nextLine();
//            char[] str = s.toCharArray();
//            for (int i = 0; i < str.length; i++) {
//                if (s.indexOf(str[i]) == s.lastIndexOf(str[i])) {
//                    System.out.println(str[i]);
//                } else {
//                    System.out.println(-1);
//                }
//
//            }
//        }
//    }


//    public int getValue(int[] gifts, int n) {
//        // write code here
//        Arrays.sort(gifts);
//        int index=n/2;
//        int i=0;
//        int count=1;
//        for (;i<n;i++){
//            if (gifts[i]==gifts[index]){
//                count++;
//            }
//        }
//        if (count>n/2){
//            return gifts[index];
//        }else {
//            return  0;
//        }
//    }

public static int calStringDistance(String charA,String charB){


    return 0;
}
}

