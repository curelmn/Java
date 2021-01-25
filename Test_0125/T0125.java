package Test_0125;

import sun.security.util.Password;

public class T0125 {
    private static String userName="caixukun";
    private static String password="cxk19980802";
    public static void main(String[] args) {
        try{
            login("caixuk","cxk19980802");
        }catch (UserError userError){
            userError.printStackTrace();
        }catch(PasswordError passwordError){
            passwordError.printStackTrace();
        }
    }
    static class UserError extends Exception{
        public UserError(String message){
            super((message));

        }
    }
    static class PasswordError extends Exception{
        public PasswordError(String message){
            super(message);
        }
    }
    public static void login(String userName,String password)throws UserError,PasswordError{
        if(!T0125.userName.equals(userName)){
            throw  new UserError("用户名错误");
        }
        if(!T0125.password.equals(password)){
            throw  new PasswordError("密码错误");

        }
        System.out.println("登录成功");
    }


    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }




    public String addBinary(String a, String b) {
        if(a == null || a.length() == 0) return b;
        if(b == null || b.length() == 0) return a;

        StringBuilder stb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;

        int c = 0;  // 进位
        while(i >= 0 || j >= 0) {
            if(i >= 0) c += a.charAt(i --) - '0';
            if(j >= 0) c += b.charAt(j --) - '0';
            stb.append(c % 2);
            c >>= 1;
        }

        String res = stb.reverse().toString();
        return c > 0 ? '1' + res : res;
    }
}
