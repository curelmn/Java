package Test_0803;


import java.util.Stack;

public class MySort {
    public static void insertSort(int[] arr){
        int bound=1;
        for (;bound<arr.length;bound++){
            int v=arr[bound];
            int cur=bound-1;
            for (;cur>=0;cur--){
                if (arr[cur]>v){
                    arr[cur+1]=arr[cur];
                }else {
                    break;
                }
            }
            arr[cur+1]=v;
        }
    }
    //希尔排序
    public static void shellSort(int[] arr){
        int gap=arr.length/2;
        while (gap>=1){
            _shellSort(arr,gap);
            gap=gap/2;
        }
    }

    private static void _shellSort(int[] arr, int gap) {
        int bound=gap;
        for (;bound<arr.length;bound++){
            int v=arr[bound];
            int cur=bound-gap;
            if (arr[cur]>v){
                arr[cur+gap]=arr[cur];
            }else {
                break;
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
    public static  void swap(int[] arr,int x,int y){
        int tmp=arr[x];
        arr[x]=arr[y];
        arr[y]= tmp;
   }

   public static void heapSort(int[] arr) {
        //1.建立堆
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
            if (child+1<size && arr[child+1]>arr[child]){
                child=child+1;
            }
            if (arr[parent]<arr[child]){
                swap(arr,parent,child);
            }else {
                break;
            }
            parent=child;
            child=2*parent+1;
        }
   }
   public static  void quickSort(int[] arr){
        _quickSort(arr,0,arr.length-1);
   }
   public static  void _quickSort(int[] arr,int left,int right){
        if (left>=right){
            return;
        }
        int index=partition(arr,left,right);
        partition(arr,left,index-1);
        partition(arr,index+1,right);
   }
   public static int partition(int[] arr,int left,int right){
        //选取最右的元素作为基准值
       int v=arr[right];
       int l=left;
       int r=right;
       while (l<r){
           while (l<r && arr[l]<v){
               l++;
           }
           while (l<r && arr[r]>v){
               r++;
           }
           swap(arr,l,r);
       }
       swap(arr,l,right);
       return 1;
   }
   public static  void quickSortByLoop(int[] arr){
        //1.创建一个栈
       Stack<Integer> stack=new Stack<>();
       //2.根节点入栈，整个数组对应的区间
       stack.push(0);
       stack.push(arr.length-1);
       //3.循环取栈顶元素
       while (!stack.isEmpty()){
           int right=stack.pop();
           int left=stack.pop();
           if (left>=right){
               continue;
           }
           int index=partition(arr,left,right);
           stack.push(index+1);
           stack.push(right);
           stack.push(left);
           stack.push(index-1);
       }
   }

   public static void mergeSort(int[] arr){
        _mergeSort(arr,0,arr.length);
   }
   public static void _mergeSort(int[] arr,int left,int right){
        if (right-left<=1){
            return;
        }
        int mid=(left+right)/2;
        _mergeSort(arr,left,mid);
        _mergeSort(arr,mid,right);
        merge(arr,left,mid,right);
   }
    public static void merge(int[] arr,int left,int mid ,int right){
        if (left>=right){
            return;
        }
        int[] tmp=new int[right-left];
        int tmpIndex=0;
        int cur1=left;
        int cur2=mid;
        while (cur1<mid && cur2<right){
            if (arr[cur1]<=arr[cur2]){
                tmp[tmpIndex]=arr[cur1];
                tmpIndex++;
                cur1++;
            }else {
                tmp[tmpIndex]=arr[cur2];
                tmpIndex++;
                cur2++;
            }
        }
        while (cur1<mid){
            tmp[tmpIndex]=arr[cur1];
            tmpIndex++;
            cur1++;
        }
        while (cur2<right){
            tmp[tmpIndex]=arr[cur2];
            tmpIndex++;
            cur2++;
        }
        for (int i=0;i<tmp.length;i++){
            arr[left+i]=tmp[i];
        }
    }
}
