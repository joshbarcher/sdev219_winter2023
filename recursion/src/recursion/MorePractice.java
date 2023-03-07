package recursion;

public class MorePractice
{
    public static void main(String[] args)
    {
        MorePractice program = new MorePractice();
        System.out.println(program.multiply(7, 3)); //21
        System.out.println(program.multiply(9, 2)); //18
        System.out.println(program.multiply(2, 5)); //10

        System.out.println(program.checkParens("((()))"));
        System.out.println(program.checkParens("(((x7))"));
        System.out.println(program.checkParens("("));

        System.out.println(program.countHi("xhixxhix"));

        int[] fibNums = {0, 1, 2, 5, 10, 15, 20, 50, 100, 200};
        for (int i = 0; i < fibNums.length; i++)
        {
            int num = fibNums[i];
            System.out.println("fib(" + num + ") = " + program.fibonacci(num));
        }
    }

    private int fibonacci(int num)
    {
        if (num < 0)
        {
            throw new IllegalArgumentException("Negative fib numbers are not defined");
        }

        //base case
        if (num == 0 || num == 1)
        {
            return num;
        }
        else
        {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }

    private int countHi(String test)
    {
        if (test.length() < 2)
        {
            return 0;
        }
        else
        {
            String next = test.substring(0, 2); //this will give us the first two characters
            if (next.equals("hi"))
            {
                String remaining = test.substring(2);
                return countHi(remaining) + 1;
            }
            else
            {
                String remaining = test.substring(1); //move up one index
                return countHi(remaining);
            }
        }
    }

    private boolean checkParens(String testMe)
    {
        if (testMe.length() % 2 != 0)
        {
            return false;
        }

        if (testMe.equals(""))
        {
            return true; //balanced!
        }
        else
        {
            char first = testMe.charAt(0);
            char last = testMe.charAt(testMe.length() - 1);

            if (first == '(' && last == ')')
            {
                testMe = testMe.substring(1, testMe.length() - 1);
                return checkParens(testMe);
            }
            else
            {
                return false; //unbalanced!
            }
        }
    }

    //return x * n
    private int multiply(int x, int n)
    {
        //base case
        if (n == 0)
        {
            return 0;
        }
        else
        {
            //x * n = x * (n - 1) + x
            int result = multiply(x, n - 1) + x;
            return result;
        }
    }
}
