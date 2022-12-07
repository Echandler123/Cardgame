public class Card
{
    private int rank;
    private String suit;
    private int point;
    public Card(int rank, String suit, int point)
    {
        this.rank = rank;
        this.suit = suit;
        this.point = point;
    }

    public int getPoint()
    {
        return point;
    }

    public int getRank()
    {
        return rank;
    }

    public String getSuit()
    {
        return suit;
    }

    public void setRank(int rank)
    {
        this.rank = rank;
    }

    public void setPoint(int point)
    {
        this.point = point;
    }

    public void setSuit(String suit)
    {
        this.suit = suit;
    }
    public String toString()

    {
        return rank + "of" + suit;
    }
}
