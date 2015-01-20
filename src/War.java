

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
  Card c1;
  Card c2;
  for(int count=1; count<=cd.getSize(); count++)
  {
    c1=cd.takeCardFromTop();
    p1.addCardToBottom(c1);
    c2=cd.takeCardFromTop();
    p2.addCardToBottom(c2);
  }
  
  // play
  System.out.println("A --- player --- B");
  Card a;
  Card b;
  int round=1;
  while(p1.getSize()>0 && p2.getSize()>0)
  {
  System.out.println(p1.getSize()+" --- round "+round+" --- "+p2.getSize());
  a=p1.getCard(0);
  p1.takeCardFromTop();
  s1.addCardToTop(a);
  b=p2.getCard(0);
  p2.takeCardFromTop();
  s2.addCardToTop(b);
  System.out.println(a.toString()+" : "+b.toString()); 
  while(s1.getCard(0).compareTo(s2.getCard(0))==0)
  {
    System.out.println(p1.getSize()+" --- WAR --- "+p2.getSize());
      Card c=p1.getCard(0);
      s1.addCardToTop(c);
      p1.takeCardFromTop();
      Card ca=p2.getCard(0);
      s2.addCardToTop(ca);
     p2.takeCardFromTop();
     while(p1.getSize()>1 && p2.getSize()>1)
     {
  if(p1.getCard(0).compareTo(p2.getCard(0))>0)
  {
   p1.addCardToBottom(s1.getCard(0));
   p1.addCardToBottom(s2.getCard(0));
   s1.takeCardFromTop();
   s2.takeCardFromTop();
   p1.addCardToBottom(p2.getCard(0));
   p1.addCardToBottom(p1.getCard(0));
   p1.takeCardFromTop();                   
   p2.takeCardFromTop();
   }
                 
    else if(s1.getCard(0).compareTo(s2.getCard(0))<0)
    {
    p2.addCardToBottom(s1.getCard(0));
   p2.addCardToBottom(s2.getCard(0));
   s1.takeCardFromTop();
   s2.takeCardFromTop();
   p2.addCardToBottom(p1.getCard(0));
   p2.addCardToBottom(p2.getCard(0));
   p2.takeCardFromTop();
   p1.takeCardFromTop();
    }
     }
    if (p1.getSize()<1)
    {
      p2.addCardToBottom(p1.getCard(0));
      p1.takeCardFromTop();
     }
    else
    {
      p1.addCardToBottom(p2.getCard(0));
      p2.takeCardFromTop();
    }
  }
     
  if(s1.getCard(0).compareTo(s2.getCard(0))>0)
  {
    s1.takeCardFromTop();
   s2.takeCardFromTop();
   p1.addCardToBottom(a);
   p1.addCardToBottom(b);
  }
  else if(s1.getCard(0).compareTo(s2.getCard(0))<0)
  {
    s1.takeCardFromTop();
    s2.takeCardFromTop();
    p2.addCardToBottom(a);
    p2.addCardToBottom(b);
  }
  }
}
  
 }

