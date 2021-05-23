import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test_0523 {
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        while (scanner.hasNext()){
//            int year=scanner.nextInt();
//            int month[]=new int[]{1,2,5,9,11};
//            int len=month.length;
//            int wek[]=new int[len];
//
//            Calendar cal=Calendar.getInstance();
//            try{
//                SimpleDateFormat dateFormat=new SimpleDateFormat("YYYY-M-D");
//                for (int i=0;i<len;i++){
//                    Date date=dateFormat.parse(year+"-"+month[i]+"-1");
//                    cal.setTime(date);
//                    int week=cal.get(Calendar.DAY_OF_WEEK)-1;
//                    if (week==0){
//                        week=7;
//                    }
//                    wek[i]=week;
//                    System.out.println(week);
//                }
//            }catch (Exception e){
//
//            }
//            System.out.println(year+"-01-01");
//
//            //一月的第三个星期一
//            int jan=wek[0];
//            int rs=0;
//            String strRs="";
//            if (jan==1){
//                rs=2*7+1;
//            }else {
//                rs=3*7-(jan-1)+1;
//            }
//            strRs=rs/10==0?"0"+rs:String.valueOf(rs);
//            System.out.println(year+"-01-"+strRs);
//
//            //二月的第三个星期一
//            int feb=wek[1];
//            if (feb==1){
//                rs=2*7+1;
//            }else {
//                rs=3*7-(jan-1)+1;
//            }
//            strRs=rs/10==0?"0"+rs:String.valueOf(rs);
//            System.out.println(year+"-02-"+strRs);
//
//            //五月的最后一个星期一
//            int may=wek[2];
//            if (may>=6){
//                rs=may==6?31:30;
//            }else{
//                rs=4*7-(may-1)+1;
//            }
//            strRs=rs/10==0?"0"+rs:String.valueOf(rs);
//            System.out.println(year+"-05-"+strRs);
//            System.out.println(year+"-07-04");
//
//
////9月的第一个星期一
//            int sep=wek[3];
//            if(sep==1){
//                rs=1;
//            }
//            else{
//                rs=1*7-(sep-1)+1;
//            }
//            strRs=rs/10==0?"0"+rs:String.valueOf(rs);
//            System.out.println(year+"-09-"+strRs);
//
//            //11月的第四个星期四
//            int nov=wek[4];
//            rs=4*7-(nov-1)+1+3;
//            strRs=rs/10==0?"0"+rs:String.valueOf(rs);
//            System.out.println(year+"-11-"+strRs);
//
//            System.out.println(year+"-12-25");
//            System.out.println();
//        }
//    }
public static void main(String[] args) {
    Scanner  scanner=new Scanner(System.in);
    while (scanner.hasNext()){
        int n=scanner.nextInt();
        System.out.print(n+"=");

        if (isprime(n)){
            System.out.print(n);
            continue;
        }
        for (int i=2;i<Math.sqrt(n);i++){
            if (n%i==0){
                while (n%i==0){
                    n/=i;
                    System.out.print(i);
                    if (n!=1){
                        System.out.print("*");
                    }
                }
            }
        }
        if (n!=1){
            System.out.print(n);
            System.out.println();
        }
    }
}
    public static boolean isprime (int n){
        for (int i=2;i<Math.sqrt(n);i++){
            if (n%i==0){
                return false;
            }

        }
        return true;
    }


}
