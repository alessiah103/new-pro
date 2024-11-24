import java.util.Scanner;

public class Game
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    Die dice = new Die(6);
    System.out.println("How many players are playing?");
    int numberOfPlayers = keyboard.nextInt();
    keyboard.nextLine();

    Player[] players = new Player[numberOfPlayers];

    for (int i = 0; i < players.length; i++)
    {
      System.out.println("What is the name of " + (i + 1) + " player?");
      String name = keyboard.nextLine();

      Player player = new Player(name);
      players[i] = player;
    }

    boolean aPlayerHasWon = false;
    while (!aPlayerHasWon)
    {
      for (int i = 0; i < players.length; i++)
      {
        Player player = players[i];

        System.out.println(player.getName() + " is playing");
        dice.roll();
        int valueRolled = dice.getValue();
        System.out.println(player.getName() + " has rolled " + valueRolled);
        player.subtractPoints(valueRolled);
        System.out.println("Now " + player.getName() + " has " + player.getPoints() + " remained.");

        if (player.getPoints() < 1)
        {
          System.out.println(
              player.getName() + " has " + player.getPoints()
                  + " points, which is less than 1.");
          player.setPoints(Math.abs(player.getPoints()));
          System.out.println("Player " + player.getName() + " has now "
              + player.getPoints());
        }

        if (player.getPoints() == 1)
        {
          System.out.println(player.getName() + " has won.");
          aPlayerHasWon = true;
          break;
        }
      }

    }
  }
}
