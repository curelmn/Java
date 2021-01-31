package Test0131;

public class Card {
    public String suit;
    public String rank;
    public Card(String suit,String rank){
        this.rank=rank;
        this.suit=suit;
    }
    @Override
    public String toString(){
        return "("+this.suit+this.rank+")";
    }
}
