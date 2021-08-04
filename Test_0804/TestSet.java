package Test_0804;


import org.apache.hadoop.shaded.com.google.inject.internal.cglib.core.$CodeGenerationException;
import org.apache.hadoop.yarn.webapp.hamlet2.Hamlet;

import java.util.*;

public class TestSet {
    public int singleNumber(int[] nums){
//        Map<Integer,Integer> map=new HashMap<>();
//        for (int x:nums){
//            Integer val=map.get(x);
//            if (val==null){
//                map.put(x,1);
//            }else {
//                map.put(x,val+1);
//            }
//        }
//        for (Map.Entry<Integer,Integer>  entry:map.entrySet()){
//           if (entry.getValue().equals(1)){
//               return entry.getKey();
//           }
//        }
        int singleDog=0;
        for (int x:nums){
            singleDog ^=x;
        }
        return singleDog;
    }
    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
public Node copyRandomList(Node head){
        Map<Node,Node> map=new HashMap<>();
        for (Node cur=head;cur!=null;cur=cur.next){
            Node curNew=map.get(cur);
            Node curNextNew=map.get(cur.next);
            curNew.next=curNextNew;

            map.get(cur).random=map.get(cur.random);
        }
        return map.get(head);
    }
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set=new HashSet<>();
        for (int i=0;i<jewels.length();i++){
            set.add(jewels.charAt(i));
        }
        int count=0;
        for (int i=0;i<stones.length();i++){
            if (set.contains(stones.charAt(i))){
                count++;
            }
        }
        return count;
    }

    public List<String> topKFrequent(String[] words, int k) {
//        //1.使用map统计words中每个单词的频率
//        Map<String,Integer> map=new HashMap<>();
//        for (String x:words){
//            Integer value=map.getOrDefault(x,0);
//            map.put(x,value+1);
//        }
//        //2.把所有的key都取出来，放到一个list中
//        List<String> wordList=new ArrayList<>(map.keySet());
//        //3.把wordList 进行排序，需要在sort的第二个参数里
//        //传入一个Comparator比较器对象，用来指定比较规则
//
//        Collections.sort(wordList, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                Integer count1=map.get(o1);
//                Integer count2=map.get(o2);
//                if (count1.equals(count2)){
//                    return o1.compareTo(o2);
//                }
//                return count2-count1;
//            }
//        });
//        return wordList.subList(0,k);
        Map<String,Integer> map=new HashMap<>();
        for (String x:words){
            Integer value=map.getOrDefault(x,0);
            map.put(x,value+1);
        }
        List<String> wordList=new ArrayList<>(map.keySet());
        Collections.sort(wordList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                Integer count1=map.get(o1);
                Integer count2=map.get(o2);
                if (count1.equals(count2)){
                    return o1.compareTo(o2);
                }
                return  count1-count2;
            }
        });
            return  wordList.subList(0,k);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String excepted=scanner.next();
            String actual=scanner.next();
            excepted=excepted.toUpperCase();
            actual=actual.toUpperCase();

            Set<Character> actualSet=new HashSet<>();
            for (int i=0;i<actual.length();i++){
                actualSet.add(actual.charAt(i));
            }

            Set<Character> brokenSet=new HashSet<>();
            for (int i=0;i<excepted.length();i++){
                char c=excepted.charAt(i);
                if (actualSet.contains(c)){
                    continue;
                }
                if (brokenSet.contains(c)){
                    continue;
                }
                System.out.print(c);
                brokenSet.add(c);
            }
            System.out.println();
        }
    }
}
