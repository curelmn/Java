package Test_0318;

import java.util.Scanner;

public class CreateTree {
    public static  class TreeNode{
        public char val;
        public TreeNode left;
        public  TreeNode right;

        public TreeNode(char val){
            this.val=val;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while(sc.hasNext()){
            String line=sc.next();
            TreeNode root=build(line);
            inOrder(root);
            System.out.println();
        }
    }

    public static int index=0;
    public static TreeNode build(String line){
        index=0;
        return  _build(line);
    }

    public static TreeNode _build(String line){
        char ch=line.charAt(index);

        if(ch=='#'){
            return  null;
        }
        TreeNode root=new TreeNode(ch);
        index++;
        root.left=_build(line);
        index++;
        root.right=_build(line);
        return root;
    }

    public  static void inOrder(TreeNode root){
        if (root==null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.val+" ");
        inOrder(root.right);
    }
}
