package Test_0422;


import java.util.Objects;
import java.util.Scanner;


//class TreeNode{
//    int val;
//    TreeNode left=null;
//    TreeNode right=null;
//
//    public TreeNode(int val){
//        this.val=val;
//    }
//}
public class Test {
//    public static void main(String[] args) {
//        Object o = new Object() {
//            public boolean equals(Object obj) {
//                return true;
//            }
//        };
//        System.out.println(o.equals("Fred"));
//    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//
//            int ret = minfib(n);
//            System.out.println(ret);
//
//    }
//
//    public static int minfib(int n){
//        int fib1=0;
//        int fib2=1;
//
//        while (fib2<n){
//        int  fib3=fib1+fib2;
//            fib1=fib2;
//            fib2=fib3;
//        }
//        return(fib2-n)>(n-fib1)?(n-fib1):(fib2-n);
//
//    }
//
//    public int countWays(int x, int y) {
//        // write code here
//        if (x==1 || y==1){
//            return  1;
//        }
//        return  countWays(x-1,y)+countWays(x,y-1);
//    }
//
//    public TreeNode lca=null;
//    public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q){
//        if (root==null){
//            return  null;
//        }
//        find(root,p,q);
//        return  lca;
//    }
//    public boolean find(TreeNode root,TreeNode p, TreeNode q){
//        if (root==null){
//            return  false;
//        }
//        int mid=(root==p || root==q)?1:0;
//        int left=find(root.left,p,q)?1:0;
//        int right=find(root.right,p,q)?1:0;
//
//        if (mid+left+right ==2){
//            lca=root;
//        }
//        return (left+right+mid)>0;
//    }
//
//
//
//    //树中子节点与父节点的关系 root=child/2; 所以如果a !=b 就让最大的数除以2 如此循环
//    //直至a==b 即就是公共祖先
//    public int getLCA(int a, int b) {
//        // write code here
//        if (a==b ||a==b/2){
//            return  a;
//        }
//        if (b==a/2){
//            return b;
//        }
//        while (a !=b){
//            if (a>b){
//                a=a/2;
//            }else{
//                b=b/2;
//            }
//        }
//        return a;
//}
public static int seqByte1(int n) {
    //方法一
    int count = 0;
    int max = 0;
    while (n > 0) {
        int x = n & 0x1;
        if (x == 1) {
            count++;
            if (count > max) {
                max = count;
            }
        } else {
            count = 0;
        }
        n = n >> 1;
    }
    return max;
}
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            System.out.println(seqByte(num));
        }
    }

    public static int seqByte(int num){
        int count=0;
        int max=0;
        while (num>0){
            int x=num & 0x01;
            if (x==1){
                count++;
                if (count>max){
                    max=count;
                }
            }else{
                count=0;
            }
            num=num>>1;
        }
        return count;
    }


}
