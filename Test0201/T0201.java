package Test0201;

import java.util.ArrayList;
import java.util.List;

public class T0201 {
    class Solution {
        public boolean threeConsecutiveOdds(int[] arr) {
            for(int i=0;i<arr.length-2;i++){
                if(arr[i]%2!=0 && arr[i+1]%2!=0 && arr[i+2]%2!=0){
                    return true;
                }
            }
            return false;
        }
    }

    public List<List<Integer>> generate(int numRows){
        if(numRows<=0) {
            return new ArrayList<>();
        }
            List<List<Integer>> result=new ArrayList<>();
            List<Integer> firstLine = new ArrayList<>();
            firstLine.add(1);
            result.add(firstLine);
            if(numRows==1){
                return  result;
            }
            List<Integer> secondLine =new ArrayList<>();
            secondLine.add(1);
            secondLine.add(1);
            result.add(secondLine);
            if(numRows==2){
                return  result;
            }

            for(int row=3;row<=numRows;row++){
                List<Integer> precLine=result.get(row-1-1);
                List<Integer> currentLine=new ArrayList<>();
                currentLine.add(1);
                for(int col=2;col<=row-1;col++){
                    int num1=precLine.get(col-1);
                    int num2=precLine.get(col-1-1);
                    currentLine.add(num1+num2);
                }
                currentLine.add(1);
                result.add(currentLine);
            }
            return result;
        }
    }
