public class Test4 {
//    public  static void printStar(int num){
//        int i=0;
//        for(i=0;i<num;i++){
//            if(i<num-1){
//                int j=0;
//                for(j=0;j<num-1-i;j++){
//                    System.out.print(" ");
//                }
//                System.out.print("*");
//                if(i>=1){
//                    for(j=0;j<2*i-1;j++){
//                        System.out.print(" ");
//                    }
//                    System.out.print("*");
//                }
//            }
//            else{
//                int k=0;
//                for(k=0;k<2*num-1;k++){
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }
//    }
//    public static void main(String[] args) {
//      int n=6;
//      int m=10;
//      printStar(6);
//      printStar(10);
//    }



    //乘法表
//    public void mulTable(){
//        int i=1;
//        int j=1;
//         while(i<=9){
//          j=1;
//          while(j<=i){
//              System.out.printf("%d x %d=%-2d ",i,j,i*j);
//              j++;
//          }
//             System.out.println();
//          i++;
//    }
//}
//static void print(Test4 s){
//        s.mulTable();
//}
//    public static void main(String[] args) {
//        Test4 obj=new Test4();
//        print(obj);
//    }




    //属相计算
//    public static String animalsByYear(int year){
//        int base=1876;
//        String[] animals=new String[] {"鼠","牛","虎","兔","龙","蛇","马","羊","猴","鸡","狗","猪"};
//        return animals[(year-base)%12];
//    }
//    public static void main(String[] args) {
//        System.out.println("属相是"+   Test4.animalsByYear(2000));
//    }



    //计算器
//    public static int add(int a,int b){
//        return a+b;
//    }
//    public static int sub(int a,int b){
//        return a-b;
//    }
//    public static int div(int a,int b) {
//        if (b == 0) {
//            System.out.println("整数除法" + "分母不能为0");
//        } else {
//            return a / b;
//        }
//        return a/b;
//    }
//    public static int mul(int a,int b){
//        return a*b;
//    }
//
//    public static float add(float a,float b){
//        return a+b;
//    }
//    public static float sub(float a,float b){
//        return a-b;
//    }
//    public static float div(float a,float b){
//        if (b == 0.0) {
//            System.out.println("浮点数除法" + "分母不能为0");
//        } else {
//            return a / b;
//        }
//        return a/b;
//    }
//    public static float mul(float a,float b){
//        return a*b;
//    }
//    public static void main(String[] args) {
//        System.out.println("整数加法的运算结果是："+add(2,3));
//        System.out.println("整数减法的运算结果是："+sub(2,3));
//        System.out.println("整数除法的运算结果是："+div(2,3));
//        System.out.println("整数乘法的运算结果是："+mul(2,3));
//        System.out.println("浮点数加法的运算结果是："+add(2f,3f));
//        System.out.println("浮点数减法的运算结果是："+sub(2f,3f));
//        System.out.println("浮点数除法的运算结果是："+div(2f,3f));
//        System.out.println("浮点数乘法的运算结果是："+mul(2f,3f));
//    }



//字符串数组逆序排列
//    public static void reverseString(String str){
//        char[] arr=str.toCharArray();
//        int left=0;
//        int right=arr.length-1;
//        System.out.println(arr);
//        while(left<right){
//            char tmp=arr[left];
//            arr[left]=arr[right];
//            arr[right]=tmp;
//            left++;
//            right--;
//        }
//        System.out.println(arr);
//    }
//    public static void main(String[] args) {
//       reverseString("abcd");
//    System.out.println();
//    reverseString("i am a student");
//}



    //求两个整数数组的交集
//     public static void gather(int[] arr1,int[] arr2){
//         for(int i=0;i<arr1.length;i++){
//             for(int j=0;j<arr2.length;j++){
//                 if(arr1[i]==arr2[j]){
//                     System.out.print(arr1[i]+" ");
//
//                 }
//             }
//         }
//     }
//    public static void main(String[] args) {
//        int[] arr1=new int[]{1,2,3,4,5,6,7};
//        int[] arr2=new int[]{4,5,6,7,0};
//        gather(arr1,arr2);
//    }



    //两个浮点型数组的并集
//    public static void folatSum(float[] a,float[] b){
//        float[] c=new float[a.length+b.length];
//        int k=0;
//        for(int i=0;i<a.length;i++){
//            c[k]=a[i];
//            k++;
//        }
//        for(int j=0;j<b.length;j++){
//            boolean flag=true;
//            for(int i=0;i<a.length;i++){
//                if(c[i]==b[j]){
//                    flag=false;
//                }else
//                    continue;
//            }
//            if(flag){
//                c[k]=b[j];
//                k++;
//            }
//        }
//        float sum[]=new float[k];
//        for(int n=0;n<k;n++){
//            sum[n]=c[n];
//            System.out.print(sum[n]+" ");
//        }
//    }
//    public static void main(String[] args) {
//        float[] arr1=new float[]{1.2f,1.3f,2.1f,4.5f};
//        float[] arr2=new float[]{1.2f,1.3f,2.1f,8.5f,3.5f};
//        folatSum(arr1,arr2);
//    }


    


}

