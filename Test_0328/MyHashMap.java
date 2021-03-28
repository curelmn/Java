package Test_0328;


import java.util.HashMap;

class HashNode{
    public int key;
    public int value;
    HashNode next;

    public  HashNode(int key,int value){
        this.key=key;
        this.value=value;
    }
}
public class MyHashMap {

    private HashNode[] array=new HashNode[16];
    private int size=0;

   private int hashCode(int key){
       return key% array.length;
   }

   public void put(int key, int value){
       int index=hashCode(key);

       for (HashNode cur=array[index];cur!=null;cur=cur.next){
           if(cur.key ==key){
               cur.value=value;
               return;
           }
       }
       HashNode newNode=new HashNode(key,value);
       newNode.next=array[index];
       array[index]=newNode;
       size++;

       if (loadFactor() > 0.75){
           resize();
       }
   }

   private  void resize(){
       HashNode[] newArray=new HashNode[array.length *2];
       for (int i=0;i<array.length;i++){
           HashNode next=null;
           for (HashNode cur=array[i];cur !=null;cur=next){
               next=cur.next;
               int newIndex=cur.key % newArray.length;

               cur.next=newArray[newIndex];
               newArray[newIndex]=cur;

           }
       }
       array=newArray;
   }

   private double loadFactor(){
       return  (double) size/array.length;
   }
   public Integer get(int key){
       int index=hashCode(key);
       for(HashNode cur=array[index];cur !=null;cur=cur.next){
           if (cur.key==key){
               return  cur.value;
           }
       }
       return  null;
   }


   public void remove(int key){

   }

    public static void main(String[] args) {
        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put("a","b");
    }


}
