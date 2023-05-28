public class LongestCommonPrefix {
    public static void main(String[] args) {

        //Test case
        String[] strs1 = {"Dog", "Racecar", "Cars"};
        String[] strs2 = {"Flowers", "Flow", "Flight"};
        String[] strs = {"a", "b", "ba"};

        int min = strs[0].length();
        String output = "";

        //Find shortest word length
        for (String s : strs)
        {
            if (s.length() < min)
            {
                min = s.length();
            }
        }

        int counter = 0;
        for (int i = 0; i < min; i++)
        {
            for (int k = 1; k <= min; k++)
            {
                if (strs[0].charAt(i) == strs[k].charAt(i))
                {
                    counter++;
                }
            }
            if (counter == strs.length -1)
            {
                output = "" + strs[0].charAt(i);
            }
        }

        System.out.println(output);

    }
}

