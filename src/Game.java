import java.util.ArrayList;

public class Game
{
    private String name;
    private static String[] ranks = {"A", "2", "3", "4", "5", "7", "8", "9", "10", "J", "Q", "K"};
    private static String[] suits = { "Hearts", "Clubs", "Spades", "Diamonds"};
    private static int[] values = {1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13};
    public Game(String name) {
        this.name = name;
        String winner = "";
        Deck one = new Deck(ranks, suits, values);
        Player E = new Player(name);
        Player C = new Player("Computer");
        one.Shuffle();
    }
    public String playGame() {
        String winner = "";
        Deck one = new Deck(ranks, suits, values);
        Player E = new Player(name);
        Player C = new Player("Computer");
        one.Shuffle();
        for (int i =0; i < 26; i++)
        {
            E.addCard(one.deal());
        }
        for(int j =0; j < 26; j++)
        {
            C.addCard(one.deal());
        }
        ArrayList<Card> yourhand = E.getHand();
        ArrayList<Card> theirhand = C.getHand();

        for (int k = 0; k < 21; k++) {
            if (yourhand.get(k).getPoint()  > theirhand.get(k).getPoint() )
            {
                E.addPoints(1);
            }
            if (yourhand.get(k).getPoint() < theirhand.get(k).getPoint() ) {
                C.addPoints(1);
            }
            if (yourhand.get(k).getPoint()  == theirhand.get(k).getPoint() ) {
                int tier = 0;
                while (yourhand.get(k) == theirhand.get(k)) {
                    tier++;
                    k++;
                }
                if (yourhand.get(k).getPoint()  > theirhand.get(k).getPoint() ) {
                    E.addPoints(tier);
                }
                if (yourhand.get(k).getPoint()  < theirhand.get(k).getPoint() ) {
                    C.addPoints(tier);
                }
            }
        }
        if(C.getPoints() < E.getPoints())
        {
            winner = name;
        }
        if(C.getPoints() > E.getPoints())
        {
            winner = "Computer";
        }
        return winner;
    }
    public void tier()
    {

    }

}
