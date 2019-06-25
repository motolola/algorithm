package io.motolola.algorithm.searching;

/**
 * Created by Akinjide Motolola.
 * email: motolola@icloud.com
 * Search for an index of a number in a sorted array of numbers.
 */
public class BinarySearch
{
    public static void main(String[] args)
    {
        int arr[] = {2,4,5,7,8,10,12,14,16,17,19,21,25,26,18,31};
        System.out.println(find(0,arr.length-1, arr, 1666));
    }

    private static int find(int startIndex, int endIndex, int[] arr, int item)
    {
        if (startIndex > endIndex)
        {
            return -1;
        }
        int middleIndex = (startIndex + endIndex)/2;

        if (item == arr[middleIndex])
        {
            return middleIndex;
        }
        else if (item < arr[middleIndex])
        {
            return find(startIndex, middleIndex, arr, item);
        }
        else {
            return find(middleIndex + 1, endIndex, arr, item);
        }

    }
}
