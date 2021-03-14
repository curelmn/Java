package Test_0314;


import java.util.ArrayList;
import java.util.List;

class Node{
    String val;
    Node left;
    Node right;

    public Node(String val){
        this.val=val;
    }
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val){
        this.val=val;
    }
}
public class BinaryTree {
    //创建一个树
    public static  Node bulid(){
        Node a= new Node("A");
        Node b= new Node("B");
        Node c= new Node("C");
        Node d= new Node("D");
        Node e= new Node("E");
        Node f= new Node("F");
        Node g= new Node("G");

        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        e.left=g;
        c.right=f;
        return  a;
    }
    //1.先序遍历
    public static  void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    //2.中序遍历
    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.println(root);
        inOrder(root.right);
    }

    //3.后序遍历
    public static void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.val);
    }

    //使用count，记录元素的个数
    //4.求节点个数
    public static int count=0;

    public static void length(Node root){
        if(root==null){
            return;
        }
        count++;
        length(root.left);
        length(root.left);
    }

    public static  int length2(Node root){
        if(root==null){
            return  0;
        }
        return  1+length2(root.left)+length2(root.right);
    }
    //5.求叶子节点个数
    public static int leafSize=0;
    public static void getLeafSize(Node root){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            leafSize++;
        }
        getLeafSize(root.left);
        getLeafSize(root.right);
    }
    public static int getLeafSize2(Node root){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return  1;
        }
        return  getLeafSize2(root.left)+getLeafSize2(root.right);
    }

    //6.获取某一层有多少个节点
    public static int getKleveSize(Node root,int k){
        if(root==null || k<1){
            return 0;
        }
        if(k==1){
            return 1;
        }
        return  getKleveSize(root.left,k-1)+getKleveSize(root.right,k-1);

    }

    //7.查找节点
    public static  Node find(Node root,String toFind){
        if(root==null){
            return  null;
        }
        if(root.val.equals(toFind)){
            return  root;
        }
        Node result=find(root.left,toFind);
        if(result !=null){
            return  result;
        }
        return find(root.right,toFind);
    }
       //8.求二叉树的高度
    public static int  getHeight(Node root){
        if(root==null){
            return  0;
        }
        int leftHeigth=getHeight(root.left);
        int rigtHeigth=getHeight(root.right);
        return  1+(leftHeigth>rigtHeigth?leftHeigth:rigtHeigth);
    }

    //判断两个二叉树是不是相等
    public boolean isSanmeTree(TreeNode p,TreeNode q){

        if(p==null && q==null){
            return  true;
        }
        if(p==null  || q==null){
            return  false;
        }
        if(p.val !=q.val){
            return false;
        }
        return  isSanmeTree(p.left,q.left) &&isSanmeTree(p.right,q.right);

    }
    //判断这棵树是不是另一颗的子树

    public boolean isSubTree(TreeNode s,TreeNode t){
        if(s==null){
            return  false;
        }
        boolean ret=isSanmeTree(s,t);
        if(ret){
            return  ret;
        }
        return isSubTree(s.left,t) || isSubTree(s.right,t);
    }


    public List<Integer> preoderTraversal(TreeNode root){
        List<Integer> result =new ArrayList<>();
        if(root==null){
            return result;
        }
        result.add(root.val);
        result.addAll(preoderTraversal(root.left));
        result.addAll(preoderTraversal(root.right));
        return  result;
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        result.addAll(inorderTraversal(root.left));
        result.add(root.val);
        result.addAll(inorderTraversal(root.right));
        return  result;
    }
    public static void main(String[] args) {
            Node root=bulid();
            preOrder(root);
            inOrder(root);
            postOrder(root);
            length(root);
        System.out.println(count);
        System.out.println(length2(root));
        getLeafSize2(root);
        System.out.println(leafSize);
        System.out.println(getLeafSize2(root));
        System.out.println(getKleveSize(root,3));
    }




}
