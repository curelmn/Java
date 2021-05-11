import java.util.Scanner;

public class Test_0511 {
//    public static void main(String[] args) {
//        Scanner  scanner=new Scanner(System.in);
//        while (scanner.hasNext()){
//            String str=scanner.nextLine();
//            char[] arr=str.toCharArray();
//            StringBuilder stringBuilder=new StringBuilder();
//            for (int i=arr.length-1;i>=0;i--){
//                stringBuilder.append(arr[i]);
//            }
//            System.out.println(stringBuilder.toString());
//
//
//        }
//    }

//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        while (scanner.hasNext()){
//            String s1=scanner.nextLine();
//            String s2=scanner.nextLine();
//            char[] arr1=s1.toCharArray();
//            char[] arr2=s2.toCharArray();
//            int[][] result=new int[arr1.length+1][arr2.length+1];
//            if (s1.isEmpty() ||s2.isEmpty()){
//                System.out.println(0);
//            }
//            if (s1.equals(s2)){
//                System.out.println(s1);
//            }
//            int max=0;
//            int index=0;
//            for (int i=0;i<arr1.length;i++){
//                for (int j=i;j<arr2.length;j++){
//                    if (arr1[i]==arr2[j]){
//                        result[i+1][j+1]=result[i][j]+1;
//                        if (max<result[i+1][j+1]){
//                            max=result[i+1][j+1];
//                            index=j+1;
//
//                        }
//                    }
//                }
//            }
//
//        }
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int m = scanner.nextInt();
            while (m != 0) {
                int n = scanner.nextInt();
                int k = scanner.nextInt();
                int[] arr = new int[2 * n];

                for (int i = 0; i < 2 * n; i++) {
                    int temp = i;
                    for (int j = 0; i < m; j++) {
                        if (temp < n) {
                            temp = temp * 2;
                        } else {
                            temp = 2 * (temp - n) + 1;
                        }
                    }
                    arr[temp] = scanner.nextInt();
                }
                for (int i = 0; i < 2 * n; i++) {
                    if (i == 2 * n - 1) {
                        System.out.print(arr[i]);
                    } else {
                        System.out.print(arr[i] + "");
                    }
                }
                System.out.println();
                m--;
            }
        }

    }
}