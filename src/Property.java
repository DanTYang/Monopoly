import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Property 
{
	private int houses;
	private int cost;
	private String name;
	private int MonopolyGroup;
	private boolean isMonopoly;
	private boolean isMorgage;  
	private boolean isAvailable;
	private Player ownership;
	private int rent;
	public Property(String n, int G, int c, int r)
	{
		name = n;
		MonopolyGroup = G;
		houses = 0;
		cost = c;
		isMonopoly = false;
		isMorgage = false;
		isAvailable = true;
		ownership = null;
		rent = r;
	}
	public void removeHouse()
	{
		if(houses != 0)
		{
			rent /= 5;
			houses--;
		}
	}
	public Player bid(Queue Players, Player tempPlayerd)
	{
		Scanner yo = new Scanner(System.in);
		int biddingAmount = 0;
		Queue tempPlayers = new LinkedList();
		tempPlayers.add(tempPlayerd);
		Player temp = (Player) Players.peek();
		Player hold = (Player) Players.poll();
		tempPlayers.add(hold);
		Players.add(hold);
		while(!(Players.peek().equals(temp)))
		{
			hold = (Player) Players.poll();
			tempPlayers.add(hold);
			Players.add(hold);
		}
		System.out.println(tempPlayers);
		while(tempPlayers.size() > 1)
		{
			hold = (Player) tempPlayers.poll();
			System.out.println("Would " + hold.DisplayName() + " like to bid or quit?");
			String action = yo.nextLine();
			while(action.equals(""))
			{
				action = yo.nextLine();
			}
			System.out.println("action:" + action + "||");
			if(action.equals("bid"))
			{
				System.out.println("How Much would you like to bid?");
				int a = yo.nextInt();
				System.out.println(a);
				while((a <= 0 || a > hold.DisplayCash()) || a <= biddingAmount)
				{
					System.out.println("You cannot bid a negative, no amount, an amount you don't have, or an amount less than the current bid");
					System.out.println("How Much would you like to bid?");
					a = yo.nextInt();
				}
				biddingAmount = a;
				System.out.println("Bidding Amount is now " + biddingAmount);
			}
			else if(action.equals("quit"))
			{
				System.out.println(hold + " has quit bidding");
				continue;
			}
			tempPlayers.add(hold);
		}
		((Player) tempPlayers.peek()).takeCash(biddingAmount);
		System.out.println("Bidding has ended");
		return (Player) tempPlayers.poll();
	}
	public int position()
	{
		return position();
	}
	public int MonopolyGroup()
	{
		return MonopolyGroup;
	}
	public String name()
	{
		return name;
	}
	public int cost()
	{
		return cost;
	}
	public void modifyOwnership(Player a)
	{
		ownership = a;
		isAvailable = !isAvailable;
	}
	public Player ownership()
	{
		return ownership();
	}
	public void addHouse()
	{
		if(!(houses > 5))
		{
			houses++;
			rent *= 5;
		}
	}
	public int house()
	{
		return houses;
	}
	public boolean Monopoly()
	{
		return isMonopoly;
	}
	public boolean Morgage()
	{
		return isMorgage;
	}
	public boolean available()
	{
		return isAvailable;
	}
	public void changeMonopoly()
	{
		if(isMonopoly)
		{
			isMonopoly = false;
		}
		else
		{
			isMonopoly = true;
		}
	}
	public void changeMorgage()
	{
		if(isMorgage)
		{
			isMorgage = false;
		}
		else
		{
			isMorgage = true;
		}
	}
	public void changeAvailable()
	{
		if(isAvailable)
		{
			isAvailable = false;
		}
		else
		{
			isAvailable = true;
		}
	}
	public int rent()
	{
		return rent;
	}
	public String toString()
	{
		return name();
	}
	
}
