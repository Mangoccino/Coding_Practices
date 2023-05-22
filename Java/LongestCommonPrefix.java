public class LongestCommonPrefix {
    public static void main(String[] args) {

        //Test case
        String[] strs = {"Dog", "Racecar", "Cars"};
        String[] strs = {"Flowers", "Flow", "Flight"};

        String shortest = strs[0];
        String output = "";
        int counter = 0;
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < shortest.length()) {
                shortest = strs[i];
            }
        }

        for (int j = 0; j < shortest.length(); j++) 
        {
            for (int k =1; k < strs.length; k++) 
            {
                if (strs[0].charAt(j) != strs[k].charAt(j)) 
                {
                    counter = j;
                    if (counter >= 0) 
                    {
                        output = strs[0].substring(0, counter);
                    }
                    else
                    {
                        output = "";
                    }
                    System.out.println(output);
                    System.exit(k);  
                }
            }
        }
    }
}

