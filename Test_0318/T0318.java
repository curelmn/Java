package Test_0318;
import Test_0125.T0125;
import sun.reflect.generics.tree.Tree;

import java.util.*;

class TreeNode{
    int val;
    TreeNode left=null;
    TreeNode right=null;

    public TreeNode(int val){
        this.val=val;
    }
}

public class T0318 {
    public static void levelOrder2(TreeNode root){
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

public TreeNode Convert(TreeNode pRootOfTree){

        if(pRootOfTree==null){
            return  null;
        }
        if(pRootOfTree.left==null &&pRootOfTree.right==null){
            return  pRootOfTree;
        }
        TreeNode leftHead=Convert(pRootOfTree.left);
        TreeNode leftTail=leftHead;
        while(leftTail !=null && leftTail.right!=null){
            leftTail=leftTail.right;
        }
        if (leftHead != null){
            leftTail.right=pRootOfTree;
            pRootOfTree.left=leftTail;
        }

        TreeNode rightHead=Convert(pRootOfTree.right);
        if(rightHead !=null){
            rightHead.left=pRootOfTree;
            pRootOfTree.right=rightHead;
        }
        return leftHead!=null ?leftHead:pRootOfTree;
}

public TreeNode lca=null;
    public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q){
        if (root==null){
            return  null;
        }
        find(root,p,q);
        return  lca;
    }
    public boolean find(TreeNode root,TreeNode p, TreeNode q){
        if (root==null){
            return  false;
        }
        int mid=(root==p || root==q)?1:0;
        int left=find(root.left,p,q)?1:0;
        int right=find(root.right,p,q)?1:0;

        if (mid+left+right ==2){
            lca=root;
        }
        return (left+right+mid)>0;
    }


    public List<List<Integer>> result=null;
    public  List<List<Integer>> levelOrder(TreeNode root){
        result=new ArrayList<List<Integer>>();
        if(root==null){
            return  result;
        }
        helper(root,0);
        return  result;

    }
    public void helper(TreeNode root,int level){
        if (level==result.size()){
            result.add(new ArrayList<Integer>());
        }
        result.get(level).add(root.val);

        if (root.left!=null){
            helper(root.left,level+1);
        }
        if(root.right !=null){
            helper(root.right ,level+1);
        }


    }
    public static void main(String[] args) {
        TreeNode root=bulid();
//        System.out.println(isCompleteTree(root));
        //  levelOrder(root);

    }
}
