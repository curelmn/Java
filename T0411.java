import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class T0411 {

//    static String i;
//    public int b;
//    void  method1(){}
//    static void method2(){}


    public static void main(String[] args) {
//        int sum=0;
//        Scanner scanner=new Scanner(System.in);
//        while (scanner.hasNext()){
//            int n=scanner.nextInt();
//            scanner.nextLine();
//            int[] arr=new int[3*n];
//
//            for (int i=0;i<3*n;i++){
//                arr[i]=scanner.nextInt();
//            }
//
//            Arrays.sort(arr);
//            for (int j=n;j<3*n;j+=2){
//                sum+=arr[j];
//            }
//        }
//        System.out.println(sum);
//    }

        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();


        char[] ch = s1.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (!s2.contains(String.valueOf(ch[i]))) {
                System.out.println(ch[i]);
            }
        }
    }
}
