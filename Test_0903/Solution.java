package Test_0903;

import java.util.Scanner;

public class Solution {
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        while (scanner.hasNext()) {
//            int n = scanner.nextInt();
//            String s1 = scanner.nextLine();
//            String s2 = scanner.nextLine();
//            if (s1.equals(s2)) {
//                System.out.println(0);
//            }
//            if (s1.equals("") || s2.equals("")){
//                System.out.println(0);
//            }
//            char[] a1 = s1.toCharArray();
//            char[] a2 = s2.toCharArray();
//            int left = 0;
//            int right = n - 1;
//            int count=0;
//            boolean flag=false;
//            while (left <= right) {
//                while (left<=right) {
//                    if (a1[left]==a2[left]) {
//                        left++;
//                    }
//                }
//                while (left<=right) {
//                    if (a1[right] == a2[right]) {
//                        right--;
//                    }
//                }
//                for (int i=left;i<=right;i++){
//                    flag=true;
//                    if (a2[i]==0){
//                        a2[i]=1;
//                    }else {
//                        a2[i]=0;
//                    }
//                }
//                if (flag){
//                    count++;
//                }
//            }
//            System.out.println(count);
//        }
//    }

    public static void main(String[] args) {
        int n=3;
        String s1="111";
        String s2="101";
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        int left = 0;
        int right = n - 1;
        int count=0;
        boolean flag=false;
        while (left <= right) {
            while (left<=right) {
                if (a1[left]==a2[left]) {
                    left++;
                }
            }
            while (left<=right) {
                if (a1[right] == a2[right]) {
                    right--;
                }
            }
            for (int i=left;i<=right;i++){
                flag=true;
                if (a2[i]==0){
                    a2[i]=1;
                }else {
                    a2[i]=0;
                }
            }
            if (flag){
                count++;
            }
        }
        System.out.println(count);

    }
}
