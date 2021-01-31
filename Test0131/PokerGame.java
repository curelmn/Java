package Test0131;

import java.util.*;

public class PokerGame {
      public static final String[] suits={"♥","♠","♦","♣"};

      private static List<Card> buyPoker(){
            List<Card> poker=new ArrayList<>();
            for(int i=0;i<4;i++){
                  for(int j=2;j<=10;j++){
                        poker.add(new Card(suits[i],""+j));
                  }
                  poker.add(new Card(suits[i],""+"J"));
                  poker.add(new Card(suits[i],""+"Q"));
                  poker.add(new Card(suits[i],""+"K"));
                  poker.add(new Card(suits[i],""+"A"));
            }
            poker.add(new Card("","big Joker"));
            poker.add(new Card("","small Joker"));
            return poker;
      }

      private static void shuffle(List<Card> poker){
            Random random=new Random();
            for(int i=poker.size()-1;i>0;i--){
                  int pos=random.nextInt(i);
                  swap(poker,i,pos);
            }
      }
      private static void swap(List<Card>poker,int i,int j){
            Card temp=poker.get(i);
            poker.set(i,poker.get(j));
            poker.set(j,temp);
      }

      public static void main(String[] args) {
            List<Card> poker=buyPoker();

            Collections.shuffle(poker);
            System.out.println(poker);
            List<List<Card>> players=new ArrayList<>();
            players.add(new ArrayList<>());
            players.add(new ArrayList<>());
            players.add(new ArrayList<>());
            for(int i=0;i<8;i++){
                  for(int j=0;j<3;j++){
                        Card top=poker.remove(0);
                        List<Card> player=players.get(j);
                        player.add(top);
                  }
            }

            for(int i=0;i<players.size();i++){
                  List<Card> player=players.get(i);
                  System.out.println("玩家"+i+" 的手牌是："+ player);
            }
      }
}
