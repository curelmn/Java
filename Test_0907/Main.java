package Test_0907;

import sun.plugin2.ipc.windows.WindowsIPCFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String s=scanner.next();
            int level=0;
            String ss=s.toLowerCase();
            char[] arr=ss.toCharArray();
            int index=0;
            boolean flag=true;
            while (index<arr.length) {
                StringBuffer stringBuffer=new StringBuffer();
                for (int i = index; i < arr.length; i++) {
                    char c = arr[i];
                    if (c == 'e') {
                        index = i;
                        stringBuffer.append(c);
                        break;
                    } else {
                        flag = false;
                    }
                }
                for (int i = index; i < arr.length; i++) {
                    char c = arr[i];
                    if (c == 'a') {
                        index = i;
                        stringBuffer.append(c);
                        break;
                    } else {
                        flag = false;
                    }
                }
                for (int i = index; i < arr.length; i++) {
                    char c = arr[i];
                    if (c == 's') {
                        index = i;
                        stringBuffer.append(c);
                        break;
                    } else {
                        flag = false;
                    }
                }
                for (int i = index; i < arr.length; i++) {
                    char c = arr[i];
                    if (c == 'y') {
                        index = i;
                        stringBuffer.append(c);
                        break;
                    } else {
                        flag = false;
                    }
                }
                if (stringBuffer.equals("easy")){
                    level++;
                }
            }
            System.out.println(level);
        }
    }
}
