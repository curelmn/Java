package Test_0912;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        final Scanner reader = new Scanner(System.in);
        final String next = reader.next();
        String[] orders = next.substring(1, next.length() - 1).split(",");
        FooPrint foo = new FooPrint();
        Thread thread1 = new Thread(() -> {
            try {
                foo.first(() -> System.out.print("first"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread thread2 = new Thread(() -> {
            try {
                foo.second(() -> System.out.print("second"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread thread3 = new Thread(() -> {
            try {
                foo.third(() -> System.out.print("third"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        List<Thread> threads = Arrays.asList(thread1, thread2, thread3);
        for (int i = 0; i < orders.length; i++) {
            threads.get(Integer.parseInt(orders[i]) - 1).start();
        }
        reader.close();
    }
}

class FooPrint {

    public FooPrint() {
    }

    public void first(Runnable printFirst) throws InterruptedException {
        //待实现
    }

    public void second(Runnable printSecond) throws InterruptedException {
        //待实现
    }

    public void third(Runnable printThird) throws InterruptedException {
        //待实现
    }
}
//import java.util.Scanner;
//
//public class Main {
////    public static void main(String[] args) {
////        Scanner scanner=new Scanner(System.in);
////        while (scanner.hasNext()){
////            int n=scanner.nextInt();
////            int count=0;
////            for (int i=1;i<=n;i++){
////                for (int j=i+1;j<=n;j++){
////                    int res1=weisum(i);
////                    int res2=weisum(j);
////                    if (res1==res2){
////                        count++;
////                    }
////                }
////            }
////            System.out.println(count);
////        }
////    }
////    public static int weisum(int n){
////        int res=0;
////        int sum=0;
////        while (n!=0){
////            res=n%10;
////            n=n/10;
////            sum+=res;
////        }
////        return sum;
////    }
//    public static void main(String[] args) {
//       Scanner scanner=new Scanner(System.in);
//       while (scanner.hasNext()){
//
//       }
//    }
//}
