import java.math.BigInteger;
import java.util.Scanner;

public class Test_0526 {
//    public static void main(String[] args) {
//        BigInteger[] fib=new BigInteger[82];
//        fib[0]=new BigInteger("1");
//        fib[0]=new BigInteger("1");
//        for(int i=2;i<82;i++){
//           fib[i]=fib[i-1].add(fib[i-2]);
//        }
//        Scanner scanner=new Scanner(System.in);
//        while (scanner.hasNext()){
//            int n=scanner.nextInt();
//            int m=scanner.nextInt();
//            BigInteger sum=new BigInteger("0");
//            for(int i=n;i<=m;i++){
//                sum=sum.add(fib[i]);
//            }
//            System.out.println(sum);
//        }
//    }
//
////    public static void main(String[] args){
////        BigInteger[] people=new BigInteger[85];
////        people[0]=new BigInteger("1");
////        people[1]=new BigInteger("1");
////        for(int i=2;i<85;i++){
////            people[i]=people[i-1].add(people[i-2]);
////        }
////        Scanner sc=new Scanner(System.in);
////        while(sc.hasNext()){
////            int from=sc.nextInt();
////            int to=sc.nextInt();
////            BigInteger result=new BigInteger("0");
////            for(int i=from-1;i<to;i++){
////                result=result.add(people[i]);
////            }
////            System.out.println(result);
////        }
////    }
//
//
//
//    public class Main{
//        public static void main(String[] args){
//            BigInteger[] people=new BigInteger[85];
//            people[0]=new BigInteger("1");
//            people[1]=new BigInteger("1");
//            for(int i=2;i<85;i++){
//                people[i]=people[i-1].add(people[i-2]);
//            }
//            Scanner sc=new Scanner(System.in);
//            while(sc.hasNext()){
//                int from=sc.nextInt();
//                int to=sc.nextInt();
//                BigInteger result=new BigInteger("0");
//                for(int i=from-1;i<to;i++){
//                    result=result.add(people[i]);
//                }
//                System.out.println(result);
//            }
//        }
//    }
public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    while (scanner.hasNext()){
        String s1=scanner.next();
        String s2=scanner.next();
        int count=0;
        while (s1.contains(s2)){
            s1=s1.replaceFirst(s2,"");
            count++;
        }
        System.out.println(count);
    }
}

}
