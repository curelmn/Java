import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class T0402 {
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        int n=scanner.nextInt();
//        int fib1=0;
//        int fib2=1;
//       while (fib2<n){
//           int fib3=fib1+fib2;
//           fib1=fib2;
//           fib2=fib3;
//       }
//
//
//       int ret=(fib2-n)>(n-fib1)?n-fib1:fib2-n;
//        System.out.println(ret);
        Scanner scanner=new Scanner(System.in);
        HashSet<String>  set=new HashSet<>();
        while(scanner.hasNext()){
            String line=scanner.nextLine();
            String[] arr=line.split(" ");
            for (String str: arr){
                set.add(str);
            }
        }
        System.out.println(set.size());
    }
}
