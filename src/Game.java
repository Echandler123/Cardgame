import java.util.ArrayList;

public class Game
{
    private String name;
    private static String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    private static String[] suits = { "Hearts", "Clubs", "Spades", "Diamonds"};
    private static int[] values = {1, 2, 3, 4, 5,6, 7, 8, 9, 10, 11, 12, 13};

    String winner = "Tie";
    Deck one;
    Player E;
    Player C;
    public Game(String name) {
        this.name = name;
        one = new Deck(ranks, suits, values);
        E = new Player(name);
        C = new Player("Computer");
    }
    public void playGame() {

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
            if(yourhand.get(k).getPoint()  == theirhand.get(k).getPoint() ) {
                war(E,C,yourhand, theirhand,k);
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
        System.out.println("Winner:" + winner);
    }
    public void war(Player E, Player C,ArrayList<Card> yourhand,ArrayList<Card> theirhand, int spot)
    {
        int total = 0;
        int total2 = 0;
        for(int k = 0; k <=3; k++) {
            total += yourhand.get(k).getPoint();
            total2 +=  theirhand.get(k).getPoint();
        }
        if (total > total2 ) {
            E.addPoints(6);
        }
        if (total2 > total) {
            C.addPoints(6);
        }
    }
    public void PrintInstructions()
    {
        System.out.println("This card game is war. In this game it will be you against the computer.The deck is " +
                "divided evenly divide between you and the computer. In a game of war you and the computer will both" +
                "draw a card from your deck and the person with the highest ranked card wins.If you win you get a point " +
                "added to your score If you both draw a card with the same rank then it is war. In this version of war " +
                "you will each draw three cards and whoever has the most points in total gets all 6 points. In this" +
                " version of war when you run out of cards whoever has the most points by then wins.");
    }

}