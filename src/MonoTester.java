
public class MonoTester 
{
	public static void main (String[] args)
	{
		DiceRoller a = new DiceRoller();
		System.out.println(a.diceA());
		System.out.println(a.diceB());
		System.out.println(a.total());
		a.rerollDice();
		System.out.println(a.diceA());
		System.out.println(a.diceB());
		System.out.println(a.total());
	}
}
