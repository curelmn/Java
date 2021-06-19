public class Main {

    public static void main(String[] args) {
        int[] a = {1,2};
        swap(a, 0, 1);
    }
    private static void swap(int[] a, int m, int n){
        int tmp = a[m];
        a[m] = a[n];
        a[n] = tmp;
    }
}
