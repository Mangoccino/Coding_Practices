public class RichestCustomerWealth {
    public static void main (String[] args)
    {
        //Test Case
        int[][] accounts = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}}; // 3 customers

        // [[2,8,7],[7,1,3],[1,9,5]]
        int total = 0, max = 0;
        
        int[] wealth = new int[accounts.length];

        for (int i = 0; i < accounts.length; i++)
        {
            for (int j = 0; j < accounts[i].length; j++)
            {
                total = total + accounts[i][j];
                wealth[i] = total;
                System.out.println("the total for customer " + i + "is" + total); // stores the total wealth of the customer in corresponding index.
            }
            total = 0; 
        }

        for (int i = 0; i < wealth.length-1; i++)        
        {
            if (max < wealth[i])
            {
                max = wealth[i];
            }
        }
        System.out.println("The answer is " + max);
    }
}
