import java.util.ArrayList;

public class Player
{
    private String name;
    private ArrayList<Card> hand = new ArrayList<Card>();
    private int points;
    Player(String name)
    {
        this.name = name;
        points = 0;
    }
    Player(String name, ArrayList<Card> hand)
    {
        this.name = name;
        points = 0;
        this.hand = hand;
    }
    public String getName() {
        return name;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }
    public int getPoints() {
        return points;
    }
    public void addPoints(int addition)
    {
        points += addition;
    }
    public void addCard(Card one)
    {
        hand.add(0,one);
    }
    public void addCards(Card one)
    {
        hand.add(one);
    }
    public Card removeCard()
    {
        return hand.remove(hand.size() - 1);
    }
    public String toString()
    {
        return name + " has " + points + " points " + name + "'s" + "cards:" + hand;
    }
}
