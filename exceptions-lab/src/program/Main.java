package program;

import toys.MagicEightBall;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //ask the user for 5 messages
        Console console = new Console();
        String[] messages = console.getStrings("Enter a message", 5);
        int startingIndex = console.getInt("Enter a number in [0, 4]");

        //create the magic eight-ball and test it
        try
        {
            MagicEightBall ball = new MagicEightBall(messages, startingIndex);

            console.newLine();
            console.println("Shaking ball " + 5 + " times");
            console.println(Arrays.toString(ball.changeMessage(5)));
        }
        catch (NoSuchElementException ex)
        {
            System.out.println("Element missing");
        }
        catch (IllegalArgumentException ex)
        {
            System.out.println("Illegal Argument");
        }
        catch (IndexOutOfBoundsException ex)
        {
            System.out.println("Index out of bounds");
        }
    }
}

