import java.util.*;

public class Test_0607 {
//    public static void main(String[] args) {
//        String[] map = {"ABCDEFGHIJKLMNOPQRSTUVWXYZ", "22233344455566677778889999"};
//        Scanner  scanner=new Scanner(System.in);
//        while (scanner.hasNext()){
//           int n=scanner.nextInt();
//            Set<String> set=new TreeSet<>();
//            StringBuilder stringBuilder=new StringBuilder();
//            for (int i=0;i<n;i++){
//                char[] ch=scanner.next().replace("-","").toCharArray();
//                for (int j=0;i<ch.length;j++){
//                    if (j==3){
//                        stringBuilder.append("-");
//                        if (Character.isLetter(ch[j])){
//                            stringBuilder.append(map[1].charAt(map[0].indexOf(ch[j])));
//                        }else{
//                            stringBuilder.append(ch[j]);
//                        }
//                    }
//                }
//                set.add(stringBuilder.toString());
//                stringBuilder.delete(0,stringBuilder.length());
//            }
//            for (String s:set){
//                System.out.println(s);
//            }
//            System.out.println();
//        }
//    }



//    链接：https://www.nowcoder.com/questionTerminal/ceb89f19187b4de3997d9cdef2d551e8
//    来源：牛客网

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String[] map = {"ABCDEFGHIJKLMNOPQRSTUVWXYZ", "22233344455566677778889999"};
//        while (sc.hasNext()) {
//            int n = sc.nextInt();
//            Set<String> set = new TreeSet<>();
//            StringBuilder sb = new StringBuilder();
//            for (int i = 0; i < n; i ++ ) {
//                char[] ch = sc.next().replace("-", "").toCharArray();
//                for (int j = 0; j < ch.length; j ++ ) {
//                    if(j == 3) sb.append("-");
//                    if(Character.isLetter(ch[j])) sb.append(map[1].charAt(map[0].indexOf(ch[j])));
//                    else sb.append(ch[j]);
//                }
//                set.add(sb.toString());
//                sb.delete(0, sb.length());
//            }
//            for (String s:set)
//                System.out.println(s);
//            System.out.println();
//        }
//    }

    public static void main(String[] args) {
        String  s1="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String  s2="222333444555666777788899991234567890";

        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int n=scanner.nextInt();
            ArrayList<String>  list=new ArrayList<>();
            for (int i=0;i<n;i++){
                String s=scanner.next();
                s=s.replace("-","");
                String result="";
                for (int j=0;j<s.length();j++){
                    result+=s2.charAt(s1.indexOf(s.charAt(j)+""));
                }
                result=result.substring(0,3)+"-"+result.substring(3,s.length());
                if (!list.contains(result)){
                    list.add(result);
                }
            }

            Collections.sort(list);
            for (int j=0;j<list.size();j++){
                System.out.println(list.get(j));
            }
            System.out.println();
        }
    }
}
