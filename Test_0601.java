import java.util.Scanner;

public class Test_0601 {
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        while (scanner.hasNext()){
//            int n=scanner.nextInt();
//            int m=scanner.nextInt();
//            int k=scanner.nextInt();
//            int[][] xy=new int[k][2];
//            for (int i=0;i<k;i++){
//                xy[i][0]=scanner.nextInt();
//                xy[i][1]=scanner.nextInt();
//
//            }
//            System.out.printf("%.2f",getway(n,m,xy));
//        }
//    }
//    public static  double getway(int n,int m,int[][] xy){
//        double[][] map=new double[n+1][m+1];
//        for (int[] a:xy){
//            map[a[0]][a[1]=-1;
//
//        }
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=m;j++){
//                if (map[i][j] !=-1){
//                    if (map[i-1][j]!=-1){
//                        map[i][j] += j == m ? map[i - 1][j] : map[i - 1][j] / 2;
//                    }
//                    if (map[i][j-1]!=-1){
//                        map[i][j] += i == n ? map[i][j - 1] : map[i][j - 1] / 2;
//                    }
//                }
//            }
//        }
//        return map[n][m];
//    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String s=scanner.nextLine();
            String[] arr=s.split(" ");

            int min=Integer.parseInt(arr[2]);
            int max=Integer.parseInt(arr[2]);

            char[] a=arr[0].toCharArray();
            char[] b=arr[1].toCharArray();
            long sum=0;
            for (int i=min;i<=max;i++){
                char a1=a[0];
                char b1=b[0];
                sum +=(long)Math.pow(26,i-1)*(b1-a1);
                long sum1=0;
                long sum2=0;
                for (int j=1;j<a.length;j++){
                    sum1=sum1+(a[j]-'a')*(long)Math.pow(26,i-1-j);
                }
                for (int j=1;j<b.length;j++){
                    sum2=sum2+(b[j]-'a')*(long)Math.pow(26,i-1-j);
                }
                sum=sum+sum2-sum1;
            }
            sum--;
            System.out.println(sum%1000007);


        }
    }
}
