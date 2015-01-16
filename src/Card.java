// Complete Class card by extending abstract Class PlayingCard and implementing the Comparable interface
public class Card extends PlayingCard implements Comparable<Card>
{
  public Card(int suit, int rank)
  {
    super(suit, rank);
  }
  public String toString()
  {
   if (this.getSuit()==1)
   {
     return this.getRank()+"-"+"H";
   }
   else if (this.getSuit()==2)
   {
     return this.getRank()+"-"+"C";
   }
   else if (this.getSuit()==3)
   {
     return this.getRank()+"-"+"S";
   }
   else
   {
     return this.getRank()+"-"+"D";
   }
     
   }
  public int compareTo(Card other)
  {
    return this.getRank()-other.getRank();
  }
}


