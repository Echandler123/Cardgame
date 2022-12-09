import java.util.ArrayList;

public class Player
{
    private String name;
    private ArrayList<Card> hand = new ArrayList<Card>();
    private int points;
    //this constructor take in a name and sets it for the player
    Player(String name)
    {
        this.name = name;
        points = 0;
    }
    //this constructor takes in a name and an array list of the cards they have called hand
    Player(String name, ArrayList<Card> hand)
    {
        this.name = name;
        points = 0;
        this.hand = hand;
    }
    //this method returns the name of the player
    public String getName() {
        return name;
    }

    //this method returns the hand of the player
    public ArrayList<Card> getHand() {
        return hand;
    }
    //this method returns how many points the player has
    public int getPoints() {
        return points;
    }
    public void addPoints(int addition)
    {
        points += addition;
    }
    //this method adds a card to the player hand
    public void addCard(Card one)
    {
        hand.add(0,one);
    }
    //this method prints out the players name, how many points they have, and the cards in their hand
    public String toString()
    {
        return name + " has " + points + " points " + name + "'s" + "cards:" + hand;
    }
}
