import java.util.*;

public class PalindromeNum {
    public static void main (String[] args)
    {
        //Test case
        int x = 1002;

        String str = String.valueOf(x);
        char[] array = new char[str.length()];
        char[] newArray = new char[str.length()];
        for (int i = str.length() - 1; i >= 0; i--)
        {
            array[i] = str.charAt(i);
        }

        for (int i = str.length() - 1, j = 0 ; i >= 0; i--, j++)
        {
            newArray[j] = str.charAt(i);
        }

        System.out.println(array);
        System.out.println(newArray);

        if (Arrays.equals(array, newArray))
        {
            System.out.println("True");
        }
        else System.out.println("False");
    }
}
