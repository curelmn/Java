public class Test_0524 {
    public static void main(String[] args) {
        String  s="DBDBS5050.11WDNDDNJ5044.21";
        String s1=mysplit1(s,"DBDBS50");
        String s2=mysplit2(s1,"WDNDDNJ50");
        System.out.println(s2);
    }
    public static String mysplit1(String s,String ss){
        StringBuilder stringBuilder=new StringBuilder(s);

        while (true){
            int index=stringBuilder.indexOf(ss);
            if (index==-1){
                break;
            }
            stringBuilder.delete(index,index+ss.length());
        }

        return stringBuilder.toString()+" ";
    }
    public static String mysplit2(String s,String ss){
        StringBuilder stringBuilder=new StringBuilder(s);

        while (true){
            int index=stringBuilder.indexOf(ss);
            if (index==-1){
                break;
            }
            stringBuilder.delete(index,index+ss.length());
        }

        return stringBuilder.toString();
    }
}
