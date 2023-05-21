public class RichestCustomerWealth {
    public static void main (String[] args)
    {
        //Test Case
        int[][] accounts = {{6,59,64,19,30,76,71,86,90,25,56,17,19,72,61,56,24,40,35,39,67,28,52,11,82,72,8,82,81,47}, {1, 2, 3, 4, 6}};

        // [[2,8,7],[7,1,3],[1,9,5]]
        int total = 0, max = 0;
        
        int[] wealth = new int[accounts.length];

        for (int i = 0; i < accounts.length; i++)
        {
            for (int j = 0; j < accounts[i].length; j++)
            {
                total = total + accounts[i][j];
                wealth[i] = total;
            }
            total = 0; 
            System.out.println(wealth[i]);
        }

        for (int i = 0; i < wealth.length; i++)        
        {
            if (max < wealth[i])
            {
                max = wealth[i];
            }
        }
        System.out.println("The answer is " + max);
    }
}
