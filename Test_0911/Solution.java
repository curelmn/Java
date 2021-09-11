package Test_0911;

import java.net.ServerSocket;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String s=scanner.next();
            int count=0;
            int len=s.length();
           if (len==0 ||len<2){
               System.out.println(0);
           }
            String ss=new String();
            for (int i=0;i<len;i++){
                for (int j=i+1;j<=len;j++){
                    ss=s.substring(i,j);
                    if (Integer.parseInt(ss)%22==0){
                        count++;
                    }else {
                        continue;
                    }
                }
            }

            System.out.println(count);
        }
    }

//    public static void main(String[] args) {
//        String s="12345";
//        int len=s.length();
//        for (int i=0;i<len;i++){
//            for (int j=i+1;j<=len;j++){
//                System.out.println(s.substring(i,j));
//            }
//        }
//    }
}
