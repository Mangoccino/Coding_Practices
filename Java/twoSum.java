public class twoSum {
    public static void main (String[] args)
    {
        /*Given nums[] and int target.
         * Return indices of the two numbers such that they add to the target.
         * 
         * Example:
         * nums [2, 7, 11, 15] target =9.
         * output would be [0, 1]. because nums[0] + nums[1] = 9.
         */
        
         //Test case 
         int[] nums = {2, 7, 11, 15};
         int target = 9;
         int index = 0;

         int[] results = new int[2]; //New results array can only contain 2 items.

         //outer loop: loop through array numbers
         for (int i = 0; i < nums.length -1; i++)
         { //inner loop: loop through to add the one after.
            for (int j = i+1; j < nums.length; j++)
            {
                if (nums[i] + nums[j] == target);
                {
                    results[index] = i;
                    results[index + 1] = j;
                }
            }
         }
         
         for (int i : results)
         {
            System.out.println(i);
         }
    }
    
}
