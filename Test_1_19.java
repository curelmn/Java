public class Test_1_19 {
//    public static void main(String[] args) {
//        int n = 1000;
//        System.out.println(n);
//    }
    //        public int aMethod(){ int i = 0;
//        i++;
//        return i;
//    }
//    public static void main(String args[]){
//        Test_1_19 test = new Test_1_19();
//        test.aMethod();
//        int j = test.aMethod();
//        System.out.println(j);
//    }
//static boolean Paddy;
//    public static void main(String args[]){
//        System.out.println(Paddy);
//    }
//public class Person{
//
//    private String name = "Person";
//
//    int age=0;
//
//}
//
//    public class Child extends Person{
//
//        public String grade;
//
//        public static void main(String[] args){
//
//            Person p = new Child();
//
//            System.out.println(p.name);
//
//        }
//
//    }
//
//
//static int cnt = 6;
//    static{
//        cnt += 9;
//    }
//    public static void main(String[] args){
//        System.out.println("cnt =" + cnt);
//    }
//    static{
//        cnt /=3;
////    };
//    public String toString() {
//
//        System.out.print("aaa");
//
//        return "bbb";
//
//    }
//
//    public static void main(String[] args) {
//
//        System.out.println(new Test_1_19());
//    }
//    private float f=1.0f;
//
//    int m=12;
//
//    static int n=1;
//
//    public static void main(String args[]){
//
//        Test_1_19 t=new Test_1_19();
//        System.out.println(Test_1_19.m);
//
//    }

//
//
//public static boolean isAdmin(String userId){
//    return userId.toLowerCase()=="admin";
//}
//    public static void main(String[] args){
//        System.out.println(isAdmin("Admin"));
//    }

//    public static String[] split(String array, String target) {
//        List<String> list = new ArrayList<>();
//        while (array.contains(target)) {
//            int index = array.indexOf(target);
//            String temp = array.substring(0, index);
//            list.add(temp);
//            array = array.substring(index + target.length()); //substring(endIndex)删除endIndex之前的字符串
//        }
//        list.add(array);
//        String[] arr = new String[list.size()];
//        for (int i = 0; i < list.size(); i++) {
//            arr[i] = list.get(i);
//        }
//        return arr;
//    }

//    public static List<String> split1(String array, String target){
//        List<String> result = new ArrayList<>();
//        char[] arrayChar = array.toCharArray();
//        char[] targetChar = target.toCharArray();
//        StringBuffer sb = new StringBuffer();
//        for(int i = 0; i < arrayChar.length;){
//            if(!isContains(arrayChar,targetChar,i)){
//                sb.append(arrayChar[i]);
//                i++;
//            }else {
//                result.add(sb.toString());
//                sb = new StringBuffer();
//                i += targetChar.length;
//            }
//        }
//        if(sb.length() != 0){
//            result.add(sb.toString());
//        }
//        return result;
//    }

//    public static boolean isContains(char[] srcArray, char[] targetArray, int tmp){
//        for(int i = 0; i<targetArray.length; i++){
//            if(tmp + i >= srcArray.length)
//                return false;
//            if(srcArray[i + tmp] != targetArray[i])
//                return false;
//        }
//        return true;
//    }

//

//    public static void main(String[] args) {
//        String str="abcdefgacdef";
//        System.out.println(replace(str,'a','@'));
//    }
//    public static String replace(String str,char oldch ,char newch){
//        String newStr="";
//        for(int i=0;i<str.length();i++){
//            if(oldch==str.charAt(i)){
//                newStr=newStr+newch;
//            }else{
//                newStr=newStr+str.charAt(i);
//            }
//        }
//        return newStr;
//    }
//public static void main(String[] args) {
//    String src="abcdefghabcde";
//    String des="bcdef";
//    System.out.println(contains(src,des));
//    int ret=IndexOf(src,des);
//    if(ret==-1){
//        System.out.println("没有查找到");
//    }else{
//        System.out.println("查找到了位置在："+ret);
//    }

//}
//public static int IndexOf(String src,String des){
//    if(src==null||src.length()<1||des==null||des.length()<1){
//        return -1;
//    }
//    if(des.length()>src.length()){
//        return -1;
//    }
//    char[] srcArray=src.toCharArray();
//    char[] dscArray=des.toCharArray();
//    int srcLen=srcArray.length;
//    int dscLen=dscArray.length;
//    for(int i=0;i<srcLen;i++){
//        boolean find=false;
//        if(srcArray[i]==dscArray[0]&&(i+dscLen<=srcLen)){
//            int count=0;
//            for(int j=0;j<dscLen;j++){
//                if(srcArray[i+j]==dscArray[j]){
//                    count++;
//                }
//            }
//            if(count==dscLen){
//                find=true;
//            }
//        }
//        if(find)
//            return i;
//    }
//    return -1;
//}
//    public static boolean contains(String src,String des){
//        if(src==null||src.length()<1||des==null||des.length()<1){
//            return  false;
//        }
//        if(des.length()>src.length()){
//            return   false;
//        }
//        char[] srcArray=src.toCharArray();
//        char[] dscArray=des.toCharArray();
//        int srcLen=srcArray.length;
//        int dscLen=dscArray.length;
//        for(int i=0;i<srcLen;i++){
//            boolean find=false;
//            if(srcArray[i]==dscArray[0]&&(i+dscLen<=srcLen)){
//                int count=0;
//                for(int j=0;j<dscLen;j++){
//                    if(srcArray[i+j]==dscArray[j]){
//                        count++;
//                    }
//                }
//                if(count==dscLen){
//                     return true;
//                }
//            }
//        }
//        return  false;
//
//    }
public static void main(String[] args) {
    String str1="hello";
    String str2="Hello";
    String str3="hellz";
    int ret1=comparTo(str1,str2);
    int ret2=comparTo(str1,str3);
    System.out.println(ret1);
    System.out.println(ret2);
}
public static int comparTo(String str1,String str2){
    int len1=str1.length();
    int len2=str2.length();
    int min=Math.min(len1,len2);
    int i=0;
    for(i=0;i<min;i++){
        if(str1.charAt(i)-str2.charAt(i)<0){
            return -1;
        } else if(str1.charAt(i)-str2.charAt(i)>0){
            return 1;
        }else{
            continue;
        }
    }
   if(len1==len2){
       return 0;
   }else
       return(len1-len2>0)?1:-1;
}

}