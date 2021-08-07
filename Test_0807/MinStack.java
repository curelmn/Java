package Test_0807;



class MinStack {
    class Node {
        int val;
        int min;
        Node next;
        Node(int val,int min,Node next ) {
            this.val = val;
            this.min=min;
            this.next=next;

        }
    }
    /** initialize your data structure here. */
    public MinStack() {

    }
    public Node head;
    public void push(int x) {
        if (head == null) {
            head = new Node(x, x, null);
        } else {
            head = new Node(x, Math.min(head.min, x), head);
        }
    }

    public void pop() {
      head=head.next;
    }

    public int top() {
        return head.val;
    }

    public int min() {
     return head.min;
    }
}
