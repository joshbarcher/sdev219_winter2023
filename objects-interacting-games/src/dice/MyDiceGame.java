package dice;

import objects.Dice;
import objects.Player;

public class MyDiceGame
{
    private int numRounds;
    private Player player1;
    private Player player2;

    public MyDiceGame(int numRounds, Player player1, Player player2)
    {
        this.numRounds = numRounds;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void introduceGame()
    {
        System.out.println("Welcome to my dice game!");
        System.out.println("We will play for " + numRounds + " rounds!");
        System.out.println();
    }

    public void playGame()
    {
        //assign dice
        Dice dice1 = new Dice(6, "red");
        Dice dice2 = new Dice(6, "blue");

        System.out.println("Player 1 assigned " + dice1.getColor() + " dice");
        System.out.println("Player 2 assigned " + dice2.getColor() + " dice");
        System.out.println();

        //play for a number of rounds
        for (int i = 1; i <= numRounds; i++)
        {
            System.out.println("Round #" + i);

            //roll both dice
            int roll1 = dice1.roll();
            int roll2 = dice2.roll();

            System.out.println("Player1 rolled a " + roll1);
            System.out.println("Player2 rolled a " + roll2);

            //award points
            if (roll1 > roll2)
            {
                System.out.println("Player 1 scores!");
                int currentScore = player1.getScore();
                currentScore += 5;
                player1.setScore(currentScore);
            }
            else if (roll2 > roll1)
            {
                System.out.println("Player 2 scores!");
                player2.setScore(player2.getScore() + 5);
            }
            else
            {
                System.out.println("Tie!");
                player1.setScore(player1.getScore() + 2);
                player2.setScore(player2.getScore() + 2);
            }

            //print out the current scores
            System.out.println("Player1 score " + player1.getScore());
            System.out.println("Player2 score " + player2.getScore());
            System.out.println();
        }
    }

    public void declareWinner()
    {
        if (player1.getScore() > player2.getScore())
        {
            System.out.println(player1.getPlayerName() + " wins!");
        }
        else if (player2.getScore() > player1.getScore())
        {
            System.out.println(player2.getPlayerName() + " wins!");
        }
        else
        {
            System.out.println("The game was a tie!");
        }
    }

    //getters...

    //toString()...
}
