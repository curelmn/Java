import java.util.Scanner;

public class Test_0516 {
//    public static void main(String[] args) {
//        Scanner  scanner=new Scanner(System.in);
//
//        int[] arr=new int[10001];
//        arr[0]=1;
//        arr[1]=1;
//        arr[2]=2;
//        for (int i=3;i<arr.length;i++){
//            arr[i]=(arr[i-1]+arr[i-2])%10000;
//        }
//
//        int n=scanner.nextInt();
//        int m=0;
//        while (scanner.hasNext()){
//            for (int i=0;i<n;i++){
//                m=scanner.nextInt();
//                System.out.printf("%04d",arr[m]);
//            }
//        }
//    }




//    public static void main(String[] args) {
//        int[] fib = new int[10001];
//        fib[0] = 1;
//        fib[1] = 1;
//        // 如果这个数不足4位则用0填充，如果大于4位的则只输出最后4位。
//        for (int i = 2; i < fib.length; i++) {
//            fib[i] = (fib[i - 1] + fib[i - 2]) % 10000;
//        }
//        Scanner in = new Scanner(System.in);
//        int n, x;
//        n = in.nextInt();
//        while (in.hasNextInt()) {
//            while (n-- > 0) {
//                x = in.nextInt();
//                // 补上数的前几位是0的0,不足四位的前几位补0
//                int zero = 4 - String.valueOf(fib[x]).length();
//                while (zero-- > 0) {
//                    System.out.print("0");
//                }
//                System.out.print(fib[x]);
//            }
//        }
//    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();

            while (s.length() > 1) {
                int sum = 0;
                for (int i = 0; i < s.length(); i++) {
                    sum += s.charAt(i) - '0';
                    s=String.valueOf(sum);
                }
            System.out.println(sum);
        }

        }
    }


        public static void main(String[] args){
            Scanner scanner=new Scanner(System.in);
            while(scanner.hasNext()){
                String str=scanner.next();
                while(str.length()>1){
                    int result=0;
                    for(int i=0;i<str.length();i++)
                        result+=str.charAt(i)-'0';
                    str=String.valueOf(result);
                }
                System.out.println(str);
            }
        }
    }


