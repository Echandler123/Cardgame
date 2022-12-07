import java.util.ArrayList;

public class Player
{
    private String name;
    private ArrayList<card> hand = new ArrayList<card>();
    private int points;
    Player(String name)
    {
        this.name = name;
        points = 0;
    }
    Player(String name, ArrayList<card> hand)
    {
        this.name = name;
        points = 0;
        this.hand = hand;
    }
}
