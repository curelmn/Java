import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;
import java.io.IOException;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
//        int i=0;
//        int count=0;
//        for(i=0;i<=100;i++) {
//            if((i%10==9)||(i%10==9)){
//                count++;
//            }
//
//        }
//        System.out.println(count+1);

//        int year=0;
//        for(year=1000;year<=2000;year++){
//            if((year%4==0&&year%100!=0)||year%400==0){
//                System.out.println(year);
//            }
//        }
//        int i = 0;
//        int j = 0;
//        for (i = 2; i <= 100; i++) {
//            boolean flag = true;
//
//            for (j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    flag = false;
//                    break;
//                }
//
//            }
//            if (flag) {
//                System.out.println(i);
//            }
//        }
//          int num=5;
//          int i=0;
//          for(i=2;i<10;i++){
//              if(num%i==0){
//                  System.out.println(num +"不是素数");
//                  break;
//              }else{
//                  System.out.println(num + "是素数");
//                  break;
//              }
//          }

//          Scanner sc=new Scanner(System.in);
//          System.out.println("请输入年龄： ");
//          int age=sc.nextInt();
//          if(age<18){
//              System.out.println("少年");
//          }else if(age>=18&&age<=28){
//              System.out.println("青年");
//          }else if(age>28&&age<=55){
//              System.out.println("中年");
//          }else if(age>=56){
//              System.out.println("老年");
//          }



                Scanner sc=new Scanner(System.in);
                while(sc.hasNext()){
                    int n=sc.nextInt();
                    int i=0;
                    int j=0;
                    for(i=1;i<=n;i++){
                        for(j=1;j<=n;j++){
                            if(i==j||i==n-j+1){
                                System.out.print("*");
                            }else{
                                System.out.print(" ");
                            }

                        }
                        System.out.println();
                    }
                }
            }
        }

