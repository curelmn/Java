package Test_0319;

import java.util.ArrayList;
import java.util.List;

class ListNode{
    int val;
    ListNode next=null;

    ListNode(int val){
        this.val=val;
    }
}

class TreeNode{
    int val;
    TreeNode  right;
    TreeNode   left;

    TreeNode(int val){
        this.val=val;
    }
}
public class T0319 {


    public ListNode ReverseList(ListNode head) {
        ListNode p=null;
        ListNode q=null;

        while(head != null){
            p=head.next;
            head.next=q;

            q=head;
            head=p;
        }
        return q;
    }




    public int[] MySort (int[] arr) {
        // write code here
        int len=arr.length-1;
        quickSort(arr,0,len);
        return arr;
    }
    public void quickSort(int[] arr,int left,int right){
        if(left<right){
            int i=left;
            int j=right;
            int key=arr[i];
            while(i<j){
                while(i<j && arr[j]>=key){
                    j--;
                }
                if(i<j){
                    arr[i]=arr[j];
                }
                while(i<j && arr[i]<=key){
                    i++;
                }
                while(i<j && arr[i]<=key){
                    i++;
                }
                if(i<j){
                    arr[j]=arr[i];
                }
            }
            arr[i]=key;
            //对两边的元素再进行快速排序
            quickSort(arr,left,i-1);
            quickSort(arr,i+1,right);
        }

            public boolean hasCycle(ListNode head) {
                if(head==null){
                    return false;
                }
                ListNode fast=head;
                ListNode slow=head;
                while(fast !=null && fast.next !=null){
                    fast=fast.next.next;
                    slow=slow.next;
                    if(fast==slow){
                        return true;
                    }
                }

                return false;

            }
    }



        List<Integer> front=new ArrayList<>();
        List<Integer> mid=new ArrayList<>();
        List<Integer> back=new ArrayList<>();
        public int[][] threeOrders (TreeNode root) {
            // write code here
            firstOrder(root);
            middleOrder(root);
            thenOrder(root);

            int[][] res = {
                    front.stream().mapToInt(Integer::valueOf).toArray(),
                    mid.stream().mapToInt(Integer::valueOf).toArray(),
                    back.stream().mapToInt(Integer::valueOf).toArray()
            };
            return res;
        }
        public void  firstOrder(TreeNode root){
            if(root==null){
                return;
            }
            front.add(root.val);
            firstOrder(root.left);
            firstOrder(root.right);

        }
        public void middleOrder(TreeNode root){
            if(root==null){
                return;
            }
            middleOrder(root.left);
            mid.add(root.val);
            middleOrder(root.right);
        }
        public void thenOrder(TreeNode root){
            if(root==null){
                return;
            }
            thenOrder(root.left);
            thenOrder(root.right);
            back.add(root.val);
        }


    ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
        // write code here

        if(root==null){
            return res;
        }
        count(root,0);
        return res;
    }
    public void count(TreeNode root,int level){
        if(level==res.size()){
            res.add(new ArrayList<Integer>());
        }
        ArrayList<Integer> list=res.get(level);
        list.add(root.val);

        if(root.left != null){
            count(root.left,level+1);
        }
        if(root.right != null){
            count(root.right,level+1);
        }
    }

}

