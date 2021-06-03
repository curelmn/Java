import java.util.Scanner;

public class Test_0603 {
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        long[] arr=new long[22];
//        arr[2]=1;
//        arr[3]=2;
//        for (int i=4;i<arr.length;i++){
//            arr[i]=(i-1)*(arr[i-1]+arr[i-2]);
//        }
//
//        while (scanner.hasNext()){
//            int n=scanner.nextInt() ;
//            System.out.println(arr[n]);
//        }
//    }
public static void main(String[] args) {
    Scanner  scanner=new Scanner(System.in);
    while (scanner.hasNext()){
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }

        System.out.println(LIS(arr));
    }
}

public static int LIS(int[] arr){
    int[] dp=new int[arr.length];
    dp[0]=1;
    int maxlen=dp[0];
    for (int i=1;i<arr.length;i++){
        dp[i]=1;
        for (int j=0;j<i-1;j++){
            if (arr[i]>arr[j] &&dp[j]+1>dp[i]){
                dp[i]=dp[j]+1;
            }
        }
        if (maxlen<dp[i]){
            maxlen=dp[i];
        }
    }
    return  maxlen;
}
}
