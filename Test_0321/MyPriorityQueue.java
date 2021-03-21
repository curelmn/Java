package Test_0321;

public class MyPriorityQueue {


    public  static void shiftDown(int[] arr,int size,int index){
        int parent=index;
        int child=2*parent+1;
        while(child<size){
            if (child+1 <size && arr[child+1]>arr[child]){
                child=child+1;
            }
            if (arr[parent]<arr[child]){
                int tmp=arr[parent];
                arr[parent]=arr[child];
                arr[child]=tmp;
            }else{
                break;
            }
            parent=child;
            child=2*child+1;
        }
    }

    public static void shiftUp(int[] arr,int size, int index) {
        int child = index;
        int parent = (child - 1) / 2;
        while (child > 0) {
            if (arr[parent] < arr[child]) {
                int tmp = arr[parent];
                arr[parent] = arr[child];
                arr[child] = tmp;
            } else {
                break;
            }
            child = parent;
            parent = (child - 1) / 2;
        }
    }


        public static void creatHeap(int[] arr){
            for (int i=(arr.length-1-1)/2;i>=0;i--) {
                shiftDown(arr, arr.length, i);

            }
        }
        private int[] arr=new int[100];
    private  int size=0;



    public void offer(int val){
        if(size>=arr.length){
            return;
        }
        arr[size]=val;
        size++;

        shiftUp(arr,size,size-1);
    }

    public Integer peek(){
        if(size==0){
            return  null;
        }
        return arr[0];
    }

    public Integer poll(){
        if (size==0){
            return  null;
        }
        int res=arr[0];


        int tmp=arr[0];
        arr[0]=arr[size-1];
        arr[size-1]=tmp;

        size--;

        shiftDown(arr,size,0);
        return res;
    }
    }
