
public class Player 
{
	private int cash;
	private String name;
	private boolean isBankrupt;
	private boolean isJail;
	public Player(String n, int startcash)
	{
		name = n;
		cash = startcash;
		isBankrupt = false;
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
		return ("{Name: " + name + ", Cash: " + cash + "}");
	}
}
