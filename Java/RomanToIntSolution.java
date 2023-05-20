public class RomanToIntSolution {
    public static void main (String[] args)
    {
        String s = "MCMXCIV"; //Test code

        int ans = 0, num = 0; //initiate answer and number to be zero.

        System.out.println(s.length()-1);

        //string length -1 = last index
        //starting from the last index, if index is higher or equal to zero, index decreases.
        //Loop through the array from the smallest.

        for (int i = s.length()-1; i >= 0; i--) { 
            switch(s.charAt(i)) { //switch case for string character at index i.
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }

        if (4 * num < ans) ans -= num;
        else ans += num;
        }
        System.out.println(ans);

        //Testcase 1. III
        /* num = 1, ans = 0 + 1.
         * num = 1, ans = 0 + 1.
         * num = 1, ans = 0 + 1. */

        //Testcase 2. LVIII
        /* num = 1, ans = 0 + 1.
         * num = 1, ans = 0 + 1.
         * num = 1, ans = 0 + 1. ans = 3
         * num = 5, ans = 3, ans = 8
         * num = 50, ans = 8, ans = 58. */

        //Testcase 3. MCMXCIV
        /* num = 5, ans = 0, ans = 5
         * num = 1, ans = 5, 4*1 = 4, < 5. so ans = 5-1 = 4. */

    }
}

