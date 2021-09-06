package Test_0903;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            int m=scanner.nextInt();
            int max=x>y?x:y;
            int[] arr1=new int[1001];
            int[] arr2=new int[1001];
            int index1=0;
            int index2=0;
            int count=0;
            for (int i=0;i<max;i++){
               int tmp=i*i;
               int tmp2=i*i*i;
               if (tmp>=x && tmp<=y){
                   arr1[index1++]=tmp;
               }
                if (tmp2>=x && tmp2<=y){
                    arr2[index2++]=tmp2;
                }
            }
           for (int i=0;i<arr1.length;i++){
               for (int j=0;j<arr2.length;j++){
                   if (Math.abs(arr1[i]-arr2[j])<=m){
                       count++;
                   }
               }
           }
            System.out.println(count);
        }
    }
}
