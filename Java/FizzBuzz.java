public class FizzBuzz
{
    public static void main(String[] args)
    {
        //Test case n
        int n = 20; //[1, 2, 3, 4, 5, 6, ... 20] 20 items, 19 max index.
        int[] nums = new int[n]; //new array has the same size as the old array, to add values up to n.

        //Create an array from 1 to n. [1, 2, 3, 4, 5...]
        for (int i = 0; i < n; i++)
        {
            nums[i] = i+1;
        }

        String[] results = new String[n]; //results array has same items as orignal array.
        //Convert number array into String array

        for (int i = 0; i < n; i++)
        {
            if (((i+1) % 3 == 0 ) && ((i+1) % 5 == 0)) //check if divisible by 3 AND 5, it is fizzbuzz.
            {
                results[i] = "FizzBuzz";
            }
            else if ((i+1) % 3 == 0) //check 3 and 5.
            {
                results[i] = "Fizz";
            }
            else if ((i+1) % 5 == 0)
            {
                results[i] = "Buzz";
            }
            else 
            {
                results[i] = String.valueOf(i + 1);
            }
        }

        for (String s : results)
        {
            System.out.println(s);
        }
    }
}

//Solution code with comments using List<String>

/*
import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> results = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results.add("FizzBuzz");
            } else if (i % 3 == 0) {
                results.add("Fizz");
            } else if (i % 5 == 0) {
                results.add("Buzz");
            } else {
                results.add(String.valueOf(i));
            }
        }

        return results;
    }
}
*/