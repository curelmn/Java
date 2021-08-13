package Test_0813;

import org.apache.hadoop.mapreduce.lib.join.TestWrappedRRClassloader;
import org.apache.hadoop.shaded.com.google.inject.internal.cglib.core.$ObjectSwitchCallback;
import org.apache.hadoop.yarn.webapp.hamlet2.Hamlet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public int[][] findContinuousSequence(int target) {
        List<int[]> result=new ArrayList<>();
        int sum=0;
        int limit=(target-1)/2;
        for (int i=1;i<=limit;++i){
            for (int j=i; ;++j){
                sum+=j;
                if (sum>target){
                    sum=0;
                    break;
                }else if (sum==target){
                    int[] res=new int[j-i+1];
                    for (int k=i;k<=j;++k){
                        res[k-i]=k;
                    }
                    result.add(res);
                    sum=0;
                    break;
                }
            }
        }
        return int[][];
    }

    public String reverseWords(String s) {
        StringBuilder stringBuilder=new StringBuilder();
        s=s.trim();
        String[] array=s.split(" ");
        for (int i=array.length-1;i>=0;i--){
            if (!array[i].equals("")){
                stringBuilder.append(array[i]);
                if(i>0){
                    stringBuilder.append(" ");
                }
            }

        }
        return stringBuilder.toString().trim();
    }

    public String reverseLeftWords(String s, int n) {
        if (s.length()==n|| n==0){
            return s;
        }
        return s.substring(n,s.length())+s.substring(0,n);
    }
}
