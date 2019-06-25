package io.motolola.algorithm.searching;

/**
 * Created by Akinjide Motolola.
 * email: motolola@icloud.com
 * Basically, a simple algorithm to search for
 * index of a number in a given array.
 */
public class LinearSearch
{
    public static void main(String[] args)
    {
        int arr[] = {2,4,5,7,9,13,26,18};
        System.out.println(findIndex(5, arr));
    }

    private static int findIndex(int num, int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (num == arr[i])
            {
                return i;

            }
        }
        return -1;
    }
}
