public class War {

 public static void main(String[] args) {
  // create deck, hands and stacks
  CardDeck cd=new CardDeck();
  CardList p1=new CardList();
  CardList p2=new CardList();
  CardList s1=new CardList();
  CardList s2=new CardList();
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
  a=p1.takeCardFromTop();
  s1.addCardToTop(a);
  b=p2.takeCardFromTop();
  s2.addCardToTop(b);
  System.out.println(a.toString()+" : "+b.toString());
  int x=a.compareTo(b);
  if(x>1)
  {
   p1.addCardToBottom(a);
   p1.addCardToBottom(b);
  }
  else if(x<1)
  {
    p2.addCardToBottom(a);
    p2.addCardToBottom(b);
  }
  else
  {
    Card one;
    Card two;
    Card three;
    Card four;
    Card five;
    Card six;
    System.out.println(p1.getSize()+" --- WAR --- "+p2.getSize());
    one=p1.removeCardFromTop();
    two=p1.removeCardFromTop();
    three=p1.removeCardFromTop();
    four=p2.removeCardFromTop();
    five=p2.removeCardFromTop();
    six=p2.removeCardFromTop();
    
    
    
    
    
  

 }
}
}
