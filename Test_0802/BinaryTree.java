package Test_0802;

import Test_0321.Tree;
import org.apache.hadoop.mapreduce.lib.join.TestWrappedRRClassloader;
import org.apache.hadoop.metrics2.util.Metrics2Util;
import org.apache.hadoop.shaded.org.checkerframework.checker.units.qual.C;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
    public static Node build(){
        Node a=new Node("A");
        Node b=new Node("B");
        Node c=new Node("C");
        Node d=new Node("D");
        Node e=new Node("E");
        Node f=new Node("F");
        Node g=new Node("G");

        a.left=b;
        b.right=c;
        b.left=d;
        b.right=e;
        e.left=g;
        c.right=f;
        return a;
    }
    //先序遍历
    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }
    //中序遍历
    public static void inOrder (Node root){
        if (root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val);
        inOrder(root.right);

    }
    //后序遍历
    public static void postOrder(Node root){
        if (root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val);
    }

    public static  int count=0;
    public static void length(Node root){
        if (root==null){
            return;
        }
        count++;
        length(root.left);
        length(root.right);
    }

    public static int length2(Node root){
        if (root==null){
            return 0;
        }
        return 1+length2(root.left)+length2(root.right);
    }

    public static int leafSize=0;
    public static  void getLeafSize(Node root){
        if (root==null){
            return;
        }
        if (root.left==null && root.right==null){
            leafSize++;
        }
        getLeafSize(root.left);
        getLeafSize(root.right);
    }
    public static  int  getLeafSize2(Node root){
        if (root==null){
            return 0;
        }
        if (root.left==null && root.right==null){
            return  1;
        }
        return getLeafSize2(root.right)+getLeafSize2(root.left);
    }
    public static int getKLevelSize(Node root,int k){
        if (root==null ||k<1){
            return 0;
        }
        if (k==1){
            return 1;
        }
        return getKLevelSize(root.left,k-1)+getKLevelSize(root.right,k-1);
    }
    public static int getHeight(TreeNode root){
        if (root==null){
            return 0;
        }
        int leftHeight=getHeight(root.left);
        int rightHeight=getHeight(root.right);
        return 1+(leftHeight>rightHeight?leftHeight:rightHeight);

    }
    public static Node find(Node root,String toFind){
        if (root==null){
            return null;
        }
        if (root.val.equals(toFind)){
            return root;
        }
        Node result=find(root.right,toFind);
        if (result!=null){
            return result;
        }
        return find(root.left,toFind);
    }
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> result=new ArrayList<>();
        if (root==null){
            return  result;
        }
        result.add(root.val);
        result.addAll(preorderTraversal(root.left));
        result.addAll(preorderTraversal(root.right));
        return result;
    }
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> result=new ArrayList<>();
        if (root==null){
            return result;
        }
        result.addAll(inorderTraversal(root.left));
        result.add(root.val);
        result.addAll(inorderTraversal(root.right));
        return result;
    }
    public boolean isSameTree(TreeNode p,TreeNode q){
        if (p==null && q==null){
            return true;
        }
        if (p.val!=q.val){
            return false;
        }
        return isSameTree(p.right,q.right) &&isSameTree(p.left , q.left);
    }
    public boolean isSubtree(TreeNode s,TreeNode t){
        if(s==null){
            return  false;
        }
        boolean ret=isSameTree(s,t);
        if (ret){
            return true;
        }
        return isSameTree(s.left,t) || isSameTree(s.right,t);
    }
    public int maxDepth(TreeNode root){
        if (root==null){
            return 0;
        }
        int leftHeight=maxDepth(root.left);
        int rightHeight=maxDepth(root.right);
        return 1+(leftHeight>rightHeight?leftHeight:rightHeight);
    }
    public boolean isBalanced(TreeNode root){
        if (root==null){
            return true;
        }
        if (root.left==null && root.right==null){
            return true;
        }

        int leftHeight=getHeight(root.left);
        int righHeight=getHeight(root.right);
        if ((leftHeight-righHeight)>1  ||(leftHeight-righHeight)<-1){
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    public boolean isSymmetric(TreeNode root){
        if (root==null){
            return true;
        }
        return isMirror(root.left,root.right);
    }
    public boolean isMirror(TreeNode p,TreeNode q){
        if (p==null && q==null){
            return true;
        }
        if (p==null || q==null){
            return false;
        }
        if (p.val != q.val){
            return false;
        }
        return isMirror(p.left,q.right) &&isMirror(p.right,q.left);
    }
    public static void levelOrder2(TreeNode root){
        if (root==null){
            return;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while (true){
            TreeNode cur=queue.poll();
            if (cur==null){
                break;
            }
            System.out.print(cur.val);
            if (cur.left!=null){
                queue.offer(cur.left);
            }
            if (cur.right!=null){
                queue.offer(cur.right);
            }
        }
    }
    public static  boolean isCompleteTree(TreeNode root){
//        //通过层序遍历实现
//        if (root==null){
//            return true;
//        }
//        //分两个阶段 这个变量为false，
//        // 表示当前是第一阶段
//        // 变量true表示进入第二个阶段
//        boolean isLevel2=false;
//
//        Queue<TreeNode> queue=new LinkedList<>();
//        queue.offer(root);
//        while (true){
//            TreeNode cur=queue.poll();
//            if (cur==null){
//                break;
//            }
//            //针对当前的节点访问
//            if (!isLevel2){
//                //第一个阶段的逻辑
//                if (cur.left !=null && cur.right !=null){
//                    //符合要求的节点，入队列左右子树。
//                    // 继续遍历
//                    queue.offer(cur.left);
//                    queue.offer(cur.right);
//                }else if (cur.left==null && cur.right!=null){
//                    //只有右子树的节点 不符合要求
//                    return false;
//                }else if (cur.left !=null && cur.right==null){
//                    // 遇到了这个节点不符合第一阶段的条件,
//                    // 进入到第二阶段继续判定
//                    isLevel2=true;
//                    queue.offer(cur.left);
//                }else {
//                    // 这个节点没有子树
//                    // 进入到第二阶段继续判定
//                    isLevel2=true;
//                }
//            }else {
//                // 发现第二阶段的某个节点的子树不为空, 此时就认为当前不是完全二叉树
//                if (cur.left !=null || cur.right !=null){
//                    return  false;
//                }
//            }
//        }
//        return true;
        if (root==null){
            return true;
        }
        boolean isLevel2=false;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while (true) {
            TreeNode cur = queue.poll();
            if(cur==null){
                break;
            }
            if (!isLevel2) {
                if (cur.left != null && cur.right != null) {
                    queue.offer(cur.left);
                    queue.offer(cur.right);
                } else if (cur.left == null && cur.right != null) {
                    return false;
                } else if (cur.left != null && cur.right == null) {
                    isLevel2 = true;
                    queue.offer(cur.left);
                } else {
                    isLevel2 = true;
                }
            }else {
                if ((cur.left!=null || cur.right!=null))
                return false;
            }
        }
        return true;
    }
    public List<List<Integer>> result=null;
    public List<List<Integer>> levelOrder(TreeNode root){
        result=new ArrayList<List<Integer>>();
        if (root==null){
            return result;
        }
        helper(root,0);
        return result;
    }
    public  void helper(TreeNode root,int level){
        if (level==result.size()){
            result.add(new ArrayList<Integer>());
        }
        result.get(level).add(root.val);
        if (root.left!=null){
            helper(root.left,level+1);
        }
        if (root.right!=null){
            helper(root.right,level+1);
        }
    }

    public TreeNode lca=null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
      if (root==null){
          return null;
      }
      find(root,p,q);
      return lca;
    }

    public  boolean find(TreeNode root,TreeNode p,TreeNode q){
        if (root==null){
            return false;
        }
        int mid=(root==p || root==q)?1:0;
        int left=find(root.left,p,q)?1:0;
        int right=find(root.right,p,q)?1:0;
        if (mid+left+right==2){
            lca=root;
        }
        return (left+right+mid)>0;

    }



    public TreeNode Convert(TreeNode pRootOfTree){
        if (pRootOfTree==null){
            return null;
        }
        if (pRootOfTree.left==null &&pRootOfTree.right==null){
            return pRootOfTree;
        }
        TreeNode leftHead= Convert(pRootOfTree.left);
        TreeNode leftTail=leftHead;
        while (leftTail !=null && leftTail.right!=null){
            leftTail=leftTail.right;
        }
        if (leftHead !=null){
            leftTail.right=pRootOfTree;
            pRootOfTree.left=leftTail;
        }
        TreeNode rightHead=Convert(pRootOfTree.right);
        if (rightHead !=null){
            rightHead.left=pRootOfTree;
            pRootOfTree.left=rightHead;
        }
        return leftHead!=null ?leftHead:pRootOfTree;
    }

    public int index=0;
    public TreeNode buildTree(int[] preorder,int[] inorder){
        index=0;
        List<Integer> inoderList=new ArrayList<>();
        for (int x:inorder){
            inoderList.add(x);
        }
        return _buildTree(preorder,inoderList);
    }

    private TreeNode _buildTree(int[] preorder, List<Integer> inoderList) {
        if (inoderList.isEmpty()){
            return null;
        }
        TreeNode root=new TreeNode(preorder[index]);
        index++;

    }
}
