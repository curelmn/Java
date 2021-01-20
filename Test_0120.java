import java.util.Arrays;

public class Test_0120 {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8, 9};
        swap(array, array2);
        System.out.println("array: "+Arrays.toString(array));
        System.out.println("array2: "+Arrays.toString(array2));
    }

    public static void swap(int[] array, int[] array2) {
        int tmp = 0;
        for (int i = 0; i < array.length; i++) {
            tmp = array[i];
            array[i] = array2[i];
            array2[i] = tmp;
        }
    }

    public int lengthOfLastWord(String s) {
        int end = s.length() - 1;
        while(end >= 0 && s.charAt(end) == ' ') end--;
        if(end < 0) return 0;
        int start = end;
        while(start >= 0 && s.charAt(start) != ' ') start--;
        return end - start;

    }

    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int num=x;
        int tmp=0;
        while(num!=0){
            tmp=tmp*10+num%10;
            num/=10;
        }
        return tmp==x;
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] map=new int[26];
        for(int i=0;i<magazine.length();i++){
            map[magazine.charAt(i)-97]++;
        }
        for(int i=0;i<ransomNote.length();i++){
            if(map[ransomNote.charAt(i)-97]>0){
                map[ransomNote.charAt(i)-97]--;
            }else{
                return false;
            }
        }
        return true;
    }
}
