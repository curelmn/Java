
public class MySort {
    public static  void   quicksort(int[] arr){
        _quicksort(arr,0,arr.length-1);
    }

    private static void _quicksort(int[] arr, int left, int right) {
        if (left>right){
            return;
        }
        int index=partition(arr,left,right);
        partition(arr,left,index);
        partition(arr,index+1,right);
    }

    private static int partition(int[] arr, int left, int right) {
        int l=left;
        int r=right;
        int v=arr[right];
        while (l<r){
            if (l<r && arr[l]<v){
                l++;
            }
            if (l<r && arr[r]>v){
                r--;
            }

            swap(arr,l,r);
        }
        swap(arr,l,right);
        return  l;
    }

    private static void swap(int[] arr, int l, int r) {
        int tmp=arr[l];
        arr[l]=arr[r];
        arr[r]=tmp;
    }

    public static void mergeSort(int[] arr){
        _mergeSort(arr,0,arr.length);
    }

    private static void _mergeSort(int[] arr, int left, int right) {
        if (right-left<=1){
            return;
        }
        int mid=(right+left)/2;
        _mergeSort(arr,left,mid);
        _mergeSort(arr,mid,right);
        merge(arr,left,mid,right);
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        if (left>=right){
            return;
        }
        int tmp[] =new int[right-left];
        int tmpIndex=0;
        int cur1=left;
        int cur2=mid;
        while (cur1<mid &&cur2<right){
            if (arr[cur1]<=arr[cur2]){
                tmp[tmpIndex]=arr[cur1];
                cur1++;
                tmpIndex++;
            }else{
                tmp[tmpIndex]=arr[cur2];
                cur2++;
                tmpIndex++;
            }
        }
        while (cur1<mid){
            tmp[tmpIndex]=arr[cur1];
            cur1++;
            tmpIndex++;
        }
        while (cur2<right){
            tmp[tmpIndex]=arr[cur2];
            cur2++;
            tmpIndex++;
        }
        for (int i=0;i<tmp.length;i++){
            arr[left+i]=tmp[i];
        }
    }

    public static void heapSort(int[] arr){
        createheap(arr);
    }

    private static void createheap(int[] arr) {
        for (int i=(arr.length-1-1);i>=0;i--){
            shiftDown(arr,arr.length,i);
        }
    }

    private static void shiftDown(int[] arr, int size, int index) {
        int parent=index;
        int child=2*parent+1;
        while (child<size){
            if (child<size && child+1<size && arr[child+1]>arr[child]){
                child=child+1;
            }
            if (arr[parent]<arr[child]){
                swap(arr,parent,child);
            }else {
                break;
            }
        }
        parent=child;
        child=2*parent+1;
    }
}
