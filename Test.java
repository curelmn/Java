package Test_0729;





import java.util.ArrayList;
import java.util.List;

public class Test {
    public boolean threeConsecutiveOdds(int[] arr) {
        for(int i=0;i<arr.length-2;i++){
            if (arr[i]%2!=0 && arr[i+1]%2!=0 && arr[i+2]%2 !=0 ){
                return true;
            }
        }
        return false;
    }

    public boolean threeConsecutiveOdds(List<Integer> arr) {
        for (int i=0;i<arr.size()-2;i++){
            if (arr.get(i)%2 !=0 &&arr.get(i+1)%2 !=0 && arr.get(i+2)%2 !=0){
                return true;
            }
        }
        return false;
    }
    //杨辉三角
    public List<List<Integer>> generate(int numRows) {
        if (numRows<=0){
            return new ArrayList<>();
        }
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> firstLine=new ArrayList<>();
        firstLine.add(1);
        result.add(firstLine);
        if (numRows==1){
            return result;
        }

        List<Integer> secondLine=new ArrayList<>();
        secondLine.add(1);
        secondLine.add(1);
        result.add(secondLine);

        if (numRows==2){
            return result;
        }

        for (int row=3;row<=numRows;row++){
            //row从1开始计算 list下标为0开始 所以是-1-1
            List<Integer>  prevLine=result.get(row-1-1);
            List<Integer>  currentLine=new ArrayList<>();
            currentLine.add(1);

            for (int col=2;col<row-1;col++){
                int num1=prevLine.get(col-1);
                int num2=prevLine.get(col-1-1);
                currentLine.add(num1+num2);
            }
            currentLine.add(1);
            result.add(currentLine);
        }
         return result;

    }

    public List<List<Integer>> generate1(int numRows) {
        if (numRows==0){
            return new ArrayList<>();
        }
        List<List<Integer>>  result=new ArrayList<>();
        List<Integer> firstLine=new ArrayList<>();

        firstLine.add(1);
        result.add(firstLine);
        if (numRows==1){
            return result;
        }
        List<Integer> secondLine=new ArrayList<>();
        secondLine.add(1);
        secondLine.add(1);
        result.add(secondLine);
        if (numRows==2){
            return  result;
        }

    for (int row=3;row<=numRows;row++){
        List<Integer> prevLine=result.get(row-1-1);
        List<Integer> currentLine=new ArrayList<>();
        currentLine.add(1);
        for (int col=2;col<row-1;col++){
            int num1=prevLine.get(col-1);
            int num2=prevLine.get(col-1-1);
            currentLine.add(num1+num2);
        }
        currentLine.add(1);
        result.add(currentLine);
    }
    return  result;
    }
}
