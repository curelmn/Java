import java.util.Scanner;

public class Test_0517 {
    public int jumpFloorII(int target) {
       int m=1;
       if (target<=0){
           return 0;
       }
      while (target>1){
          m=2*m;
          target--;
      }
       return m;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            double n=scanner.nextInt();
            double m=scanner.nextInt();
            if (n>(2*m*3.14)){
                System.out.println("No");
            }else {
                System.out.println("Yes");
            }
        }
    }
}
