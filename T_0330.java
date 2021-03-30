

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
public class T_0330 {

        private  HashNode[] array=new Test_0328.HashNode[16];
        private int size=0;

        private int hashCode(int key){
            return key% array.length;
        }

        public void put(int key, int value){
            int index=hashCode(key);

            for (Test_0328.HashNode cur = array[index]; cur!=null; cur=cur.next){
                if(cur.key ==key){
                    cur.value=value;
                    return;
                }
            }
            Test_0328.HashNode newNode=new Test_0328.HashNode(key,value);
            newNode.next=array[index];
            array[index]=newNode;
            size++;

            if (loadFactor() > 0.75){
                resize();
            }
        }

        private  void resize(){
            Test_0328.HashNode[] newArray=new Test_0328.HashNode[array.length *2];
            for (int i=0;i<array.length;i++){
                Test_0328.HashNode next=null;
                for (Test_0328.HashNode cur = array[i]; cur !=null; cur=next){
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
            for(Test_0328.HashNode cur = array[index]; cur !=null; cur=cur.next){
                if (cur.key==key){
                    return  cur.value;
                }
            }
            return  null;
        }


        public void remove(int key){
            int index=hashCode(key) % array.length;
            if (array[index]==null){
                return;
            }else{
                Test_0328.HashNode pre=null;
                Test_0328.HashNode cur=array[index];
                while (cur!=null){
                    if (cur.key==key){
                        if (pre==null){
                            //第一个节点
                            array[index]=cur.next;
                        }else {
                            //其他
                            pre.next=cur.next;
                        }
                        //删除完
                        if (array[index]==null){
                            size--;
                        }
                        return;
                    }
                    pre=cur;
                    cur=cur.next;
                }
            }
        }

        public static void main(String[] args) {
            HashMap<String,String> hashMap=new HashMap<>();
            hashMap.put("a","b");
        }


    }
}
