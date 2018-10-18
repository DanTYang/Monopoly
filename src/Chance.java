import java.util.Queue;
import java.util.LinkedList;
public class Chance
{
	private Queue<Card> deck;
	public Chance()
	{
		deck = new LinkedList<>();
		insertCards();
	}
	public void insertCards()
	{
		Card a = new Card("Advance to Go", "Adance to Go and collect $200", 18);
		Card b = new Card("Advance to Illinois Ave", "If you pass Go, Get $200", 19);
		Card c = new Card("Advance to St. Charles Place", "If you pass Go, get $200", 20);
		Card d = new Card("Advance token to nearest Utility", "If unowned, you may buy it from the bank. If owned, throw dice and pay owner a total 10 times the amount thrown", 21);
		Card e = new Card("Advance token to nearest Railroad", "If unowned, you may buy it from the Bank. If owned, pay owner twice the rental", 22);
		Card f = new Card("Bank pays you dividend", "Get $50", 23);
		Card g = new Card("Get ot of Jail Free", "Get out of Jail (may be traded or sold", 24);
		Card h = new Card("Go Back Three Spaces", "Go Back 3 Spaces", 25);
		Card i = new Card("Go to Jail", "Go directly to jail, Do not pass GO, do not collect $200",26);
		Card j = new Card("Make general repairs on Property", " Pay $25/house and $100/per hotel", 27);
		Card k = new Card("Pay poor tax", "Pay $15", 28);
		Card l = new Card("Take a trip to Reading RailRoad", "Go Directly to Reading Railroad. If you pass Go, collect $200", 29);
		Card m = new Card("Take a walk on Boardwalk", "Advance to BoardWalk", 30);
		Card n = new Card("You have been elected Chairman of the Board", "Pay $50/person", 31);
		Card o = new Card("Your building and loan Matures", "Collect $150", 32);
		Card p = new Card("You have won a crossword competition", "Get $100", 33);
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
	}
}
