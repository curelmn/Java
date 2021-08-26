package test;

public class T0826 {
    public static void main(String[] args) {
       int[] arr={3,6,7,8,1,2};
       megerSort(arr);
       for (int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
       }
    }

    private static int getcloseway(int a, int b) {
        int tmp=a;
        int count=0;
        if (b-a<a){
            return b-a;
        }
        if (b-a==a){
            return 1;
        }
        while (a<=b){
            a=2*a;
            count++;
        }
        if (a==b){
            return count;
        }
        if (a>b){
            return count+(a-b);
        }
        return 0;
    }

    public static void megerSort(int[] arr){
        _mergeSort(arr,0,arr.length);
    }

    private static void _mergeSort(int[] arr, int left, int right) {
        if (right-left<=1){
            return;
        }
        int mid=(left+right)/2;
        _mergeSort(arr,left,mid);
        _mergeSort(arr,mid,right);
        merge(arr,left,mid,right);
    }

    private static void merge(int[] arr, int left, int mid, int right) {
//        if (left>=right){
//            return;
//        }
//        int cur1=left;
//        int cur2=mid;
//        int[] tmp=new int[right-left];
//        int tmpIndex=0;
//        while (cur1< mid && cur2 <right){
//            if (arr[cur1]<=arr[cur2]){
//                tmp[tmpIndex]=arr[cur1];
//                tmpIndex++;
//                cur1++;
//            }else{
//                tmp[tmpIndex]=arr[cur2];
//                tmpIndex++;
//                cur2++;
//            }
//        }
//        while (cur1<mid){
//            tmp[tmpIndex]=arr[cur1];
//            tmpIndex++;
//            cur1++;
//        }
//        while (cur2<right){
//            tmp[tmpIndex]=arr[cur2];
//            tmpIndex++;
//            cur2++;
//        }
//        for (int i=0;i<tmp.length;i++){
//            arr[left+i]=tmp[i];
//        }
        if (left >= right) {
            // 空区间就直接忽略~~
            return;
        }
        int[] tmp = new int[right - left];
        int tmpIndex = 0; // 这个下标表示当前元素该放到临时空间的哪个位置上.
        int cur1 = left;
        int cur2 = mid;
        while (cur1 < mid && cur2 < right) {
            // 此处 最好写成 <= , 目的就是稳定性.
            // 由于 cur1 是在左侧区间, cur2 是在右侧区间.
            // 此时如果发现 cur1 和 cur2 的值相等,
            // 就希望左侧区间的 cur1 在最终结果中仍然是在左侧.
            // 于是就先把 cur1 对应的元素给先放到结果中.
            if (arr[cur1] <= arr[cur2]) {
                // 把 cur1 对应的元素插入到临时空间中
                tmp[tmpIndex] = arr[cur1];
                tmpIndex++;
                cur1++;
            } else {
                // 把 cur2 对应的元素插入到临时空间中
                tmp[tmpIndex] = arr[cur2];
                tmpIndex++;
                cur2++;
            }
        }
        // 循环结束之后, 需要把剩余的元素也都给拷贝到最终结果里.
        while (cur1 < mid) {
            tmp[tmpIndex] = arr[cur1];
            tmpIndex++;
            cur1++;
        }
        while (cur2 < right) {
            tmp[tmpIndex] = arr[cur2];
            tmpIndex++;
            cur2++;
        }
        // 还需要把 tmp 的结果再放回 arr 数组. (原地排序)
        // 把原始数组的 [left, right) 区间替换回排序后的结果
        for (int i = 0; i < tmp.length; i++) {
            arr[left + i] = tmp[i];
        }
    }
}
