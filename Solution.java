

import org.apache.hadoop.yarn.webapp.hamlet2.Hamlet;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
        public static void main(String[] args) {
            Scanner   scanner=new Scanner(System.in);
            while (scanner.hasNext()){
                int count=0;
                String s=scanner.nextLine();
                char[] ss=s.toCharArray();
                StringBuilder str=new StringBuilder();
                for (int i=0;i<ss.length;i++){
                    if (ss[i]!=' '){
                        str.append(ss[i]);
                    }
                }
                int m=scanner.nextInt();
                int[] arr=new int[0];
                for (int i=0;i<s.length();i++){
                    arr[i]=Integer.parseInt(String.valueOf(str.charAt(i)));
                }
                for (int i=0;i<arr.length-1;i++){
                    for (int j=i+1;j<arr.length;j++){
                        if (arr[i]+arr[j]==m){
                            count++;
                        }
                    }
                }
                System.out.println(count);
            }
        }
    public char findKthBit (int n, int k) {
        // write code here
      String s=helper(n);
      char[] arr=s.toCharArray();
      return arr[k-1];
    }

    private String helper(int n) {
        Map<Integer,String> map=new HashMap<Integer, String>();
        map.put(1,"a");
        for (int i=2;i<27;i++){
            map.put(i,"a+i-1");
        }
        if (n==1){
           return "a";
        }
        String reverse=_reverse(helper(n-1),n);
        return helper(n-1)+map.get(n)+


    }

    private String _reverse(String s,int n) {
        Map<Integer,String> map=new HashMap<Integer, String>();
        map.put(1,"a");
        for (int i=2;i<27;i++){
            map.put(i,"a+i-1");
        }
        Map<Integer,String> map2=new HashMap<>();
            for (int i=1;i<27;i++){
                map2.put(1,"z-i-1");}
            char[] arr=s.toCharArray();
            StringBuilder str=new StringBuilder();

    }


}

