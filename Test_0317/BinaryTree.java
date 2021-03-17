package Test_0317;

import com.sun.xml.internal.org.jvnet.mimepull.CleanUpExecutorFactory;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
    int val;
    TreeNode left=null;
    TreeNode right=null;

    public TreeNode(int val){
        this.val=val;
    }
}

public class BinaryTree {
    public static void levelOrder(TreeNode root){
    if(root==null){
        return;
    }
    Queue<TreeNode> queue=new LinkedList<>();
    queue.offer(root);
    while(true){
        TreeNode cur=queue.poll();
        if(cur==null){
            break;
        }
        System.out.print(cur.val);
        if(cur.left !=null){
            queue.offer(cur.left);
        }
        if(cur.right!=null){
            queue.offer(cur.right);
        }
    }
    }
    public  boolean isMirrror(TreeNode p,TreeNode q){
        if(p==null && q==null){
            return  true;
        }
        if(p==null || q==null){
            return false;
        }
        if(p.val !=q.val){
            return false;
        }
        return isMirrror(p.left,q.right) && isMirrror(p.right,q.left) ;
    }
    public  static TreeNode bulid(){
        TreeNode a=new TreeNode(1);
        TreeNode b=new TreeNode(2);
        TreeNode c=new TreeNode(3);
        TreeNode d=new TreeNode(4);
        TreeNode e=new TreeNode(5);
        TreeNode f =new TreeNode(6);
        TreeNode g =new TreeNode(7);

        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        e.left=g;
        c.right=f;
        return  a;
    }

    public  static boolean isCompleteTree(TreeNode root){
        if(root==null){
            return true;
        }
        boolean isLevel2=false;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);

        while (true){
            TreeNode cur=queue.poll();
            if(cur==null){
                break;
            }
            if(!isLevel2){
                if(cur.left !=null  &&  cur.right !=null){
                    queue.offer(cur.left);
                    queue.offer(cur.right);
                }else if(cur.left==null  &&cur.right !=null){
                    return  false;
                }else if(cur.left !=null && cur.right==null ){
                    isLevel2=true;
                    queue.offer(cur.left);
                }else{
                    isLevel2=true;
                }
            }else{
                if(cur.left !=null || cur.right !=null){
                    return  false;
                }
            }
        }
       return  true;
    }
        public int getHeight(TreeNode root){
            if(root==null){
                return 0;
            }
            int leftHeight=getHeight(root.left);
            int rightHeight=getHeight(root.right);
            return 1+(leftHeight>rightHeight ?leftHeight:rightHeight);
         }
      public boolean isBalanced(TreeNode root){
        if(root==null){
            return  true;
        }
        if(root.left==null &&root.right==null){
            return  true;
        }
        int leftHeight=getHeight(root.left);
        int rightHeight=getHeight(root.right);
        if((leftHeight-rightHeight)>1 ||(leftHeight-rightHeight)<-1){
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
      }


    public static void main(String[] args) {
            TreeNode root=bulid();
//        System.out.println(isCompleteTree(root));
      //  levelOrder(root);

    }
}
