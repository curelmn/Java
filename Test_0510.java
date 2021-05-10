import java.util.Scanner;

public class Test_0510 {
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        while(scanner.hasNext()){
//            int n=scanner.nextInt();
//            if (n==1){
//                System.out.println(0);
//                break;
//            }
//            if (n==0){
//                break;
//            }
//            int m=n/3+n%3;
//            int ret=n/3;
//            if (m>=3){
//                do{
//                    ret+=m/3;
//                    m=m%3+m/3;
//                }while (m>=3);
//
//                if (m==1){
//                    System.out.println(ret);
//                }
//                if (m==2){
//                    System.out.println(ret+1);
//                }
//            }
//            else if (m==1){
//                System.out.println(ret);
//            }
//            else {
//                System.out.println(ret+1);
//            }
//        }
//    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String  str1=scanner.nextLine();
            String  str2=scanner.nextLine();

            System.out.println(maxString(str1,str2));


        }
    }


    public static String maxString(String s1,String s2){
        if (s1==null ||s2==null){
              return  null;
        }
        if (s1.equals(s2)){
            return  s1;
        }
        char[] arr1=s1.toCharArray();
        char[] arr2=s2.toCharArray();
        int left=0;
        int right=0;
        int len=Math.min(arr1.length,arr2.length);
        int len2=Math.max(arr1.length,arr2.length);
        for (int i=0;i<len;i++){
            for (int j=0;i<len2;i++)
        }
    }
}
