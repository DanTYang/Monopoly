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
