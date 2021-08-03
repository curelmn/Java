package Test_0803;

public class MyPriorityQueue {
    public static  void shiftDown(int[] arr,int size,int index) {

//        int parent=index;
//        int child=2*parent+1;
//        while (child<size){
//            //需要找到左右字数中较大的值
//            // 左右子树下标差1
//            if (child+1<size && arr[child+1]>arr[child]){
//                child=child+1;
//            }
//            //上述条件执行完成后，就能保证child指向左右子树较大的元素
//            //拿父节点和刚才找出的这个较大的节点再去比较，看是否符合大堆要求
//            if (arr[parent]<arr[child]){
//                //不满足大堆的要求，交换两个元素
//                int tmp=arr[parent];
//                arr[parent]=arr[child];
//                arr[child]=tmp;
//            }else {
//                //调整完毕了，已经把父元素放到了合适的位置上
//                break;
//            }
//            //更新parent 和child 以备下次循环
//            parent=child;
//            child=2*parent+1;
        int parent = index;
        int child = 2 * parent + 1;

        while (child < size) {
         if (child+1<size && arr[child+1]>arr[child]){
             child=child+1;
         }
         if (arr[parent]<arr[child]){
             int tmp=arr[parent] ;
             arr[parent]=arr[child];
             arr[child]=tmp;
         }else {
             break;
         }
         parent=child;
         child=2*parent+1;
        }
    }
    public static  void shiftUp(int[] arr,int size,int index){

        int child=index;
        int parent=(child-1)/2;
        while (child>0){
            if (arr[parent]<arr[child]){
                int tmp=arr[parent];
                arr[parent]=arr[child];
                arr[child]=tmp;
            }else {
                break;
            }
            child=parent;
            parent=(child-1)/2;
        }

    }
    public static void createHeap(int[] array){
        for (int i=(array.length-1-1)/2;i>=0;i--){
            shiftDown(array,array.length,i);
        }
    }
    private  int[] arr=new  int[100];
    private int size=0;

    public void offer(int val){
        if (size>=arr.length){
            return;
        }
        arr[size]=val;
        size++;
        shiftUp(arr,size,size-1);
    }
    public void createHeap2(int[] arr){
        for (int x: arr){
            offer(x);
        }
    }

    public Integer peek(){
        if (size==0){
            return null;
        }
        return arr[0];
    }
    public Integer poll(){
        if (size==0){
            return null;
        }
        int result=arr[0];

        int tmp=arr[0];
        arr[0]=arr[size-1];
        arr[size-1]=tmp;
        size--;

        shiftDown(arr,size,0);
        return  result;

    }
}
