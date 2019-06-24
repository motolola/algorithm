package io.motolola.algorithm.recursion;

/**
 * Created by Akinjide Motolola.
 * email: motolola@icloud.com
 */
public class Factorial
{
    public static void main(String[] args)
    {
        int number = 10;

        System.out.println(factorial(number));
        System.out.println(recursiveSum(3));
        System.out.println(sumOfOdds(7));
    }

    public static int factorial(final int number)
    {
        if (number == 0)
        {
            return 1;
        }

        int next = number - 1;

        return number * factorial(next);
    }

    /*
     *To add every integer down to 1 from a given number
     */
    public static int recursiveSum(final int number)
    {
        if (number == 0)
        {
            return 0;
        }
        return recursiveSum(number - 1) + number;
    }

    /**
     * This will return sum of all the odds less than a number.
     * @param number
     * @return
     */
    public static int sumOfOdds(int number)
    {
        if (number % 2 == 0) //Check for even number and reassign
        {
            number = number - 1;
        }

        if (number == 1)
        {
            return 1;
        }

        return number + sumOfOdds(number - 2);
    }
}
