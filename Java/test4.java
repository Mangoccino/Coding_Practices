public class test4 {
    public static void main (String[] args)
    {
        int N = 5000;

        //character array of integers 
        char[] A = new char[String.valueOf(N).length()];
        for (int i = 0; i < String.valueOf(N).length(); i++)
        {
            A[i] = String.valueOf(N).charAt(i);
        }

        int counter = 0; 
        for (char c : A)
        {
            if (c == '5')
            {
                counter++;
            }
        }

        String temp = "";
        if (counter == 1)
        {
            for (char c: A)
            {
                if (c != '5')
                {
                    temp = temp + c;
                }
            }
        }

        int ans = Integer.parseInt(temp);
        System.out.println(ans);
    }
}
