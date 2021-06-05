

import java.util.Scanner;

public class Test_0605 {
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        while (scanner.hasNext()){
//            String s=scanner.nextLine();
//            char[] arr=s.toCharArray();
//            StringBuilder stringBuilder=new StringBuilder();
//            for (int i=0;i<arr.length;i++){
//                if (arr[i]>='0' && arr[i]<='9'){
//                    stringBuilder.append(arr[i]);
//                }
//            }
//            System.out.println(stringBuilder.toString());
//        }
//    }
    
    static int [][] fd = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}}; // 设置上下左右移动
    static char [][] c = new char[10][10];
    static int [][] num = new int [10][10];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(input.hasNext()){
            for(int i = 0; i < 10; i++){
                for(int j = 0; j < 10; j++){
                    num[i][j] = Integer.MAX_VALUE;
                }
            }

            for(int i = 0; i < 10; i++){
                c[i] = input.next().toCharArray();
            }
            num[0][1] = 0;
            dfs(0, 1);
            System.out.println(num[9][8]);
        }
    }

    private static void dfs(int x, int y){
        int xx, yy;
        for(int i = 0; i < 4; i++){
            xx = x + fd[i][0]; yy = y + fd[i][1];
            if(0 <= xx && xx < 10 && yy < 10
                    && yy >= 0 && c[xx][yy] == '.'){ // 坐标没有越界，还可以走、
                if(num[xx][yy] > num[x][y] + 1){
                    num[xx][yy] = num[x][y] + 1;
                    dfs(xx, yy);
                }
            }
        }
    }
}
}
