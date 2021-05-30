import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test_0529 {
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        while (scanner.hasNext()){
//            int n=scanner.nextInt();
//            int size=0;
//            int maxsize=0;
//
//            for (int i=0;i<n;i++){
//                String id=scanner.next();
//                String s=scanner.next();
//
//                if (s.equals("connect")){
//                    size++;
//                    if (maxsize<size){
//                        maxsize=size;
//                    }
//                }else {
//                    size--;
//                }
//            }
//            System.out.println(maxsize);
//        }
//    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int n=scanner.nextInt();
            String[] arr=new String[n];
            for (int i=0;i<n;i++){
                arr[i]=scanner.nextLine();
            }
            Arrays.sort(arr);
            List<String> res=new ArrayList<>();
            for (int i=1;i<arr.length;i++){
                if (!arr[i].startsWith(arr[i-1]+"/")){
                    res.add(arr[i-1]);
                }
            }
            res.add(arr[n-1]);
            for (String s:res){
                System.out.println("mkdir -p"+s);
            }
            System.out.println();
        }
    }


//    链接：https://www.nowcoder.com/questionTerminal/433c0c6a1e604a4795291d9cd7a60c7a
//    来源：牛客网
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            int n = sc.nextInt();
//            String[] arr = new String[n];
//            for (int i = 0; i < arr.length; i ++ ) {
//                arr[i] = sc.next();
//            }
//            Arrays.sort(arr);
//            List<String> res = new ArrayList<>();
//            for (int i = 1; i < arr.length; i ++ ) {
//                if( ! arr[i].startsWith(arr[i - 1] + "/")) res.add(arr[i - 1]);
//            }
//            res.add(arr[n - 1]);
//            for (String s:res) {
//                System.out.println("mkdir -p " + s);
//            }
//            System.out.println();
//        }
//    }
}
