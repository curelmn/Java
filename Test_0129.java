import java.util.Scanner;

public class Test_0129 {

//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        int n=sc.nextInt();
//        int ret=fib(n);
//        System.out.println("第"+n+"个斐波那契数是："+ret);
//    }
//    public static int fib(int n){
//        if(n<2){
//            return n;
//        }
//        return fib(n-1)+fib(n-2);
//    }


//    public static void main(String[] args) {
//        int n=1234;
//        int ret =func(n);
//        System.out.println(ret);
//    }
//    public static int func(int n){
//        if(n<9){
//            return n;
//        }
//        return n%10+func(n/10);
//    }


    public static void main(String[] args) {
        int n=10;
       // int ret=sumfunc(n);
        int ret=func(n);
        System.out.println(ret);
    }
    public static int  func(int n){
        if(n<2){
            return 1;
        }
        return n*func(n-1);
    }
    public static int sumfunc(int n){
        if(n<2){
            return 1;
        }
        return func(n)+sumfunc(n-1);
    }
}
