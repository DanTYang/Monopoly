import java.util.*;

public class MonoTester 
{
	public static void main (String[] args)
	{
		Scanner a = new Scanner(System.in);
		DiceRoller Dice = new DiceRoller();
		Chance ChanceDeck = new Chance();
		CommunityChests CC = new CommunityChests();
		Properties Anime = new Properties();
		Queue Players = new LinkedList();
		
		System.out.println("How Many Players?");
		int playerAmount = a.nextInt();
		System.out.println(playerAmount);
		
		for(int i = 1; i <= playerAmount; i++)
		{
			System.out.println("What is the name of Player " + i + "?");
			String name = a.nextLine();
			while((name.equals("")) ) 
			{
				System.out.println("Enter new name");
				name = a.nextLine();
			}
			Player newPlayer = new Player(name, 1400);
			Players.add(newPlayer);
		}
		System.out.println("-----------");
		//while(Players.size() > 2)
		{
			Dice.rerollDice();
			Player tempPlayer = (Player) Players.poll();
			tempPlayer.movePlayer(Dice.total());
			int playerPosition = tempPlayer.getPosition();
			Property tempProperty = Anime.getProp(playerPosition);
			if(tempProperty.available())
			{
				System.out.println("Bid or Buy?");		
				String BidBuy = a.nextLine();
			}
			
			Players.add(tempPlayer);
		}
		System.out.println(Players);
		System.out.println("Dice A: " + Dice.diceA() + " Dice B: " + Dice.diceB());
		a.close();
	}
}
