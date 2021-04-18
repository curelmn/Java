public class Test_0418 {

    public static  int StrToInt(String str) {
     int result=0;
     int flag=1;

     boolean isValid=false;

     char[] arr=str.toCharArray();
     if (arr==null ||arr.length<=0){
         return 0;
     }
     if (arr[0]=='-'){
         flag=-1;
     }
     for ( int i=(arr[0] == '+' || arr[0] == '-') ? 1 : 0;i<arr.length;i++){
         if (!('0' <= arr[i] && arr[i] <= '9') ){
             isValid = true;
             return 0;
         }
        result = result *10+ arr[i]-'0';
        if ((flag==1 && result > Integer.MAX_VALUE)||(flag==-1 && result<Integer.MIN_VALUE)){
            isValid=true;
            return  0;
        }
     }
     return flag*result;
    }

//    public static void main(String[] args) {
//        String str="123456";
//        System.out.println(StrToInt(str));
//    }
}
