package Test_0427;

import java.util.Scanner;

public class T0427 {
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        int year=scanner.nextInt();
//        int month=scanner.nextInt();
//        int day=scanner.nextInt();
//        int n=caculatedays(year,month,day);
//        System.out.println(n);
//    }
//    public static  int caculatedays(int year,int month,int day){
//        int []months={31,28,31,30,31,30,31,31,30,31,30,31};
//        if (year<=0 || month<=0 ||day<=0 ||day>=months[month-1]){
//            return -1;
//        }
//        if (year%4==0 && year%100 !=0  ||year%400==0){
//            months[1]=29;
//        }
//        int sum=0;
//        for (int i=0;i<month-1;i++){
//            sum+=months[i];
//        }
//        return sum+day;
//    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int ret=findNumberOf1(n);
        System.out.println(ret);
    }
    public static  int findNumberOf1(int num){
          int count=0;
          for(int i=0;i<32;i++){
              if ((num &(1<<i))==(1<<i)){
                  count++;
              }
          }
          return  count;
    }
}
