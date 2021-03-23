import java.util.Arrays;

public class Test_0323 {

    public static void insertSort(int[] arr) {
        int bound = 1;
        for (; bound < arr.length; bound++) {
            int v = arr[bound];
            int cur = bound - 1;

            for (; cur >= 0; cur--) {
                if (arr[cur] > v) {
                    arr[cur + 1] = arr[cur];
                }else{
                    break;
                }
            }
            arr[cur + 1] = v;
        }
    }

public static void shellSort(int[] arr) {

        int gap=arr.length/2;
        while (gap>=1){
            _shellSort(arr,gap);
            gap=gap/2;
        }
}

public static void _shellSort(int[] arr,int gap){
       int bound=gap;
       for (;bound<arr.length;bound++){
           int v=arr[bound];
           int cur=bound-gap;
           for (;cur>=0;cur-=gap){
               if (arr[cur]>v){
                   arr[cur+gap]=arr[cur];
               }else{
                   break;
               }
           }
           arr[cur+gap]=v;
       }
}
public static void selectSort(int[] arr){
        int bound=0;
        for (;bound<arr.length;bound++){
            for (int cur=bound+1;cur<arr.length;cur++){
                if (arr[cur]<arr[bound]){
                    swap(arr,cur,bound);
                }
            }
        }
}


public static void swap(int[] arr,int x,int y){
        int tmp=arr[x];
        arr[x]=arr[y];
        arr[y]=tmp;
}


public static void heapSort(int[] arr[]){
        createHeap(arr);
}
public static void createHeap(int[] arr){
        for (int i=(arr.length-1-1)/2;i>=0;i--){
            shiftDown(arr,arr.length,i);
        }
}
public static void shiftDown(int[] arr,int size,int index){
        int parent=index;
        int child=2*parent+1;

        while (child<size){
            if (child+1 <size &&arr[child+1] >arr[child]){
                child=child+1;
            }
            if (arr[parent] <arr[child]){
                swap(arr,parent,child);
            }else{
                break;
            }

            parent=child;
            child=2 *parent+1;
        }
}
    public static void main(String[] args) {
        int[] arr={9,5,2,7,3,6,8};
        //insertSort(arr);
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
