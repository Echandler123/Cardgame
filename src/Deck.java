import java.util.ArrayList;
public class Deck
{
    private int cardsleft;
    private ArrayList<Card> stack = new ArrayList<Card>();
    public Deck(String[] rank, String[] suit,int[] point) {
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                //for (int k = 0; k < point.length; k++) {
                    cardsleft++;
                    Card cards = new Card(rank[i], suit[j], point[i]);
                }
            }
        }
    public boolean isempty()
    {
        if(cardsleft == 0)
        {
            return true;
        }
        return false;
    }
    public int getCardsLeft()
    {
        return cardsleft;
    }
    public Card deal()
    {
        if(cardsleft > 0)
        {
            return stack.remove(cardsleft);
        }
        return null;
    }
    public void shuffle()
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
    }
}
