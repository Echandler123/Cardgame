import java.util.ArrayList;
public class Deck
{
    private int cardsleft;
    private ArrayList<Card> stack = new ArrayList<Card>();
    //this constructor takes in the 3 arrays of ranks suits and points to create a sorted deck of cards contained in an
    //arraylist called stack
    public Deck(String[] rank, String[] suit,int[] point) {
        for (String s : suit) {
            for (int j = 0; j < rank.length; j++) {
                Card cards = new Card(rank[j], s, point[j]);
                stack.add(cards);
            }
            cardsleft = stack.size();
        }
    }
    //this method returns if the deck does or does not have anymore more card lefts
    public boolean isempty() {
        if (cardsleft <= 0) {
            return true;
        }
        return false;
    }
    //this method returns the amount cards left in the deck
    public int getCardsLeft()
    {
        return cardsleft;
    }
    //this method deals 1 card and removes that card from the deck
    public Card deal()
    {
        if(cardsleft <= 0)
        {
            return null;
        }
        cardsleft = cardsleft - 1;
        return stack.remove(cardsleft);
    }
    //this method randomly shuffles all the cards in the deck
    public void Shuffle()
    {
        for(int i = 0; i < cardsleft;i++)
        {
            int r = (int)(Math.random()*i)+ 1;
            Card copy = stack.get(i);
            Card copy2 = stack.get(r);
            stack.remove(r);
            stack.add(r,copy);
            stack.remove(i);
            stack.add(i,copy2);
        }
        cardsleft = stack.size();
    }
}
