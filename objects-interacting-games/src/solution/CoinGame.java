package solution;

import objects.Coin;
import objects.Player;

import java.util.Scanner;

public class CoinGame
{
    private Player player;
    private Coin coin;

    public CoinGame(Player player,
                    Coin coin)
    {
        this.player = player;
        this.coin = coin;
    }

    public void welcomeMessage()
    {
        System.out.println("Welcome to my coin game!");
        System.out.println("************************");
        System.out.println();
    }

    public void playGame()
    {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 5; i++)
        {
            System.out.println("Player - Guess the side of your coin");
            String side = scanner.nextLine();

            System.out.println("Flipping coin!");
            coin.flip();

            if (coin.getSideUp().equalsIgnoreCase(side))
            {
                System.out.println("Correct! Player gains 3 points!");
                player.setScore(player.getScore() + 3);
            }
            else
            {
                System.out.println("Incorrect! " + side + " not equal to " + coin.getSideUp());
            }
        }
    }

    public void showResults()
    {
        System.out.println();
        System.out.println("Final score: " + player.getScore());

        if (player.getScore() > 10)
        {
            System.out.println("You win!");
        }
        else
        {
            System.out.println("You lose!");
        }
    }

    public static void main(String[] args)
    {
        CoinGame game = new CoinGame(
            new Player("P1"),
            new Coin("Quarter", "heads", "tails")
        );

        game.welcomeMessage();
        game.playGame();
        game.showResults();
    }
}
