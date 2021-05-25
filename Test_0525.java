import java.util.Scanner;

public class Test_0525 {
//    static   int[] monthday = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//    static   int[] salary = {0, 2, 1, 1, 2, 1, 2, 1, 2, 2, 2, 1, 2};
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()) {
//            int year1 = scanner.nextInt();
//            int month1 = scanner.nextInt();
//            int day1 = scanner.nextInt();
//            int year2 = scanner.nextInt();
//            int month2 = scanner.nextInt();
//            int day2 = scanner.nextInt();
//            if (isleapyear(year1)){
//                monthday[2]=29;
//            }
//            if (isleapyear(year2)){
//                monthday[2]=29;
//            }
//            int money=0;
//          if (year1==year2 && month1==month2 &&day1==day2){
//             money+=getMoney(salary,month1);
//           }
//
//           while (year1!=year2 || month1!=month2 || day1!=day2){
//               int temp=0;
//               if (year1==year2 && month1==month2){
//                   temp=day2-day1+1;
//                   money+=(getMoney(salary,month1)*temp);
//                   break;
//               }
//
//               temp=getDay(monthday,month1)-day1+1;
//               money+=(temp*getMoney(salary,month1)*temp);
//               ++month1;
//               if (month1==13){
//                   ++year1;
//                   month1=1;
//               }
//               day1=1;
//           }
//            System.out.println(money);
//
//        }
//    }
//
//
//    public static int getMoney(int[] arr, int month)  //获得每月每天的钱数
//    {
//        return arr[month];
//    }
//
//    public static int getDay(int[] arr,  int month) //获得每月的天数
//    {
//        return arr[month];
//    }
//
//    public static boolean isleapyear(int year) {
//        if (((year % 4 == 0 && year % 100 != 0) || year % 400 == 0))
//            return true;
//        return false;
//    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] fib=new int[100001];
        fib[0]=1;
        fib[1]=1;
        for (int i=2;i<fib.length;i++){
            fib[i]=(fib[i-1]+fib[i-2])%1000000;
        }
        while (scanner.hasNext()){

            int n=scanner.nextInt();

            System.out.printf((n<25?"%d\n":"%06d\n"),fib[n]);
        }
    }
}
