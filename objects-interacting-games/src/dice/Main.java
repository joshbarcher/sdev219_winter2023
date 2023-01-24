package dice;

import objects.Player;

public class Main
{
    public static void main(String[] args)
    {
        Player player1 = new Player("Jose");
        Player player2 = new Player("Susan");
        MyDiceGame game = new MyDiceGame(7, player1, player2);

        game.introduceGame();
        game.playGame();
        game.declareWinner();
    }
}