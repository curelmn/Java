package Test_0321;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode{
    int val;
    TreeNode left=null;
    TreeNode right=null;

    TreeNode(int val){
        this.val=val;

    }
}
public class Tree {
    public int index=0;
    public TreeNode buildTree(int[] preorder,int[] inorder){
        index=0;
        List<Integer> inorderList=new ArrayList<>();
        for (int x:inorder){
            inorderList.add(x);
        }
        return _buildTree(preorder,inorderList);
    }

public TreeNode _buildTree(int[] preorder,List<Integer> inorder){
        if (inorder.isEmpty()){
            return  null;
        }
        TreeNode root=new TreeNode(preorder[index]);
        index++;
        int pos=inorder.indexOf(root.val);
        root.left=_buildTree(preorder,inorder.subList(0,pos));
        root.right=_buildTree(preorder,inorder.subList(pos+1,inorder.size()));
        return  root;
}



public StringBuilder stringBuilder=null;
public String treeStr(TreeNode t){
    stringBuilder=new StringBuilder();
    if(t==null){
        return "";
    }
    _treeStr(t);

    stringBuilder.deleteCharAt(0);
    stringBuilder.deleteCharAt(stringBuilder.length()-1);
    return stringBuilder.toString();
}
public void _treeStr(TreeNode root){
    if(root==null){
        return;
    }

    stringBuilder.append("(");
    stringBuilder.append(root.val);
    _treeStr(root.left);
    if(root.left==null && root.right!=null){
        stringBuilder.append("()");

    }
    _treeStr(root.right);
    stringBuilder.append(")");
}
    public static void preOrderNoR(TreeNode root){
        if(root==null){
            return;
        }
        //1.创建一个栈
        Stack<TreeNode> stack=new Stack<>();
        //2.根节点入栈
        stack.push(root);
        //3.循环取栈顶元素并且出栈
        while (!stack.isEmpty()){
            TreeNode  cur=stack.pop();
            //访问这个元素
            System.out.print(cur.val);
            //右子树入栈
            if (cur.right !=null){
                stack.push(cur.right);
            }
            //左子树入栈
            if (cur.left != null){
                stack.push(cur.left);
            }
        }
    }


    public static void inOrderNoR(TreeNode root){
    //1.创建一个栈
        Stack<TreeNode> stack =new Stack<>();
        //2.创建一个cur从root开始执行

        TreeNode cur=root;
        //3.第一层循环，从栈中取元素
        while (true){
            //第二层循环，往栈中插入元素
            while (cur!=null){
                stack.push(cur);
                cur=cur.left;
            }
            if(stack.isEmpty()){
                //如果栈为空，跳出循环
                break;
            }
            //如果不为空，取出栈顶元素并访问
            TreeNode top=stack.pop();
            System.out.print(top.val);
            //使得cur指向 top的右子树，继续重复执行上述操作
            cur=top.right;
        }
    }
 public static void postOrderNoR(TreeNode root){
        if(root==null){
            return;
        }
        //先创建一个栈
        Stack<TreeNode> stack=new Stack<>();
        TreeNode cur=root;
        TreeNode prev=null;//记录后序遍历中的前一个节点
        while(true){
            //cur出发一路往左，遇到非空节点都入栈
            while(cur !=null){
                stack.push(cur);
                cur=cur.left;
            }
            //cur为空的时候，取栈顶元素判断能不能访问
            if (stack.isEmpty()){
                break;
            }
            //栈顶元素不一定能访问，真正访问到的时候再出栈，通过peek来取到这个元素就行
            TreeNode top=stack.peek();
            if(top.right==null || prev==top.right){
                //此时top可以被访问
                System.out.print(top.val);
                stack.pop();
                prev=top;
                //如果要使这个节点能被访问，此时 cur没有变化
                //下一轮循环就还是从栈顶取这个元素，判定能不能访问
            }else{
                //如果访问不了，就从top的右子树出发，重复刚才过程
                cur=top.right;
            }
        }
 }



}
