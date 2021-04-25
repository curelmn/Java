package Test_0425;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T0425 {
//    public int binInsert(int n, int m, int j, int i) {
//        // write code here
//        m=m<<j;
//        return  n|m;
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        while (scanner.hasNext()){
//            int k=scanner.nextInt();
//            int m=k/2;
//            int n=k-m;
//            while (m>=2 &&n<=k-2){
//                if (isPrime(m) && isPrime(n)){
//                    System.out.println(m);
//                    System.out.println(n);
//                    break;
//                }else {
//                    m--;
//                    n++;
//                }
//            }
//        }
//    }
//
//    public static boolean isPrime(int m){
//        int i=2;
//        for (;i<m;i++){
//            if (m%i==0){
//                return false;
//            }
//        }
//        return  true;
//    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()) {
//            String str = scanner.nextLine();
//            System.out.println(analysSting(str));
//        }
//    }

    public static String analysSting(String str) {
        List<String> list = new ArrayList<>();

        int first = 0;
        for (int i = 0; i < str.length(); ) {
            if (str.charAt(i) == '"') {
                list.add(str.substring(first, i));
                for (int j = i + 1; j < str.length(); j++) {
                    if (str.charAt(j) == '"') {
                        list.add(str.substring(i, j + 1));
                        i = j + 1;
                        first = i;
                    }
                }
            } else {
                i++;
            }
        }

        if (first < str.length()) {
            list.add(str.substring(first, str.length()));
        }

        int result = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (String t : list) {
            if (!t.startsWith("\"")) {
                String[] ss = t.split("\\s+");
                result += ss.length;
                for (String s1 : ss) {
                    stringBuilder.append(s1).append('\n');
                }
            } else {
                result++;
                stringBuilder.append(t).append('\n');
            }
        }
        return result + "\n" + stringBuilder.substring(0, stringBuilder.length() - 1);
    }



    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] charArray = str.toCharArray();
        List<String> list = new ArrayList<String>();
        //未遇到引号，标志位设为false
        boolean isleftyinhao = false;
        String temp = "";
        for(int i = 0; i < charArray.length; i++){
            //如果遇到引号，且此时左引号标志位为false，那么判断此引号为左引号
            if(charArray[i] == '\"' && !isleftyinhao){
                isleftyinhao = true;
                continue;
            }
            //如果遇到引号，且此时左引号标志位为true，那么判断此引号为右引号
            if(charArray[i] == '\"' && isleftyinhao){
                isleftyinhao = false;
                continue;
            }
            //遇到引号间空格的情况
            if(charArray[i] == ' ' && isleftyinhao){
                temp += charArray[i];
                continue;
            }
            //遇到正常空格的情况
            if(charArray[i] == ' '){
                list.add(temp);
                temp ="";
                continue;
            }
            //其他情况
            temp += charArray[i];
        }
        //将最后一个加上
        list.add(temp);

        //输出
        System.out.println(list.size());
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

    }

    链接：https://www.nowcoder.com/questionTerminal/668603dc307e4ef4bb07bcd0615ea677
    来源：牛客网

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] charArray = str.toCharArray();
        List<String> list = new ArrayList<String>();
        //未遇到引号，标志位设为false
        boolean isleftyinhao = false;
        String temp = "";
        for(int i = 0; i < charArray.length; i++){
            //如果遇到引号，且此时左引号标志位为false，那么判断此引号为左引号
            if(charArray[i] == '\"' && !isleftyinhao){
                isleftyinhao = true;
                continue;
            }
            //如果遇到引号，且此时左引号标志位为true，那么判断此引号为右引号
            if(charArray[i] == '\"' && isleftyinhao){
                isleftyinhao = false;
                continue;
            }
            //遇到引号间空格的情况
            if(charArray[i] == ' ' && isleftyinhao){
                temp += charArray[i];
                continue;
            }
            //遇到正常空格的情况
            if(charArray[i] == ' '){
                list.add(temp);
                temp ="";
                continue;
            }
            //其他情况
            temp += charArray[i];
        }
        //将最后一个加上
        list.add(temp);

        //输出
        System.out.println(list.size());
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}



