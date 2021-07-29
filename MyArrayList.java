package Test_0729;

class MyArrayListOutOfRangeException extends RuntimeException{
    public MyArrayListOutOfRangeException(String message){
        super(message);
    }
}
public class MyArrayList {
     public  String[] data=null;
     public  int size=0;
     public  int capacity=100;

     public MyArrayList(){
         data=new String[capacity];
     }



    private  void realloc(){
        capacity=2*capacity;
        String[] newData=new String[capacity];
        for (int i=0;i<data.length;i++){
            newData[i]=data[i];
        }
        data=newData;
    }

    //插到末尾
    public void add(String elem){
        if (size>=capacity){
            realloc();
        }
        data[size]=elem;
        size++;
    }
    //插入到任意位置
    public void add(int index,String elem){
       if (index<0 || index>size){
           return ;
       }
       if (size>=capacity){
           realloc();
       }
       for (int i=size-1;i>=index;i--){
           data[i+1]=data[i];
       }
       data[index]=elem;
       size++;
    }
    //按照下标删除元素 ,返回被删除的元素
    public String remove(int index){
      if (index<0 || index>size){
          throw  new MyArrayListOutOfRangeException("数组下标越界： inex"+index);

      }
      String result=data[index];
      for (int i=index;i<size-1;i++){
          data[i]=data[i+1];
      }
      size--;
      return result;

    }
    //按照元素的值去删除元素，返回是否成功 失败
    public boolean remove(String elem){
     int index=0;
     for (;index<size;index++){
         if (data[index].equals(elem)){
             break;
         }
     }
     if (index >size){
         return false;
     }
     for (int i=index;i<size-1;i++){
         data[i]=data[i+1];
     }
     size--;
     return true;
    }

    //根据下标获取元素
    public String get(int index){
        if (index<0 || index>size){
            throw  new MyArrayListOutOfRangeException("数组下标越界： inex"+index);
        }
     return data[index];
    }
    //根据下标修改元素
    public void set (int index,String elem){
        if (index<0 || index>size){
            throw  new MyArrayListOutOfRangeException("数组下标越界： inex"+index);
        }
        data[index]=elem;
    }
    //判断元素是否存在
    public boolean contains(String elem){
       for (int i=0;i<size;i++){
           if (data[i].equals(elem)){
               return   true;
           }
       }
       return false;
    }
    //查找元素的位置
    public int indexOf(String elem){
       for(int i=0;i<size;i++){
           if (data[i].equals(elem)){
               return i;
           }
       }
       return -1;
    }

    //清空
    public void  clear(){
       size=0;
    }
    //判断是否为空
    public boolean isEmpty(){
     return size==0;
    }

    @Override
    public String toString() {
       StringBuilder stringBuilder=new StringBuilder();
       stringBuilder.append("[");
       for (int i=0;i<data.length;i++){
           stringBuilder.append(data[i]);
           if (i<size-1){
               stringBuilder.append(",");
           }
       }
       stringBuilder.append("]");
       return stringBuilder.toString();
    }
}
