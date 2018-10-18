
public class Card 
{
	private String name;
	private String Text;
	private int value;
	public Card(String n, String t, int val)
	{
		name = n;
		Text = t;
		value = val;
	}
	public String getName()
	{
		return name;
	}
	public String getText()
	{
		return Text;
	}
	public int getValue()
	{
		return value;
	}
}
