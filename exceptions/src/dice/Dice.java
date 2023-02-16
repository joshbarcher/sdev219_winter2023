package dice;

import java.util.Random;

public class Dice
{
    private Random random;
    private int sides;
    private String color;

    public Dice(int sides, String color)
    {
        this.sides = sides;
        this.color = color;
        random = new Random();
    }

    public int getSides()
    {
        return sides;
    }

    public String getColor()
    {
        return color;
    }

    public int roll()
    {
        return random.nextInt(sides) + 1;
    }

    /**
     * Rolls the dice a number of times and returns all results
     * @param times a positive number of dice rolls
     * @throws RuntimeException if the number of rolls is non-positive
     * @return an array of roll results
     */
    public int[] rollMany(int times) throws Exception
    {
        //check for bad inputs and throw an "error"
        if (times <= 0)
        {
            throw new Exception(
                "The number of rolls must be positive");
        }

        int[] rollsHistory = new int[times];
        for (int i = 0; i <= times - 1; i++)
        {
            rollsHistory[i] = roll();
        }
        return rollsHistory;
    }

    @Override
    public String toString()
    {
        return "A " + sides + " sided die";
    }
}