package program;

import dice.Dice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        /*Scanner reader = new Scanner(new FileInputStream("file.txt"));*/

        try
        {
            Scanner console = new Scanner(System.in);
            System.out.println("Enter a positive number");
            int numTimes = console.nextInt();

            Dice crapsDie = new Dice(6, "red");
            int[] results = crapsDie.rollMany(numTimes);

            //print out the results
            System.out.println("All done rolling dice");
            System.out.println(Arrays.toString(results));
        }
        catch (InputMismatchException | IllegalStateException ex) //if there is an inputmismatch or illegal state
        {
            System.out.println("There was a problem with the scanner");
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}

