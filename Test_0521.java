import java.util.Scanner;

public class Test_0521 {
    public int getFirstUnFormedNum(int[] arr) {

    }

    public static void main(String[] args) {
        Scanner  scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int n=scanner.nextInt();
            if (n==0){
                break;
            }
            int count =0;
            while (n>1){
                if (n %3==0){
                    n=n/3;
                }else {
                    n=n/3+1;
                }
                count++;
            }
            System.out.println(count);
        }
    }
}
