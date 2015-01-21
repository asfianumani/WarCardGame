

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
  for(int count=1; count<=cd.getSize(); count++)
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
  while(s1.getCard(0).compareTo(s2.getCard(0))==0)
  {
   System.out.println(p1.getSize()+" --- WAR --- "+p2.getSize());
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
                 
   else if(p1.getCard(0).compareTo(p2.getCard(0))<0)
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
    round++;
  }
     
  if(s1.getCard(0).compareTo(s2.getCard(0))>0)
  {
   p1.addCardToBottom(s1.getCard(0));
   p1.addCardToBottom(s2.getCard(0));
   s1.takeCardFromTop();
   s2.takeCardFromTop();
  }
  else if(s1.getCard(0).compareTo(s2.getCard(0))<0)
  {
    p2.addCardToBottom(s1.getCard(0));
    p2.addCardToBottom(s2.getCard(0));
    s1.takeCardFromTop();
    s2.takeCardFromTop();
  }
  }
  if(p1.getSize()==0)
  {
    System.out.println("Player B wins");
  }
  else
  {
    System.out.println("Player A wins");
  }
  System.out.println("rounds:"+round);
}
  
 }

