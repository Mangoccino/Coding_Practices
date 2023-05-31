public class test2 {
    public static void main(String[] args)
    {
        int A = 3;
        int B = 4;

        int input = A * B;
        int quotiant = input/2;
        int remainder = 0;
        String output = "";

        while (quotiant > 0)
        {
            quotiant = input/2;
            remainder = input%2;
            input = quotiant;
            output += "" + String.valueOf(remainder);
        }
                
        char[] array = new char[output.length()];

        for (int i = output.length()-1, j = 0; i >= 0; i--, j++)
        {
            array[j] = String.valueOf(output).charAt(i);
        }

        int counter = 0;
        for (char c : array)
        {
            if (c == '1')
            {
                counter++;
            }
        }

        System.out.println(counter);

    }
    
}

