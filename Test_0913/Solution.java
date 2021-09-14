package Test_0913;

import org.apache.hadoop.shaded.org.checkerframework.checker.units.qual.C;
import org.apache.hadoop.yarn.webapp.hamlet2.Hamlet;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Solution {
//
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        while (scanner.hasNext()){
//            int n=scanner.nextInt();
//            int ret=findstep(n);
//            System.out.println(ret);
//        }
//    }
//
//    private static int findstep(int n) {
//        if (n==1){
//            return 1;
//        }
//        if (n==2){
//            return  2;
//        }
//        return findstep(n-1)+findstep(n-2);
//    }
//public static void main(String[] args) {
//    Scanner  scanner=new Scanner(System.in);
//    while (scanner.hasNext()){
//        String  mi=scanner.next();
//        int upper=scanner.nextInt();
//        int lower=scanner.nextInt();
//        char[] arr=mi.toCharArray();
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]<'Z' && arr[i]>'A'){
//                arr[i]= (char) (arr[i]+upper);
//            }
//            if (arr[i]<'z' && arr[i]>'a'){
//                arr[i]= (char) (arr[i]+lower);
//            }
//        }
//        for (int i=0;i<arr.length;i++){
//            System.out.print(arr[i]);
//        }
//    }
//}

//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        while (scanner.hasNext()){
//            String s=scanner.next();
//            char[] arr=s.toCharArray();
//            Map<Character,Integer> map=new HashMap<>();
//            for (int i=0;i<arr.length;i++){
//                char c=arr[i];
//                if (!map.containsKey(c)){
//                    map.put(c,1);
//                }else {
//                    map.put(c,map.get(c)+1);
//                }
//            }
//            Integer res=0;
//            for (Map.Entry<Character,Integer> entry:map.entrySet()){
//                if (entry.getValue()==1){
//                    res=entry.getValue();
//                    break;
//                }
//            }
//            System.out.println(res);
//        }
//    }
public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    while (scanner.hasNext()){
        String s=scanner.next();
        int left=0; int right=0;
        boolean flag=false;
        for (int i=0;i<s.length();i++){
            left=s.indexOf(s.charAt(i));
            right=s.lastIndexOf(s.charAt(i));
            if (left==right){
                flag=true;
                System.out.println(left);
                break;
            }
            if (!flag){
                System.out.println(-1);
            }
        }
    }
}
}
