public class T0126 {
//    public int myAtoi(String s) {
//        int len = s.length();
//        char[] charArray = s.toCharArray();
//        int index = 0;
//        while (index < len && charArray[index] == ' ') {
//            index++;
//        }
//        if (index == len) {
//            return 0;
//        }
//        int sign = 1;
//        char firstChar = charArray[index];
//        if (firstChar == '+') {
//            index++;
//        } else if (firstChar == '-') {
//            index++;
//            sign = -1;
//        }
//
//        int res = 0;
//        while (index < len) {
//            char currChar = charArray[index];
//            if (currChar > '9' || currChar < '0') {
//                break;
//            }
//            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && (currChar - '0') > Integer.MAX_VALUE % 10)) {
//                return sign>0?Integer.MAX_VALUE:Integer.MIN_VALUE;
//            }
//            res = res * 10 +currChar - '0';
//            index++;
//        }
//        return sign>0?res:sign*res;
//    }


//    public int[] searchRange(int[] nums, int target) {
//        int len = nums.length;
//        if(len == 0)
//            return new int[]{-1, -1};
//        int L = 0, R = len - 1;
//        while(L <= R) {
//            int mid = L + (R - L) / 2;
//            if(nums[mid] == target) {
//                //找到了目标，从目标值开始向左右搜索值相同的端点
//                int i = mid - 1, j = mid + 1;
//                while(i >= 0 && nums[i] == target)
//                    i--;
//                while(j < len && nums[j] == target)
//                    j++;
//                return new int[]{i + 1, j - 1};
//            } else if(nums[mid] < target) {
//                L = mid + 1;
//            } else {
//                R = mid - 1;
//            }
//        }
//        return new int[]{-1, -1};
//    }
public static void main(String args[]){
    int num = 10;
    System.out.println(test(num));
}
public static int test(int b){
        try {
            b += 10;
            return b;
        }catch(RuntimeException e){
        }catch(Exception e2){
        } finally{
            b += 10;
            return b;
        }
    }


    public boolean isPalindrome(String s) {
        if(s==null || s.length()==0){
            return true;
        }
        int left=0;
        int right=s.length()-1;
        while(left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


    public int compress(char[] chars) {
        int i = 0, j, num = 0;
        while(i < chars.length) {
            chars[num] = chars[i];//取相同字符序列的首字符存下
            num++;
            j = i + 1;
            while(j < chars.length && chars[i] == chars[j])
                j++;//j指针滑动到相同字符序列末尾的下一个位置
            if(j - i > 1){
                for (char c : String.valueOf(j - i).toCharArray()) {
                    chars[num] = c;//向结果中加入相同字符序列的长度的字符形式
                    num++;
                }
            }
            i = j;
        }
        return num;
    }
}
