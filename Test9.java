import java.util.Arrays;

public class Test9 {
//    public static void main(String[] args) {
//        int[] arr={1,2,3,4,5,6};
//        transform(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//    public static void transform(int[] arr){
//        int left=0;
//        int right=arr.length-1;
//        while(left<right) {
//            while (left < right && arr[left] % 2 != 0) {
//                left++;
//            }
//            while (left < right && arr[right] % 2 == 0) {
//                right--;
//            }
//            int temp=arr[left];
//            arr[left]=arr[right];
//            arr[right]=temp;
//        }
//    }
//public static void main(String[] args) {
//    int  x=4;
//    int  y=8;
//    int  z=20;
//    max1(x,y,z);
//}
//public static void max1(int m,int n,int b){
//    int result1=m>n?m:n;
//    int ret=max2(result1,b);
//    System.out.println(ret);
//}
//public  static int  max2(int m,int n){
//    int result2=m>n?m:n;
//    return result2;
//
//}
//public static void main(String[] args) {
//    int a=10;
//    int b=30;
//    double c=10.0;
//    double d=28.0;
//    int ret1=max(a,b);
//    double ret2=max(c,d);
//    double ret3=max(c+d,a);
//    System.out.println("ret1= "+ret1);
//    System.out.println("ret2= "+ret2);
//    System.out.println("ret3= "+ret3);
//}
//public static int max(int a,int b){
//    return a>b?a:b;
//}
//public static double max(double a,double b){
//        return a>b?a:b;
//}
//public static double max(double a,int b){
//    return a>b?a:b;
//}
//
//
//
//public static void main(String[] args) {
//    int[] arr={1,2,3,4,5};
////    transform(arr);
//    printArray(arr);
//}
////public static void transform(int[] arr){
////    for(int i=0;i<arr.length;i++){
////        arr[i]=arr[i]*2;
////    }
////}
//public static void printArray(int[] arr){
//    for(int i=0;i<arr.length;i++){
//        System.out.print(arr[i]+" ");
//
//    }
//}
//
    //冒泡排序
//public static void main(String[] args) {
//    int[] arr={2,5,8,9,12,34,6,7,3};
//    bubblesort(arr);
//    System.out.println(Arrays.toString(arr));
//}
//public static void bubblesort(int[] arr){
//    for(int i=0;i<arr.length;i++){
//        for(int j=arr.length-1;j>i;j--){
//            if(arr[j-1]>arr[j]){
//                int temp=arr[j-1];
//                arr[j-1]=arr[j];
//                arr[j]=temp;
//            }
//        }
//      }
//    }

    //数组有序
//public static void main(String[] args) {
//    int[] arr1={2,1,3,7,4,5};
//    int[] arr2={1,2,4,6,8,10};
//    System.out.println(isSorted(arr1));
//    System.out.println(isSorted(arr2));
//}
//public static boolean isSorted(int[] arr){
//    for(int i=0;i<arr.length-1;i++){
//        if(arr[i]>arr[i+1]){
//            return false;
//        }
//    }
//    return true;
//}
    //二分查找
//    public static void main(String[] args) {
//        int[] arr={2,3,4,5,6,7,8,10,20,23};
//        int key=8;
//       int ret= binarySearch(arr,key);
//        System.out.println("找到了数字是："+ret);
//
//    }
//    public static int binarySearch(int[] arr,int key){
//        int left=0;
//        int right=arr.length-1;
//        while(left<=right){
//            int mid=(left+right)/2;
//            if(key<arr[mid]){
//                right=mid-1;
//            }else if(key>arr[mid]){
//                left=mid+1;
//            }else{
//               return arr[mid];
//            }
//        }
//      return -1;
//    }


//    public static void main(String[] args) {
//        int[] arr={1,2,3,4,5,6};
//        int[] newArr=new int[arr.length];
//        newArr=copyOf(arr);
//        System.out.println("newArr :"+ Arrays.toString(newArr));
//    }
//    public static int[] copyOf(int[] arr){
//        int[] ret=new int[arr.length];
//        for(int i=0;i<arr.length;i++){
//            ret[i]=arr[i];
//        }
//        return ret;
//    }
public static void main(String[] args) {
    int[] arr={1,2,3,4,5,6};
    System.out.println(toString(arr));
}
public static String toString(int[] arr){
    String ret="[";
    for(int i=0;i<arr.length;i++){
        ret+=arr[i];
        if(i!=arr.length-1){
            ret+=",";
        }
    }
    ret+="]";
    return ret;
}
  }
