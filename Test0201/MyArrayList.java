package Test0201;


import java.util.Arrays;

class MyArrayListIndexOutOfRangeException  extends RuntimeException{
    public MyArrayListIndexOutOfRangeException(String message){
        super(message);
    }
}
public class MyArrayList{
     private  String[] data=null;
     private int size=0;//当前顺序表中的有效元素个数
     private  int capacity=100;//最大容量

    public MyArrayList(){
        data=new String[capacity];
    }
    //扩容

    private void realloc(){
        capacity=2*capacity;
        String[] newData= new String[capacity];
        for(int i=0;i<data.length;i++){
            newData[i]=data[i];
        }
        data=newData;
    }
//1.把元素尾插到顺序表的末尾
    public void add(String elem){
        if(size>=capacity){
            realloc();
        }

        data[size]=elem;
        size++;
    }
    //2.把元素插入到任意中间位置
    public void add(int index,String elem){
        if(index<0||index>size){
            return;
        }
        if(size>=capacity){
            realloc();
        }
        for(int i=size-1;i>=index;i--){
            data[i+1]=data[i];
        }
        data[index]=elem;
        size++;
    }
    //3.按照下标位置删除元素，返回结果就是被删除的元素
    public String remove(int index){
        if(index < 0 ||index>=size){
            return null;
        }
        String result=data[index];
        for(int i=index;i<size-1;i++){
            data[i]=data[i+1];
        }
        size--;
        return result;
    }
    //4.安装元素的值来删除元素，返回boolean
    public boolean remove(String elem){
        int index=0;
        for(;index<size;index++){
            if(data[index].equals(elem)){
                break;
            }
        }
        if(index>=size){
            return false;
        }
        for(int i=index;i<size-1;i++){
            data[i]=data[i+1];
        }
        size--;
        return true;
    }

    //5.根据下标获取元素
    public String get(int index){
        if(index<0 || index>=size){
            throw new MyArrayListIndexOutOfRangeException("下标越界，index"+index);
        }
        return data[index];
    }
    //6.根据下标修改元素
    public void set(int index,String elem){
        if(index<0 ||index>=size){
            throw new MyArrayListIndexOutOfRangeException("下标越界，index"+index);
        }
        data[index]=elem;
    }
//7.判断元素是否存在
    public boolean contains(String elem){
        for(int i=0;i<size;i++){
            if(data[i].equals(elem)){
                return true;
            }
        }
        return false;
    }
    //8.查找元素的位置
    public int indexOf(String elem){
        for(int i=0;i<size;i++){
            if(data[i].equals(elem)){
                return i;
            }
        }
        return -1;
    }
    //9.查找元素位置从后往前找
    public int lastIndexOf(String elem){
        for(int i=size-1;i>=0;i--){
            if(data[i].equals(elem)){
                return i;
            }
        }
        return -1;
    }
    //清空
    public void clear(){
        size=0;
    }
    //求有效元素个数
    public int size(){
        return  size;
    }
    //判断是否为空
    public boolean isEmpty(){
        return size==0;
    }
    @Override
    public String toString(){
      //  return Arrays.toString(data);

        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("[");
        for(int i=0;i<size;i++){
            stringBuilder.append(data[i]);
            if(i<size-1){
                stringBuilder.append(",");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    private static void testAdd(){
        MyArrayList myArrayList=new MyArrayList();
        //验证尾部插入
        myArrayList.add("cxk");
        myArrayList.add("cln");
        myArrayList.add("fcc");
        myArrayList.add("lyj");
        System.out.println(myArrayList);
        //验证中间位置插入

        myArrayList.add(1,"lil-ghost");
        System.out.println(myArrayList);
    }
     private static void testRemove(){
         MyArrayList myArrayList=new MyArrayList();
         myArrayList.add("cxk");
         myArrayList.add("cln");
         myArrayList.add("fcc");
         myArrayList.add("lyj");
         //下标删除
          myArrayList.remove(2);
         System.out.println(myArrayList);
          //内容删除
         myArrayList.remove("cln");
         System.out.println(myArrayList);

     }
     private static void testGetAndSet(){
         MyArrayList myArrayList=new MyArrayList();
         myArrayList.add("cxk");
         myArrayList.add("cln");
         myArrayList.add("fcc");
         myArrayList.add("lyj");

         System.out.println(myArrayList.get(0));
         myArrayList.set(1,"boogie");
         System.out.println(myArrayList);

     }
     private  static void testContainsAndIndexOf(){
         MyArrayList myArrayList=new MyArrayList();
         myArrayList.add("cxk");
         myArrayList.add("cln");
         myArrayList.add("fcc");
         myArrayList.add("lyj");
         myArrayList.add("cxk");

         System.out.println(myArrayList.contains("cxk"));
         System.out.println(myArrayList.indexOf("cxk"));
         System.out.println(myArrayList.lastIndexOf("cxk"));
     }
     private static void testSizeEmptyClear(){
         MyArrayList myArrayList=new MyArrayList();
         myArrayList.add("cxk");
         myArrayList.add("cln");
         myArrayList.add("fcc");
         myArrayList.add("lyj");
         myArrayList.add("cxk");

         System.out.println(myArrayList.size());
         System.out.println(myArrayList.isEmpty());

         myArrayList.clear();

         System.out.println(myArrayList.size());
         System.out.println(myArrayList.isEmpty());

     }

    public static void main(String[] args) {
        //testAdd();
        //testRemove();
        //testGetAndSet();
        //testContainsAndIndexOf();
        testSizeEmptyClear();
    }
}
