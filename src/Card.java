public class Card
{
    private String rank;
    private String suit;
    private int point;
    //Constructor for the card class takes in the value of the rank suit and point of the card the is being created
    public Card(String rank, String suit, int point)
    {
        this.rank = rank;
        this.suit = suit;
        this.point = point;
    }

    //method that returns the value of the point of this card
    public int getPoint()
    {
        return point;
    }
    //method that returns the value of the rank of this card
    public String getRank()
    {
        return rank;
    }
    //method that returns the suit of this card
    public String getSuit()
    {
        return suit;
    }
    //method that allows you to choose a rank to input for this card
    public void setRank(String rank)
    {
        this.rank = rank;
    }
    //method that allows you to choose a point to input for this card
    public void setPoint(int point)
    {
        this.point = point;
    }
    //method that allows you to choose a suit to input for this card
    public void setSuit(String suit)
    {
        this.suit = suit;
    }
    //method that prints out what the rank and suit of the card is
    public String toString()

    {
        return rank + "of" + suit;
    }
}
