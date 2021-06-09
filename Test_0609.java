import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Test_0609 {
    //    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        while (scanner.hasNext()){
//
//            StringBuilder stringBuilder=new StringBuilder(scanner.next());
//            char[] arr=scanner.next() .toCharArray();
//            boolean falg=true;
//            for (int i=0;i<arr.length;i++){
//                int index=stringBuilder.indexOf(String.valueOf(arr[i]));
//                if (index!=-1){
//                    stringBuilder.deleteCharAt(index);
//                }else {
//                    System.out.println("No");
//                    falg=false;
//                    break;
//                }
//            }
//            if (falg){
//                System.out.println("Yes");
//            }
//        }
//    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            String[] s = new String[num];
            int count = 0;
            for (int i = 0; i < num; i++) {
                s[i] = scanner.next();
            }
            String key = scanner.next();
            char[] keyChar = key.toCharArray();
            Arrays.sort(keyChar);
            int n = scanner.nextInt();
            ArrayList<String> list = new ArrayList<>();
            for (int i = 0; i < num; i++) {
                int m = check(key, s[i], keyChar);
                count += m;
                if (m == 1) {
                    list.add(s[i]);
                }
            }
            System.out.println(count);
            Collections.sort(list);
            if (count >= n) {
                System.out.println(list.get(n - 1));
            }
        }
    }

    public static int check(String key, String word, char[] keyChar) {
        if (key.equals(word) || key.length() != word.length())
            return 0;
        char[] wordChar = word.toCharArray();
        Arrays.sort(wordChar);
        return Arrays.equals(keyChar, wordChar) ? 1 : 0;
    }
}