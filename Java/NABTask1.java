public class NABTask1 {
    public static void main (String[] args)
    {
        /*TASK:
         * Given a string S, return how many times the first letter equals the last letter, and moving the first letter to the end.
         * Example: abbaa
         * abbaa - first and last letter is the same. (1)
         * bbaaa - not the same 
         * baaab - first and last letter is the same. (2)
         * aaabb - not the same
         * aabba - first and last letter is the same. (3)
         * abbaa original string
         */

        //Test code String S.
        String S = "abbaa";

        int counter = 0;
        char temp; 

        //convery string into character array
        char[] array = new char[S.length()];
        for (int i = 0; i < S.length(); i++)
        {
            array[i] = S.charAt(i);
        }

        int k = 0; 
        int l = array.length -1; // i is index, j is last index.

        for (int i = 0; i < array.length; i++)
        {
            //check if first is equals to last
            if (array[k] == array[l])
            {
                counter++;
            }
            temp = array[k];

            for (int a = 0; a < array.length -1 ; a++)
            {
                array[a] = array[a+1];
            }

            array[l] = temp;
        }
        System.out.println(counter);
    }
}