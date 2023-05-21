public class FizzBuzz
{
    public static void main(String[] args)
    {
        //Test case n
        int n = 20;
        int[] nums = new int[n];

        //Create an array from 1 to n. [1, 2, 3, 4, 5...]
        for (int i = 0, j = 1; i < n; i++, j++)
        {
            nums[i] = j;
        }

        //New String array for the results
        String[] results = new String[n];

        for (int i : nums)
        {
            if ((i%3 == 0) && (i %5 == 0))
            {
                results[i] = "FizzBuzz";
            }
            else if (i%3 == 0)
            {
                results[i] = "Fizz";
            }
            else if (i%5 ==0)
            {
                results[i] = "Buzz";
            }
            else results[i] = String.valueOf(i);
        }

        for (String s : results)
        {
            System.out.println(s);
        }
    }
}
