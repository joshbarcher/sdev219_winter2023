package solution;

import objects.Dice;
import objects.Player;

import java.util.Scanner;

public class DiceGame
{
    public static void main(String[] args) {
        DiceGame game = new DiceGame();
        game.introduction();
        game.play();
    }

    private void introduction() {
        System.out.println("Welcome to my dice game");
        System.out.println("This is a 2-player game!");
    }

    private int getRounds() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of rounds");
        return scanner.nextInt();
    }

    private void play() {
        //game objects
        Player player1 = new Player("P1");
        Player player2 = new Player("P2");
        Dice dice1 = new Dice(6, "red");
        Dice dice2 = new Dice(6, "blue");

        int rounds = getRounds();

        //play the game
        for (int i = 1; i <= rounds; i++) {
            int roll1 = dice1.roll();
            int roll2 = dice2.roll();
            System.out.println("Player 1 rolls: " + roll1);
            System.out.println("Player 2 rolls: " + roll2);

            if (roll1 > roll2) {
                player1.setScore(player1.getScore() + 5);
                System.out.println("Player 1 wins, score: " + player1.getScore());
            }
            else if (roll2 > roll1) {
                player2.setScore(player2.getScore() + 5);
                System.out.println("Player 2 wins, score: " + player2.getScore());
            }
            else {
                player1.setScore(player1.getScore() + 2);
                player2.setScore(player2.getScore() + 2);
                System.out.println("Tie!");
                System.out.println("Player 1 score: " + player1.getScore());
                System.out.println("Player 2 score: " + player2.getScore());
            }
            System.out.println();
        }

        winner(player1, player2);
    }

    private void winner(Player player1, Player player2)
    {
        if (player1.getScore() > player2.getScore())
        {
            System.out.println("Player 1 wins!");
        }
        else if (player2.getScore() > player1.getScore())
        {
            System.out.println("Player 2 wins!");
        }
        else
        {
            System.out.println("Tie! There is no winner!");
        }
    }
}
