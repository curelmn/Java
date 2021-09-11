package Test_0911;

import org.apache.hadoop.yarn.webapp.hamlet2.Hamlet;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static  int digitsRecursive (int num) {
        int sum=0;
        while (num!=0){
            int tmp=num%10;
            num=num/10;
            sum+=tmp;
        }
        if (sum<10){
            return sum;
        }
        return digitsRecursive(sum);
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,5,5};
        int ret=solution(arr);
        System.out.println(ret);
    }

    public  static  int solution (int[] source) {
        // write code here
        Map<Integer, Integer> map=new HashMap<>();
        for (int i=0;i<source.length;i++){
            if (!map.containsKey(source[i])){
                map.put(source[i],1);
            }else {
                map.put(source[i],map.get(source[i])+1);
            }
        }
        Integer t=0;

        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            if (entry.getValue()==1){
                t=entry.getKey();
            }

        }
        return  t;
    }

//    public int solution (String psw) {
//        // write code here
//    }
}
