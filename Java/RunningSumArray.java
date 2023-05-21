public class RunningSumArray{
    public static void main(String[] args)
    {
        /*Given the test case int array [1, 2, 3, 4]
         *Return sum of array in a new array [1, 1+2, 1+2+3, 1+2+3+4]
         *Return newArray = [1, 3, 6, 10]
         */

        //Test case
        int[] nums = {1, 2, 3, 4};
        int total = 0;

        int[] newArray = new int[nums.length];

        for (int i = 0; i < nums.length; i++)
        {
            total = total + nums[i];
            newArray[i] = total;
        }
    }
}

//This solution beats has 0ms runtime, and beats 98% in memory use.