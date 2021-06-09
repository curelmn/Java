import java.util.Scanner;

public class Test_0608 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String s=scanner.nextLine();
            char[] arr=s.toCharArray();
            StringBuilder stringBuilder=new StringBuilder();

            for (int i = 0; i <arr.length ; i++) {
                if (arr[i]=='_'){
                    stringBuilder.append(Character.toUpperCase(arr[i+1]));
                    i++;
                }else {
                    stringBuilder.append(arr[i]);
                }

            }
            System.out.println(stringBuilder.toString());
        }
    }


//
//    链接：https://www.nowcoder.com/questionTerminal/aed1c7bbc2604e7c9661a2348b0541b8
//    来源：牛客网
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        while (sc.hasNext()){
//            String s=sc.nextLine();
//            getName(s);
//        }
//    }

    private static void getName(String s) {
        char[] c=s.toCharArray();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i <c.length ; i++) {
            if (c[i]=='_'){
                sb.append(Character.toUpperCase(c[i+1]));
                i++;
            }else {
                sb.append(c[i]);
            }

        }
        System.out.println(sb.toString());

    }
}
