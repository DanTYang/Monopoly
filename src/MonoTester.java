import java.util.*;

/**
 * @author Daniel Yang, Sam Olagun
 * 
 * What We currently need to code now
 * 	Trading System
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
			Player tempPlayer = (Player) Players.poll();
			System.out.println("It is now Player " + tempPlayer.DisplayName() + "'s turn");
			if(tempPlayer.returnBankrupt())
			{
				System.out.println("Player " + tempPlayer.DisplayName() + " Is already out of the Game");
				continue;
			}
			int rolled = Dice.total();
			System.out.println("You move: " + rolled + " Spaces.");
			if((tempPlayer.getPosition() + rolled) >= 40)
			{
				tempPlayer.setPosition((tempPlayer.getPosition() + Dice.total()) - 40);
				tempPlayer.addCash(200);
			}
			tempPlayer.movePlayer(rolled);
			int playerPosition = tempPlayer.getPosition();
			Property tempProperty = Anime.getProp(playerPosition);
			System.out.println("You have landed on: " + tempProperty.name());
			System.out.println("Your Cash is: " + tempPlayer.DisplayCash());
			System.out.println("The Property Costs: " + tempProperty.cost());
			if(tempProperty.MonopolyGroup() == -1)
			{
				System.out.println("You have landed on " + tempProperty.name());
				if (tempProperty.getPosition() == 0 || tempProperty.getPostion() == 10) { // Just visiting jail and GO
					break;
				}
				else if (tempProperty.getPosition() == 2 || tempProperty.getPosition() == 17 || tempProperty.getPosition() == 33) { // Community Chest
					CC.draw();
				}
				else if (tempProperty.getPosition() == 7 || tempProperty.getPosition() == 22 || tempProperty.getPosition() == 36) { // Chance
					ChanceDeck.draw();
				}
				else if (tempProperty.getPosition() == 38) { // Luxury tax
					tempPlayer.takeCash(100);
				}
				else if (tempProperty.getPosition() == 4) { // Income tax
					tempPlayer.takeCash(200);
				}
				else if (tempProperty.getPosition() == 20) { // Free karma/parking
					tempPlayer.addCash(cost);
				}
				else if (tempProperty.getPosition() == 30) { // go to jail
					tempPlayer.setPosition(10);
					tempPlayer.editJail();
				}
			}
			else if(tempProperty.available())
			{
				System.out.println("Bid or Buy?");		
				String BidBuy = a.nextLine();
				if(BidBuy.equals("Buy")) //Need to make it a button instead of string inputs in the future
				{
					if(tempPlayer.DisplayCash() >= tempProperty.cost())
					{
						System.out.println("You have now bought " + tempProperty.name());
						tempPlayer.takeCash(tempProperty.cost());
						tempProperty.modifyOwnership(tempPlayer);
						tempPlayer.addProperty(tempProperty);
					}
					else
					{
						System.out.println("Insufficient Funds");
						System.out.println("You are now bidding");
						tempProperty.modifyOwnership(tempProperty.bid(Players, tempPlayer));
					}
				}
				if(BidBuy.equals("Bid"))
				{
					System.out.println("You are bid");
					tempProperty.modifyOwnership(tempProperty.bid(Players, tempPlayer));
				}
				System.out.println(Players);
			}
			else
			{
				System.out.println("Property " + tempProperty.name() + " is already owned by another player------------------------------------");
				if(tempPlayer.DisplayCash() < tempProperty.rent())
				{
					tempPlayer.editBankrupt();
					System.out.println("Player " + tempPlayer.DisplayName() + " is now out of the game");
					playerAmount--;
				}
				else
				{
					tempPlayer.takeCash(tempProperty.rent());
					System.out.println("Player " + tempPlayer.DisplayName() + " has lost " + tempProperty.rent());
					System.out.println("Player " + tempPlayer.DisplayName() + " now has $" + tempPlayer.DisplayCash());
				}
			}
			System.out.println("What is your next action?");
			String input = a.nextLine();
			while(!input.equals("Finished"))
			{
				if(input.equals("house"))
				{
					System.out.println("Which Property would You like to edit a housing? (Up to 5)");
					String property = a.nextLine();
					System.out.println("Would you like to add or remove");
					String Stringholder = a.nextLine();
					if(Stringholder.equals("add"))
					{
						tempPlayer.findProperty(property).addHouse();
					}
					else
					{
						tempPlayer.findProperty(property).removeHouse();
					}
				}
				System.out.println("What is your next action?");
				input = a.nextLine();
			}
			//Add trading System, add Creating and upgrading house system,
			Players.add(tempPlayer);
		}
		System.out.println("END OF GAME, Winner of the game is " + Players);
		a.close();
	}
}
