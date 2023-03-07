package recursion;

public class SimpleRecursion
{
    private int methodCount;

    public static void main(String[] args)
    {
        SimpleRecursion program = new SimpleRecursion();

        //start "recursing"
        String[] words = {"Circumlocution", "Percolate", "Extraneous", "Onomatopoeia", "Panegyrize", "Overmorrow"};
        program.printArray(words);
    }

    //regular method
    private void printArray(String[] words)
    {
        printArray(words, 0);
    }

    //recursive method
    private void printArray(String[] words, int currentIndex)
    {
        //base case
        if (currentIndex < 0 || currentIndex >= words.length)
        {
            return; //exit!
        }
        else
        {
            //print out the array element at the current position
            System.out.println(words[currentIndex]);

            //recurse and move towards our base case
            currentIndex++;
            printArray(words, currentIndex);
        }
    }

    //regular method
    private void blastOff()
    {
        blastOff(10);
    }

    //recursive method
    private void blastOff(int step)
    {
        //base case
        if (step == 0)
        {
            System.out.println("Blast-off!");
        }
        else //recursive case
        {
            System.out.println(step);
            blastOff(step - 1);
        }
    }

    private void printDown(int num)
    {
        //base case
        if (num == 1)
        {
            System.out.println(num);
        }
        else
        {
            printDown(num - 1);
            System.out.println(num);
        }
    }

    private void doSomething()
    {
        methodCount++;
        System.out.println("Method Call #" + methodCount);

        //this is a recursive call
        doSomething();
    }
}

