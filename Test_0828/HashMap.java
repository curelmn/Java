package Test_0828;


import org.apache.hadoop.shaded.com.google.inject.internal.asm.$AnnotationVisitor;
import org.apache.hadoop.shaded.com.google.inject.internal.cglib.core.$KeyFactory;

class HashNode{
    public int key;
    public int value;
    HashNode next;
    public HashNode(int key,int value){
        this.key=key;
        this.value=value;
    }
}
public class HashMap {
//    private HashNode[] array=new HashNode[16];
//    private int size=0;
//
//    private int hashCode(int key){
//        return key%array.length;
//    }
//
//    public void put(int key,int value){
//       int index=hashCode(key);
//       for (HashNode cur=array[index];cur!=null;cur=cur.next){
//           if (cur.key==key){
//               cur.value=value;
//               return;
//           }
//       }
//
//       HashNode newNode=new HashNode(key,value);
//       newNode.next=array[index];
//       array[index]=newNode;
//       size++;
//
//       if (loadFactory()>0.75){
//           resize();
//       }
//    }
//
//    private double  loadFactory() {
//        return (double) size/array.length;
//    }
//
//    private void resize() {
//        HashNode[] newArray=new HashNode[array.length*2];
//        for (int i=0;i<array.length;i++){
//            HashNode next=null;
//            for (HashNode cur=array[i];cur!=null;cur=next){
//                next=cur.next;
//                int newIndex=cur.key %newArray.length;
//                cur.next=newArray[newIndex];
//                newArray[newIndex]=cur;
//            }
//        }
//    }
//    public Integer get(int key){
//        int index=hashCode(key);
//        for (HashNode cur=array[index];cur!=null;cur=cur.next){
//            if (cur.key==key){
//                return cur.value;
//            }
//        }
//        return null;
//    }
    private HashNode[] array=new HashNode[16];
    private int size=0;

    public int  hashCode(int key){
        return key% array.length;
    }
    public  void put(int key,int value){
        int index=hashCode(key);
        for (HashNode cur=array[index];cur!=null;cur=cur.next){
            if (cur.key==key){
                cur.value=value;
                return;
            }
        }
        HashNode newNode=new HashNode(key,value);
        newNode.next=array[index];
        array[index]=newNode;
        size++;

        if (loadFactory()>0.75){
            resize();
        }
    }

    private double loadFactory() {
        return (double)size/array.length;
    }

    private void resize() {
        HashNode[] newArray=new HashNode[2*array.length];

      for (int i=0;i<array.length;i++){
          HashNode next=null;
          for (HashNode cur=array[i];cur!=null;cur=next){
              cur=cur.next;
             int newIndex=cur.key%newArray.length;
             cur.next=newArray[newIndex];
             newArray[newIndex]=cur;
          }
      }
    }
    public Integer get(int key){
        int index=hashCode(key);
        for (HashNode cur=array[index];cur!=null;cur=cur.next){
            if (cur.key==key){
                return cur.value;
            }
        }
        return null;
    }
}
