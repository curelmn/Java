import java.util.Arrays;
import java.util.Scanner;

public class Test_0610 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int n=scanner.nextInt();
            int[] arr=new int[n];
            int ret=MoreThanHalfNum_Solution(arr);
            System.out.println(ret);
        }
    }

    public  static int MoreThanHalfNum_Solution(int [] array) {
        Arrays.sort(array);
        int len=array.length;
        int index=len/2;
        int count=0;
        for (int i=0;i<len;i++){
            if (array[index]==array[i]){
                count++;
            }
        }
        if (count>=index){
            return array[index];
        }
        return 0;
    }
}
