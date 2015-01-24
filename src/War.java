

 

public class War {
  
  public static void main(String[] args) {
    // create deck, hands and stacks
    CardDeck cd=new CardDeck();
    CardList p1=new CardList();
    CardList p2=new CardList();
    CardList s1=new CardList();
    CardList s2=new CardList();
    
    cd.Shuffle();
    
    // deal the cards
    for(int count=1; count<=26; count++)
    {
      p1.addCardToBottom(cd.getCard(0));
      cd.takeCardFromTop();
      p2.addCardToBottom(cd.getCard(0));
      cd.takeCardFromTop();
    }
    
    
    // play
    System.out.println("A --- player --- B");
    int round=1;
    while(p1.getSize()>0 && p2.getSize()>0)
    {
      System.out.println(p1.getSize()+" -- round "+round+" -- "+p2.getSize());
      s1.addCardToTop(p1.getCard(0));
      p1.takeCardFromTop();
      s2.addCardToTop(p2.getCard(0));
      p2.takeCardFromTop();
      System.out.println("    "+s1.getCard(0).toString()+" : "+s2.getCard(0).toString()+"    "); 
      while(s1.getSize()>0 && s2.getSize()>0 && s1.getCard(0).compareTo(s2.getCard(0))==0)
      {
        System.out.println(p1.getSize()+" --- WAR --- "+p2.getSize());
        System.out.println("    "+s1.getCard(0).toString()+" : "+s2.getCard(0).toString()+"    ");
        if (p1.getSize()<2)
        {
          for(int i=0; i<s1.getSize(); i++)
          {
          p2.addCardToBottom(s1.getCard(i));
          s1.takeCardFromTop();
          p2.addCardToBottom(s2.getCard(i));
          s2.takeCardFromTop();
          }
          if(p1.getSize()>0)
          {
            p2.addCardToTop(p1.getCard(0));
            p1.takeCardFromTop();
          }
          break;
        }
        else if(p2.getSize()<2)
        {
          for(int i=0; i<s1.getSize(); i++)
          {
          p1.addCardToBottom(s1.getCard(i));
          s1.takeCardFromTop();
          p1.addCardToBottom(s2.getCard(i));
          s2.takeCardFromTop();
          }
          if(p2.getSize()>0)
          {
            p1.addCardToTop(p2.getCard(0));
            p2.takeCardFromTop();
          }
          break;
        }
          else
          {
          s1.addCardToTop(p1.getCard(0));
          s1.addCardToTop(p1.getCard(1));
          p1.takeCardFromTop();
          p1.takeCardFromTop();
          s2.addCardToTop(p2.getCard(0));
          s2.addCardToTop(p2.getCard(1));
          p2.takeCardFromTop();
          p2.takeCardFromTop();
          }
        } 
      
      if(s1.getCard(0).compareTo(s2.getCard(0))>0)
      {
        int x=s2.getSize();
        for(int i=0; i<x; i++)
        {
        Card one=s1.takeCardFromTop();
        Card two=s2.takeCardFromTop();
        p1.addCardToBottom(one);
        p1.addCardToBottom(two);
        }
      }
      else if(s1.getCard(0).compareTo(s2.getCard(0))<0)
      {
        int x=s1.getSize();
        for(int i=0; i<x; i++)
        {
        Card one=s1.takeCardFromTop();
        Card two=s2.takeCardFromTop();
        p2.addCardToBottom(one);
        p2.addCardToBottom(two);
        }
      }
      round++;
    }
    if(p1.getSize()==0)
    {
      System.out.println("Player B wins");
    }
    else
    {
      System.out.println("Player A wins");
    }
    System.out.println("rounds:"+(round-1));
  }
}
