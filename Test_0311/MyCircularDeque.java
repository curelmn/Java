package Test_0311;

public class MyCircularDeque {
    private  int[] queue;
    private int front;
    private int rear;
    private int capacity;



    public  MyCircularDeque(int k){
        this.queue=new int[k+1];
        this.capacity=k+1;
        this.front=0;
        this.rear=0;

    }

    public boolean insertFront(int value){
        if(!this.isFull()){
            this.front=(this.front-1+this.capacity)%this.capacity;
            this.queue[this.front]=value;
            return  true;
        }
        return  false;
    }
    public  boolean insertLast(int value){
        if(!isFull()){
            this.queue[this.rear]=value;
            this.rear=(this.rear+1)%this.capacity;
            return true;
        }
        return false;
    }

    public boolean deleteFront(){
        if(!this.isEmpty()){
            this.front=(this.front+1)%this.capacity;
            return true;
        }
        return  false;
    }

    public boolean deleteLast(){
        if(!this.isEmpty()){
            this.rear=(this.rear-1+this.capacity)%this.capacity;
            return  true;
        }
        return false;
    }

    public  int getFront(){
        if(!this.isEmpty()){
            return this.queue[this.front];
        }
        return  -1;
    }

    public int getRear(){
        if(!this.isEmpty()){
            return this.queue[(this.rear-1+this.capacity)%this.capacity];
        }
        return -1;
    }
    public boolean isEmpty(){
        if(this.front==this.rear){
            return  true;
        }
        return false;
    }
    public  boolean isFull(){
        if((this.rear+1)%this.capacity==this.front){
            return  true;
        }
        return  false;
    }
}
