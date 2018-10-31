import java.util.ArrayList;
import java.util.Scanner;
import java.util.Queue;
import java.util.Stack;

// player A makes trades
// player B sets what they give in return
// player A accepts or doesn't accept.
// Goes on forevro untill acceptance
public class Trade {
  private ArrayList<Property> properties;
  private int money;
  private Player from;
  private Player to;

  public Trade(Player from, Player to) {
    this.from = from;
    this.to = to;
  }

  public static void main (String[] args)
	{
    Player a = new Player("yeet", 100);
    Player b = new Player("skeet", 500);

    Trade.trade(a, b);
  }
  
  public static void prompt(Player a, String message) {
    System.out.println(a.DisplayName() + ": " + message);
  }

  public static void trade(Player a, Player b) {
    Scanner sc = new Scanner(System.in);

    String playerAName = a.DisplayName();
    String playerBName = b.DisplayName();

    ArrayList<Integer> playerACashTrades = new ArrayList<Integer>();
    ArrayList<Integer> playerAPropertyTrades = new ArrayList<Integer>();
    ArrayList<Integer> playerBCashTrades = new ArrayList<Integer>();
    ArrayList<Integer> playerBPropertyTrades = new ArrayList<Integer>();

    String exitString;
    do {
      prompt(a, "Would you like to trade money [M] or property [P]?");
      String response = sc.nextLine();
      if (response.equals("M")) {
        System.out.print("Enter a monetary value: ");
        playerACashTrades.add(Integer.parseInt(sc.nextLine()));
      } else if (response.equals("P")) {
        System.out.print("Enter a property index: ");
        playerACashTrades.add(Integer.parseInt(sc.nextLine()));
      }
  
      prompt(a, "Are you finished? Press enter to skip and 'finished' to finish.");
      exitString = sc.nextLine();
    } while (!exitString.equals("finished"));

    do {
      for (int playerACashTrade : playerACashTrades) {
        prompt(b, String.format("Would you like to trade money [M] or property [P] for $%d?", playerACashTrade));
        String response = sc.nextLine();
        if (response.equals("M")) {
          prompt(b, "Enter a monetary value: ");
          playerBCashTrades.add(Integer.parseInt(sc.nextLine()));
        } else if (response.equals("P")) {
          prompt(b, "Enter a property index: ");
          playerBPropertyTrades.add(Integer.parseInt(sc.nextLine()));
        }
      }

      for (int playerAPropertyTrade : playerAPropertyTrades) {
        prompt(b, String.format("Would you like to trade money [M] or property [P] for Property #%d?", playerAPropertyTrade));
        String response = sc.nextLine();
        if (response.equals("M")) {
          prompt(b, "Enter a monetary value: ");
          playerBCashTrades.add(Integer.parseInt(sc.nextLine()));
        } else if (response.equals("P")) {
          prompt(b, "Enter a property index: ");
          playerBPropertyTrades.add(Integer.parseInt(sc.nextLine()));
        }
      }

      for (int i = 0; i < playerBCashTrades.size(); ++i) {
        int playerACashTrade = playerACashTrades.get(i);
        int playerBCashTrade = playerBCashTrades.get(i);

        prompt(a, String.format("Would you like to trade your %d for %d? [Y/n]", playerACashTrade, playerBCashTrade));
        String response = sc.nextLine();
        if (response.equals("Y")) {
          playerACashTrades.remove(i);
          playerBCashTrades.remove(i);
          prompt(a, String.format("Traded your %d for %d", playerACashTrade, playerBCashTrade));
          a.takeCash(playerACashTrade);
          b.addCash(playerACashTrade);
          b.takeCash(playerBCashTrade);
          --i;
        } else {
          prompt(a, String.format("Would you like to trade money [M] or property [P] for #%d?", playerACashTrade));
          response = sc.nextLine();
          if (response.equals("M")) {
            prompt(a, "Enter a monetary value: ");
            playerACashTrades.set(i, Integer.parseInt(sc.nextLine()));
          } else if (response.equals("P")) {
            prompt(a, "Enter a property index: ");
            playerAPropertyTrades.set(i, Integer.parseInt(sc.nextLine()));
          }
        }
      }
    } while (!playerACashTrades.isEmpty() && !playerAPropertyTrades.isEmpty());
  }
}