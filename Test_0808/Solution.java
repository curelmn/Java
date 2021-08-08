package Test_0808;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public char firstUniqChar(String s) {

        Map<Character,Integer> map=new HashMap<Character, Integer>();
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for (int i=0;i<s.length();i++){
            if (map.get(s.charAt(i))==1){
                return s.charAt(i);
            }
        }
        return ' ';
    }
}
