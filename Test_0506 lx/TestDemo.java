package Test_0506;

import java.util.Scanner;
import  java.util.*;

public class TestDemo {
//    private static int count;
//
//
//    public static void main(String[] args) {
//        TestDemo test = new TestDemo(88);
//        System.out.println(TestDemo.count);
//
//        TestDemo( int a){
//            count = a;
//        }
//    }
//public static void main(String[] args) {
//    Scanner scanner=new Scanner(System.in);
//    while(scanner.hasNext()){
//        int n=scanner.nextInt();
//        if (n<=2){
//            System.out.println(-1);
//        }
//        if (n%2==1){
//            System.out.println(2);
//        }
//        else if (n%2==0){
//            if (n%4==0){
//                System.out.println(3);
//            }else{
//                System.out.println(4);
//            }
//        }
//    }
//}
 public static void main(String[] args) {
    Scanner  scanner=new Scanner(System.in);
    while(scanner.hasNext()){
        String  addend=scanner.nextLine();
        String  augend=scanner.nextLine();
        System.out.println(AddLongInteger(addend,augend));
    }
 }
    public static String AddLongInteger(String addend,String augend){
      char[] str1= new StringBuffer(addend).reverse().toString().toCharArray();
      char[]  str2= new StringBuffer(augend).reverse().toString().toCharArray();

      int len=Math.max(str1.length,str2.length);
      int[] result=new int[len];
      for (int i=0;i<len;i++){
          int temp=result[i];
          if (i<str1.length){
              temp+=str1[i]-'0';
          }
          if(i<str2.length){
              temp+=str2[i]-'0';
          }

          if(temp>9){
              temp-=10;
              result[i+1]=1;
          }
          result[i]=temp;
      }
      StringBuilder stringBuilder=new StringBuilder();
      int flag=len-1;
      if (result[len-1]==0){
          flag=result.length-2;
      }
      for (int i=flag;i>=0;i--){
          stringBuilder.append(result[i]);
      }
      return stringBuilder.toString();


    }
}
