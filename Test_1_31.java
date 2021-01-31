import java.util.HashMap;
import java.util.Scanner;

public class Test_1_31 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String str=sc.next();
//        char[] ch1=str.toCharArray();
//        int len=ch1.length;
//        char[] ch2=new char[len];
//        int i=0;
//        int j=0;
//        ch2[0]=ch1[0];
//        for(i=1;i<len;i++){
//          if(ch2[j]!=ch1[i]){
//              j++;
//              ch2[j]=ch1[i];
//          }
//        }
//        for(int k=0;k<len;k++){
//            System.out.println(ch2[k]);
//        }
//
//    }
//
//
//
//
//    class Solution {
//        private int sum=0;
//        public int getImportance(List<Employee> employees, int id) {
//            Map<Integer,Employee>map=new HashMap<>();
//            for(Employee e:employees)
//                map.put(e.id,e);
//            return dfs(id,map);
//        }
//        public int dfs(int id,Map<Integer,Employee>map){
//            sum+=map.get(id).importance;
//            for(int a:map.get(id).subordinates)
//                dfs(a,map);
//            return sum;
//        }
//    }
//
//
//
//    class Solution {
//        public boolean canThreePartsEqualSum(int[] arr) {
//            int len=arr.length;
//            int sum=0;
//            for(int i=0;i<len;i++){
//                sum+=arr[i];
//            }
//            if(sum%3!=0){
//                return false;
//            }
//
//            int sum1=sum/3;
//            int sum2=0;
//            int count=0;
//            for(int i=0;i<len;i++){
//                sum2+=arr[i];
//                if(sum2==sum1){
//                    count++;
//                    sum2=0;
//                }
//            }
//
//            return count==3||(sum==0&&count>3);
//        }
//    }





}
