import java.util.*;

/**
 * @author Daniel Yang
 * 
 * What We currently need to code now
 * 	Bidding System
 * 	Trading System
 * 	Housing Creating and upgrading System
 * 	Reading cards and implement their effects(Such as chance, community chests, and special properties in group -1 monopoly groups
 *
 */
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
		while(Players.size() >= 2)
		{
			Dice.rerollDice();
			Player tempPlayer = (Player) Players.poll();
			System.out.println("It is now Player " + tempPlayer.DisplayName() + "'s turn");
			if(tempPlayer.returnBankrupt())
			{
				System.out.println("Player " + tempPlayer.DisplayName() + " Is already out of the Game");
				continue;
			}
			System.out.println("You move: " + Dice.total() + " Spaces.");
			if((tempPlayer.getPosition() + Dice.total()) >= 40)
			{
				tempPlayer.setPosition((tempPlayer.getPosition() + Dice.total()) - 40);
				tempPlayer.addCash(200);
			}
			tempPlayer.movePlayer(Dice.total());
			int playerPosition = tempPlayer.getPosition();
			Property tempProperty = Anime.getProp(playerPosition);
			System.out.println("You have landed on: " + tempProperty.name());
			System.out.println("Your Cash is: " + tempPlayer.DisplayCash());
			System.out.println("The Property Costs: " + tempProperty.cost());
			if(tempProperty.MonopolyGroup() == -1)
			{
				System.out.println("You have landed on " + tempProperty.name());
				Players.add(tempPlayer);
				continue;
			}
			if(tempProperty.available())
			{
				System.out.println("Bid or Buy?");		
				String BidBuy = a.nextLine();
				if(BidBuy.equals("Buy")) //Need to make it a button instead of string inputs in the future
				{
					if(tempPlayer.DisplayCash() >= tempProperty.cost())
					{
						System.out.println("You have now bought " + tempProperty.name());
						tempPlayer.takeCash(tempProperty.cost());
						tempProperty.changeAvailable();
						tempProperty.modifyOwnership(tempPlayer);
						tempPlayer.addProperty(tempProperty);
					}
					else
					{
						System.out.println("Insufficient Funds");
						tempPlayer.editBankrupt();
						System.out.println("Player " + tempPlayer.DisplayName() + " is now out of the game");
						playerAmount--;
						//tempProperty.bid(playerAmount);
					}
				}
				if(BidBuy.equals("Bid"))
				{
					System.out.println("You have bid");
					//tempProperty.bid(playerAmount);
				}
			}
			else
			{
				System.out.println("Property " + tempProperty.name() + " is already owned by another player------------------------------------");
				if(tempPlayer.DisplayCash() < tempProperty.cost())
				{
					tempPlayer.editBankrupt();
					System.out.println("Player " + tempPlayer.DisplayName() + " is now out of the game");
					playerAmount--;
				}
				else
				{
					tempPlayer.takeCash(tempProperty.cost());
					System.out.println("Player " + tempPlayer.DisplayName() + " has lost " + tempProperty.cost());
					System.out.println("Player " + tempPlayer.DisplayName() + " now has $" + tempPlayer.DisplayCash());
				}
			}
			System.out.println("What is your next action?");
			String input = a.nextLine();
			if(input.equals("house"))
			{
				
			}
			//Add trading System, add Creating and upgrading house system,
			Players.add(tempPlayer);
		}
		System.out.println("END OF GAME, Winner of the game is " + Players);
		a.close();
	}
}
