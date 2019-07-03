package io.motolola.algorithm.random;

/**
 * Created by Akinjide Motolola.
 * email: motolola@icloud.com
 */
public class MyString
{
    public static void main(String[] args)
    {
        String str = "boy";
        System.out.println(reverseIteration(str));
    }

    private static String reverseIteration(final String str)
    {
        StringBuilder revStr = new StringBuilder();
        char[] strArr = str.toCharArray();

        for (int i = strArr.length-1; i >= 0; i--)
        {
            revStr.append(strArr[i]);
        }
        return revStr.toString();
    }
}
