package Test_0408;
class MyArrayListIndexOutOfRangeException extends RuntimeException {
    public MyArrayListIndexOutOfRangeException(String message) {
        super(message);
    }
}
public class MyArrayList {


    private   String[] data=null;
    private  int size=0;
    private  int capacity=100;

    public MyArrayList(){
        data=new String[capacity];
    }

    public void realloc(){
        capacity=2*capacity;
        String[] newdata=new String[capacity];
        for (int i=0;i<data.length;i++){
            newdata[i]=data[i];
        }
        data=newdata;
    }

    public void addlast(String elem){
        if (size>=capacity){
            realloc();
        }
        data[size]=elem;
        size++;
    }

    public void add(String elem,int index){
        if (index<0 || index>size){
            return;
        }
        if(size>=capacity){
            realloc();
        }
        for (int i=size-1;i>=index;i--){
            data[i+1]=data[i];
        }
        data[index]=elem;
        size++;
    }
    public String remove(int index){
        if (index<0 || index>size){
            return null;
        }
        String result=data[index];
        for (int i=index;i<size;i++){
            data[i]=data[i+1];
        }
        size--;
        return  result;
    }

    public boolean remove2(String elem){
        int i=0;
        for (i=0;i<size;i++){
            if (data[i].equals(elem)){
                break;
            }
        }
        if (i>=size){
            return false;
        }
        for(int j=i;j<size;j++){
            data[j]=data[j+1];
        }
        size--;
        return true;
    }

    public String get(int index){
        if (index<0 || index>size){
            throw  new MyArrayListIndexOutOfRangeException("下标越界");
        }
        return data[index];
    }

    public void set(int index,String elem){
        if (index<0 || index>size){
            throw new MyArrayListIndexOutOfRangeException("下标越界");
        }
        data[index]=elem;
    }

    public  boolean contains(String elem){
        for (int i=0;i<size;i++){
            if (data[i].equals(elem)){
                return true;
            }
            break;
        }
        return  false;
    }


    public int indexOf(String elem) {
       for(int i=0;i<size;i++){
           if (data[i].equals(elem)){
               return i;
           }
       }
       return -1;
    }


    public int lastIndexOf(String elem) {
         for (int i=size-1;i>=0;i--){
             if (data[i].equals(elem)){
                 return i;
             }
         }
         return  -1;
    }

    public void clear() {
           size=0;
    }

    public int size() {
       return  size;
    }

    public boolean isEmpty() {
              return  size==0;
    }
}
