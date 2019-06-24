package io.motolola.algorithm.recursion;

import java.util.ArrayList;

/**
 * Created by Akinjide Motolola.
 * email: motolola@icloud.com
 * This is about finding the Greatest Common Divisor of two given numbers
 * The first solution in mind is the
 * 1. Find all the divisors of both numbers in different lists
 * 2. Collect the common Elements in one list and return the highest.
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

        ArrayList<Integer> commonFactors = commonElements(factor1, factor2);
        System.out.println(commonFactors.get(commonFactors.size() - 1));
    }

    private static ArrayList<Integer> factors(int number)
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

    private static ArrayList<Integer> commonElements(ArrayList<Integer> arr1, ArrayList<Integer> arr2)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        for (Integer num : arr1)
        {
            if (arr2.contains(num))
            {
                arr.add(num);
            }
        }

        return arr;
    }

}
