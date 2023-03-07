package recursion;

public class IntermediateRecursion
{
    public static void main(String[] args)
    {
        IntermediateRecursion program = new IntermediateRecursion();

        int result = program.sum(4); //1 + 2 + 3 + 4 = 10
        System.out.println("sum(4) = " + result);
        result = program.sum(5); //1 + 2 + 3 + 4 + 5 = 15
        System.out.println("sum(5) = " + result);
        result = program.sum(6); //1 + 2 + 3 + 4 + 5 + 6 = 21
        System.out.println("sum(6) = " + result);
        System.out.println();

        result = program.powerOf3(2);
        System.out.println("3^2 = " + result); //9
        result = program.powerOf3(3);
        System.out.println("3^3 = " + result); //27
        result = program.powerOf3(4);
        System.out.println("3^4 = " + result); //81
        System.out.println();

        result = program.power(2, 8);
        System.out.println("2^8 = " + result); //256
    }

    public int power(int base, int exp)
    {
        if (exp < 0)
        {
            throw new IllegalStateException("This method does not support negative exponents");
        }

        //base case
        if (exp == 0)
        {
            return 1;
        }
        else
        {
            return power(base, exp - 1) * base;
        }
    }

    public int powerOf3(int exp)
    {
        if (exp < 0)
        {
            throw new IllegalStateException("This method does not support negative exponents");
        }

        //base case
        if (exp == 0)
        {
            return 1;
        }
        else
        {
            return powerOf3(exp - 1) * 3;
        }
    }

    public int iterativeSum(int num)
    {
        int total = 0;
        for (int i = 1; i <= num; i++)
        {
            total += i;
        }
        return total;
    }

    public int sum(int num)
    {
        if (num <= 0)
        {
            throw new ArithmeticException("Only positive nums allowed");
        }

        //base case
        if (num == 1)
        {
            return 1;
        }
        else
        {
            return sum(num - 1) + num;
        }
    }
}
