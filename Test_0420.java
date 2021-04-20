import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Test_0420 {

//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        while (scanner.hasNext()){
//            int n=scanner.nextInt();
//            if (n>1000){
//                n=999;
//            }
//            System.out.println(deletenum(n));
//        }
//    }
//
//    public static int deletenum(int n){
//        Queue<Integer> queue=new LinkedList<>();
//        for (int i=0;i<n;i++){
//            queue.add(i);
//        }
//        while (queue.size()!=1){
//            int count=2;
//            while (count-- !=0){
//                int tmp=queue.peek();
//                queue.poll();
//                queue.add(tmp);
//            }
//            queue.poll();
//        }
//        return queue.peek();
//    }


//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//
//        while (scanner.hasNext()){
//           String str=scanner.nextLine();
//           String[] s=str.split(" ");
//           int[] num=new int[s.length-1];
//
//           for (int i=0;i<s.length;i++){
//               num[i]=Integer.parseInt(s[i]);
//           }
//           int k=Integer.parseInt(s[s.length-1]);
//           int start=0;
//           int end=num.length-1;
//           int index=qSort(num,start,end);
//           while (index!=k){
//               if (index>k){
//                   end=index-1;
//                   index=qSort(num,start,end);
//
//               }else{
//                   start=index+1;
//                   index=qSort(num,start,end);
//               }
//           }
//           Arrays.sort(num,0,k);
//           for (int i=0;i<k;i++){
//               System.out.println(i==k-1?num[i]:num[i]+" ");
//           }
//        }
//    }
//    public static int qSort(int[] num,int start,int end){
//        int par=num[start];
//        while (start<end){
//            while (start<end && num[end]>=par){
//                end--;
//            }
//            num[start]=num[end];
//            while (start<end && num[start]<par){
//                start++;
//            }
//            num[end]=num[start];
//        }
//        num[start]=par;
//        return start;
//    }

//    public static void main(String[] args) {
//        Scanner  scanner=new Scanner(System.in);
//        String str=scanner.nextLine();
//        String[] ss=str.split(" ");
//        int k=Integer.parseInt(ss[ss.length-1]);
//        int[] arr=new int[ss.length-1];
//        for (int i=0;i<ss.length-1;i++){
//            arr[i]=Integer.parseInt(ss[i]);
//        }
//        Arrays.sort(arr);
//        for (int i=0;i<k;i++){
//            System.out.print(arr[i]+" ");
//        }
//    }
//public static void main(String[] args) {
//    Scanner scanner=new Scanner(System.in);
//    int n=scanner.nextInt();
//    int count=0;
//    for (int i=n;i>=1;i--){
//        int tmp=i;
//        while (tmp%5==0){
//            count++;
//            tmp/=5;
//        }
//    }
//    System.out.println(count);
//}

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        if (n>0){
            String str=String.valueOf(n);
            StringBuffer stringBuffer=new StringBuffer(str);
            System.out.println(stringBuffer.reverse());
        }
    }
}
