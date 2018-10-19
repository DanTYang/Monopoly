
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
	public Property(String n, int G, int c)
	{
		name = n;
		MonopolyGroup = G;
		houses = 0;
		cost = c;
		isMonopoly = false;
		isMorgage = false;
		isAvailable = true;
		ownership = null;
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
		houses++;
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
	
}
