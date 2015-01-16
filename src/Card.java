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
    if(this.getRank()==10)
    {
      return "H-T";
    }
    else if (this.getRank()==11)
    {
      return "H-J";
    }
    else if(this.getRank()==12)
    {
      return "H-Q";
    }
    else if(this.getRank()==13)
    {
      return "H-K";
    }
    else
    {
      return "H-"+this.getRank();
    }
   }
     if (this.getSuit()==2)
   {
    if(this.getRank()==10)
    {
      return "C-T";
    }
    else if (this.getRank()==11)
    {
      return "C-J";
    }
    else if(this.getRank()==12)
    {
      return "C-Q";
    }
    else if(this.getRank()==13)
    {
      return "C-K";
    }
    else
    {
      return "C-"+this.getRank();
    }
     }
     if (this.getSuit()==3)
   {
    if(this.getRank()==10)
    {
      return "S-T";
    }
    else if (this.getRank()==11)
    {
      return "S-J";
    }
    else if(this.getRank()==12)
    {
      return "S-Q";
    }
    else if(this.getRank()==13)
    {
      return "S-K";
    }
    else
    {
      return "S-"+this.getRank();
    }
     }
    else
   {
    if(this.getRank()==10)
    {
      return "D-T";
    }
    else if (this.getRank()==11)
    {
      return "D-J";
    }
    else if(this.getRank()==12)
    {
      return "D-Q";
    }
    else if(this.getRank()==13)
    {
      return "D-K";
    }
    else
    {
      return "D-"+this.getRank();
    }
     }
     
   }
  public int compareTo(Card other)
  {
    return this.getRank()-other.getRank();
  }
}


