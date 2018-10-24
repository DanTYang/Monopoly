
public class DiceRoller 
{
	private int a;
	private int b;
	public DiceRoller()
	{
		a = (int)(Math.random() * 6) + 1;
		b = (int)(Math.random() * 6) + 1;
	}
	public int diceA()
	{
		rerollDice();
		return a;
	}
	public int diceB()
	{
		rerollDice();
		return b;
	}
	public int total()
	{
		rerollDice();
		return (a + b);
	}
	public void rerollDice()
	{
		a = (int)(Math.random() * 6) + 1;
		b = (int)(Math.random() * 6) + 1;
	}
}
