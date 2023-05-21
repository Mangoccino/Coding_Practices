//Date: 20/05/23
//Leetcode practice- Roman To Integer

public class RomanToIntCopy {
    public static void main (String[] args)
    {
        //Input is String s.
        String s = "MCMXCIV"; //Test case 3.      
        int num = 0;

        //Change string into character array
        char[] array = new char[s.length()];
        for (int i = 0; i < s.length(); i++)
        {
            array[i] = s.charAt(i);
        }
        
        for (int i = 0; i < array.length; i++)
        {
            switch(array[i])
            {
                case 'M': 
                {
                    num = num + 1000;
                    if ((i != 0) && (array[i-1] == 'C'))
                    {
                        num = num - 100;
                    }
                }

                case 'D':
                {
                    num = num + 500;
                    if ((i != 0) && (array[i-1] == 'C')) //if prior index is C = 100,
                    {
                        num = num -100; //add 400 for CD, the subtract the original C that was added.
                    }
                }

                case 'C':
                {
                    if ((i > 0) && (array[i-1] == 'X')) //if prior index is X = 10,
                    {
                        num = num + 90 - 10; //add 90 for XC, and minus 10 for before.
                    }
                    else num = num + 100; //Otherwise it is 100.
                }

                case 'L':
                {
                    if ((i > 0) && (array[i-1] == 'X')) //if prior index is X = 10,
                    {
                        num = num + 40 - 10; //add 40 for XL, and minus 10 for before.
                    }
                    else num = num + 50; //Otherwise it is 50.
                }

                case 'X':
                {
                    if ((i > 0) && (array[i-1] == 'I'))
                    {
                        num = num + 9 - 1;
                    }
                    else num = num + 10;
                }

                case 'V':
                {
                    if ((i > 0) && (array[i-1] == 'I'))
                    {
                        num = num + 4 -1;
                    }
                    else num = num + 5;
                }

                case 'I':
                {
                    num = num + 1;
                }
            }

            System.out.println("It is currently at " + (i + 1) + " and the number is " + num);
        }

        System.out.println(num); //print new array
    }
}

//This solution has 4ms runtime (in top 5%), and uses 43.9mb of memory (NOT GOOD FOR THIS ONE)