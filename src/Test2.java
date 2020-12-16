import java.util.Scanner;

public class Test2 {
//    public static double calculateItem(int n) {
//     return 1.0 / (n - 1) - 1.0 / n;
//  }
// // n 一定是偶数
//    public static double calculateSeries(int n) {
//        // 两个两个处理
//       double sum = 0;
//       for (int i = 2; i <= n; i += 2) {
//          sum += calculateItem(i);
//         }
//        return sum;
//   }

//    public static void main(String[] args) {

    //        Random random = new Random();
//        Scanner sc = new Scanner(System.in);
//        int guess = random.nextInt(100) + 1;
//        System.out.println("请输入要猜的数字（1-100）");
//        while (true) {
//            int num = sc.nextInt();
//            if (num < guess) {
//                System.out.println("猜小了");
//            } else if (num > guess) {
//                System.out.println("猜大了");
//            } else {
//                System.out.println("猜对了");
//                break;
//            }
//        int i=0;
//        int j=0;
//        double sum1=0;
//        double sum2=0;
//        //奇数部分
//        for(i=1;i<=100;i+=2){
//            sum1+=(1.0/i);
//        }
//        //偶数部分
//        for(j=2;j<=100;j+=2){
//            sum2+=(1.0/j);
//        }
//        System.out.println(sum1-sum2);
//        System.out.println("n = 10, sum = " + calculateSeries(10));
//        System.out.println("n = 100, sum = " + calculateSeries(100));
//
//
//    public static void printMultiplicationTable(int Linenum){
//        for(int i=1;i<=Linenum;i++){
//            for(int j=1;j<=i;j++){
//                System.out.printf("%d x %d=%-2d ",i,j,i*j);
//            }
//            System.out.println();
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();
//        printMultiplicationTable(num);
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int count=0;
//        while(n!=0){
//            if((n&1)==1){
//                count++;
//            }
//            n=n>>>1;
//        }
//        System.out.println(count);
//    }

    public static void print(int n){
        if(n>9){
            print(n/10);
        }
        System.out.println(n%10);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print(n);
    }
}

