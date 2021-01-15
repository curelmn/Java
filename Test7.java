import java.util.Scanner;

public class Test7 {
//    public static void main(String[] args) {
//        int[] arr={1,2,3,4,1,2,3,4,5};
//        int ret=findSingle(arr);
//        System.out.println("只出现一次的数字是："+ret);
//    }
//    public static int findSingle(int[] arr){
//        int result=0;
//        for(int i=0;i<arr.length;i++){
//            result^=arr[i];
//        }
//
//        return result;
//    }
//public static void main(String[] args) {
//    Scanner sc=new Scanner(System.in);
//    int n=sc.nextInt();
//    int ret=Fib(n);
//    System.out.println("第n个斐波那契数是："+ret);
//}
//public static int Fib(int n){
//    if(n<=2){
//        return 1;
//    }
//    else
//      return Fib(n-1)+Fib(n-2);
//}
//public static void main(String[] args) {
//    Scanner sc=new Scanner(System.in);
//    int n=sc.nextInt();
//    int ret=fact(n);
//    System.out.println(ret);
//}
//public  static int  fact(int n){
//
//    int k=1;
//    int sum=0;
//    for(int i=1;i<=n;i++){
//        k=k*i;
//        sum+=k;
//    }
//    return sum;
//}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int ret=fact(n);
    System.out.println("n的阶乘是："+ ret);
}
public static int fact(int n ){
    int k=1;
    for(int i=1;i<=n;i++){
        k=k*i;
    }
    return  k;
}
}
