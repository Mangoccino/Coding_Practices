//Date: 20/05/23
//Leetcode practice- Roman To Integer

/* Roman letters and corresponding integers
    * I = 1
    * V = 5
    * X = 10
    * L = 50
    * C = 100
    * D = 500
    * M = 1000

    * IV = 4, IX = 9
    * XL = 40, XC = 90
    * CD = 400, CM = 900
    */

    /*Test cases
    String s1 = "III" = 3
    String s2 = "LVIII" = 58
    String s3 = "MCMXCIV" = 1994
    */

public class RomanToInt {
    public static void main (String[] args)
    {
        //Input is String s.
        String s = "MCMXCIV"; //Test case 3.      
        int num = 0;

        //Change string into character array
        char[] array = new char[s.length()]; //make new character array.

        for (int i = 0; i < s.length(); i++) //loop through string characters
        {
            array[i] = s.charAt(i); //assign position to new character array.
        }

        //Print character array for checking.
        for (char c : array)
        {
            System.out.println(c);
        }

        //double checking array length.
        System.out.println(array.length);

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == 'M')
            {
                if ((i > 0) && (array[i-1] == 'C')) //if prior index is C = 100,
                {
                    num = num + 900 - 100; //add 900 for CM, then subtract the original C that was added.
                }
                else num = num + 1000;
            }
            else if (array[i] == 'D')
            {
                if ((i > 0) && (array[i-1] == 'C')) //if prior index is C = 100,
                {
                    num = num + 400 - 100; //add 400 for CD, the subtract the original C that was added.
                }
                else num = num + 500; //Otherwise it is 500.
            }
            else if (array[i] == 'C')
            {
                if ((i > 0) && (array[i-1] == 'X')) //if prior index is X = 10,
                {
                    num = num + 90 - 10; //add 90 for XC, and minus 10 for before.
                }
                else num = num + 100; //Otherwise it is 100.
            }
            else if (array[i] == 'L')
            {
                if ((i > 0) && (array[i-1] == 'X')) //if prior index is X = 10,
                {
                    num = num + 40 - 10; //add 40 for XL, and minus 10 for before.
                }
                else num = num + 50; //Otherwise it is 50.
            }
            else if (array[i] == 'X')
            {
                if ((i > 0) && (array[i-1] == 'I'))
                {
                    num = num + 9 - 1;
                }
                else num = num + 10;
            }
            else if (array[i] == 'V')
            {
                if ((i > 0) && (array[i-1] == 'I'))
                {
                    num = num + 4 -1;
                }
                else num = num + 5;
            }
            else if (array[i] == 'I')
            {
                num = num + 1;
            }

            System.out.println("It is currently at " + (i + 1) + " and the number is " + num);
        }

        System.out.println(num); //print new array

    }
}

//This solution has 4ms runtime (in top 5%), and uses 43.9mb of memory (NOT GOOD FOR THIS ONE)