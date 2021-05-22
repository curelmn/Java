import java.util.Scanner;

public class Test_0522 {

//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        while (scanner.hasNext()){
//            String s=scanner.nextLine();
//            char[] arr=s.toCharArray();
//            StringBuilder stringBuilder=new StringBuilder();
//            for (int i=0;i<arr.length;i++){
//                if ('A'<=arr[i] &&arr[i]<='E'){
//                    stringBuilder.append(arr[i]+=21);
//
//                }else if ('F'<=arr[i] &&arr[i]<='Z'){
//                    stringBuilder.append(arr[i]-=5);
//                }else{
//                    stringBuilder.append(arr[i]);
//                }
//            }
//            System.out.println(stringBuilder.toString());
//        }
//    }
public static void main(String[] args) {
    Scanner  scanner=new Scanner(System.in);
    while (scanner.hasNext()){
        int n=scanner.nextInt();
        int count =0;
        if (isprime(n)){
            System.out.println(1);
            continue;
        }
        for (int i=2;i<Math.sqrt(n);i++){
            if (n%i==0){
                while (n%i==0){
                    n/=i;
                }
                count++;
            }
        }
        if (n!=1)
            count++;
        System.out.println(count);
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
