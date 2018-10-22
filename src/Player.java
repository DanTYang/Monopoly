import java.util.*;
public class Player 
{
	private int cash;
	private String name;
	private boolean isBankrupt;
	private boolean isJail;
	private int Position;
	private ArrayList<Property> Ownerships;
	public Player(String n, int startcash)
	{
		name = n;
		cash = startcash;
		isBankrupt = false;
		Position = 0;
		Ownerships = new ArrayList<Property>();
	}
	public void addCash(int a)
	{
		cash += a;
	}
	public void takeCash(int a)
	{
		cash -= a;
	}
	public int DisplayCash()
	{
		return cash;
	}
	public String DisplayName()
	{
		return name;
	}
	public void editBankrupt()
	{
		if(isBankrupt)
		{
			isBankrupt = false;
		}
		else
		{
			isBankrupt = true;
		}
	}
	public boolean returnBankrupt()
	{
		return isBankrupt;
	}
	public void editJail()
	{
		if(isJail)
		{
			isJail = false;
		}
		else
		{
			isJail = true;
		}
	}
	public boolean returnJail()
	{
		return isJail;
	}
	public String toString()
	{
		return ("{Name: " + name + ", Cash: " + cash + ", Properties: " + Ownerships() + "}");
	}
	public void movePlayer(int b)
	{
		Position += b;
	}
	public void setPosition(int b)
	{
		Position = b;
	}
	public int getPosition()
	{
		return Position;
	}
	public void addProperty(Property a)
	{
		Ownerships.add(a);
	}
	public ArrayList<Property> Ownerships()
	{
		return Ownerships;
	}
}
