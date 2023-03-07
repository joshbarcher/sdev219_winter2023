import java.awt.*;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList listOfNums = new ArrayList();

        for (int i = 1; i <= 1000000; i++)
        {
            listOfNums.add(Math.random());
        }

        System.out.println("Num elements is " + listOfNums.size());

        //loop over a few of elements
        for (int i = 0; i < listOfNums.size(); i++)
        {
            System.out.println(listOfNums.get(i));
        }

        /*for (int i = 0; i < listOfNums.length; i++)
        {
            System.out.println(listOfNums[i]);
        }*/

        /*listOfNums.add(10);
        listOfNums.add("Hello");
        listOfNums.add(true);
        listOfNums.add(new Color(99, 187, 106));*/
    }
}