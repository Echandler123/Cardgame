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
    //constructor for the game that creates a new deck for the game and create 2 players the computer and the user
    public Game(String name) {
        this.name = name;
        one = new Deck(ranks, suits, values);
        E = new Player(name);
        C = new Player("Computer");
    }
    //this method
    public void playGame() {
        PrintInstructions();
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
            if (yourhand.get(k).getPoint()  > theirhand.get(k).getPoint())
            {
                E.addPoints(1);
            }
            if (yourhand.get(k).getPoint() < theirhand.get(k).getPoint()) {
                C.addPoints(1);
            }
            if(yourhand.get(k).getPoint()  == theirhand.get(k).getPoint()) {
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
    //this is the war method which takes in the players and their hands of cars and the index of where ot start in
    // their hands. This method adds takes 3 cards from each hand together to total points of each of the 3 cards. Once
    //if finds the total it compares the 2 totals to see who will win the war and whoever wins will get 6 points from
    //the three they used and the three from the opponent/computer
    public void war(Player E, Player C,ArrayList<Card> yourhand,ArrayList<Card> theirhand, int spot)
    {
        System.out.println("War!");
        int total = 0;
        int total2 = 0;
        for(int k = 0; k <=3; k++) {
            total += yourhand.get(k).getPoint();
            total2 +=  theirhand.get(k).getPoint();
        }
        if (total > total2 ) {
            E.addPoints(6);
            System.out.println(E.getName() + " wins the war!");
        }
        if (total2 > total) {
            C.addPoints(6);
            System.out.println(C.getName() + " wins the war!");
        }
        if (total2 == total) {
            System.out.println("The war was a tie!");
        }
    }
    //prints the instructions so the user knows how to play the game
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