package io.motolola.algorithm.recursion;

import org.springframework.lang.NonNull;

import java.util.ArrayList;

/**
 * Created by Akinjide Motolola.
 * email: motolola@icloud.com
 * This is about finding the Greatest Common Divisor of two given numbers
 * The first solution in mind is the
 *    1. Find all the divisors of both numbers in different lists
 *    2. Collect the common Elements in one list and return the highest.
 * This is a long solution, but a solution ...
 * We will try this approach first.
 */
public class EuclideanGCD
{
    public static void main(String[] args)
    {
        int num1 = 120;
        int num2 = 18;

        ArrayList<Integer> factor1 = factors(num1);
        ArrayList<Integer> factor2 = factors(num2);

        int commonFactors = commonElements(factor1, factor2);
        System.out.println(commonFactors);
        System.out.println(euclideanSolution(num1, num2));
    }

    private static ArrayList<Integer> factors(@NonNull int number)
    {
        ArrayList<Integer> factors = new ArrayList<>();

        for (int i = 1; i <= number; i++)
        {
            if (number % i == 0)
            {
                factors.add(i);
            }
        }
        return factors;
    }

    private static int commonElements(@NonNull ArrayList<Integer> arr1, @NonNull ArrayList<Integer> arr2)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        for (Integer num : arr1)
        {
            if (arr2.contains(num))
            {
                arr.add(num);
            }
        }

        return arr.get(arr.size() - 1);
    }

    /*
     * Short Solutions to Euclidean Algorithm -
     * Finding Greatest Common Divisor ...
     */
    private static int euclideanSolution(@NonNull int num1, @NonNull int num2)
    {
        if (num1 == num2)
        {
            return num1;
        }

        if (num1 > num2)
        {
            num1 = num1 - num2;

            return euclideanSolution(num2, num1);

        } else
        {
            num2 = num2 - num1;
            return euclideanSolution(num1, num2);
        }
    }
}
