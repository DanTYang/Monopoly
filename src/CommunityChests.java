import java.util.Queue;
import java.util.LinkedList;
public class CommunityChests 
{
	private Queue<Card> deck;
	public CommunityChests()
	{
		deck = new LinkedList<>();
		insertCards();
	}
	public void insertCards()
	{
		Card a = new Card("Advance to Go", "Adance to Go and collect $200", 1);
		Card b = new Card("Bank error", "Get $200", 2);
		Card c = new Card("Doctor's fee", "Lose $50", 3);
		Card d = new Card("From sale of stock", "Get $50", 4);
		Card e = new Card("Get Out of jail Free", "Get out of Jail, Free", 5);
		Card f = new Card("Go to Jail", "Go directly to Jail, do not pass Go, Do not collect $200", 6);
		Card g = new Card("Grand Opera Night", "Get $50/person", 7);
		Card h = new Card("Holiday Fund matures", "Get $100", 8);
		Card i = new Card("Income tax refund", "Get $20",9);
		Card j = new Card("It's your birthday", "Get $10/person", 10);
		Card k = new Card("Life insurance matures", "Get $100", 11);
		Card l = new Card("Hospital Fees", "Lose 50", 12);
		Card m = new Card("School fees", "Lose $50", 13);
		Card n = new Card("Consultancy fee", "get $25", 14);
		Card o = new Card("You are assessed for street repairs", " Pay $40 per house and $115 per hotel you own", 15);
		Card p = new Card("You have won second price in a beauty contest", "Get $10", 16);
		Card q = new Card("You inherit Money", "Get $100", 17);
		deck.add(a);
		deck.add(b);
		deck.add(c);
		deck.add(d);
		deck.add(e);
		deck.add(f);
		deck.add(g);
		deck.add(h);
		deck.add(i);
		deck.add(j);
		deck.add(k);
		deck.add(l);
		deck.add(m);
		deck.add(n);
		deck.add(o);
		deck.add(p);
		deck.add(q);
	}
	public Card draw()
	{
		if(deck.isEmpty())
		{
			insertCards();
		}
		return deck.poll();
	}
}
