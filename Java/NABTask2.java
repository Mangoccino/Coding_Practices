public class NABTask2 {
    public static void main(String[] args)
    {
        /*TASK:
         * Given a set of AA, AB and BB. Return the longest string possible that does not contain "AAA" or "BBB".
         */

        //Test code inputs
        int AA = 5;
        int AB = 0; 
        int BB = 2;

        String res = ""; //result string.
        int total = AA + AB + BB;

        for (int i = 0; i < total; i++)
        {
            
            if ((AA > 0) && (!res.contains("AAA")))
            {   
                res = res + "AA";
                AA--;
            }

            if ((BB > 0) && (!res.contains("BBB")))
            {
                res = res + "BB";
                BB--;
            }
            if (AB > 0)
            {
                res = res + "AB";
                AB--;
            }

            if ((res.charAt(res.length()-2) == 'A') && (res.charAt(res.length()-1) == 'A') && (BB == 0))
            {
                break;
            }

            if ((res.charAt(res.length()-2) == 'B') && (res.charAt(res.length()-1) == 'B') && (AA == 0) && (AB == 0))
            {
                break;
            }
        }
    System.out.println(res);
    }
}
    
