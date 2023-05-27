public class PasswordChecker {
    public static void main (String[] args)
    {
        //Return boolean, input String password
        //Test Code
        String password1 = "IloveLet3code!";
        String password2 = "Me+You--IsMyDream";
        String password3 = "1aB";
        String password = "@Aa1a1a1";

        //Check password is 8 characters  long
        //1 lower case
        //1 upper case
        //1 digit
        //1 special character
        //does not contain 2 of the same character in adjacent positions

        //Convert string into character array
        char[] array = new char[password.length()];
        for (int i = 0; i < password.length(); i++)
        {
            array[i] = password.charAt(i);
        }

        //Check for upper case, lower case, special characters and numbers.
        int upper = 0;
        int lower = 0;
        int special = 0;
        int number = 0;
        int same = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (((int)array[i] >= 65) && ((int)array[i] <=90))
            {
                upper++;
            }
            if (((int)array[i] >= 97) && ((int)array[i] <= 122))
            {
                lower++;
            }
            if (((int)array[i] >= 48) && ((int) array[i] <= 57))
            {
                number++;
            }
            if (((int)array[i] == 33) || ((int) array[i] == 35) || ((int)array[i] == 36) || ((int)array[i] == 37) || ((int)array[i] == 38) || ((int)array[i] == 40) || ((int)array[i] == 41) || ((int)array[i] == 42) || ((int) array[i] == 43) || ((int)array[i] == 45) || ((int)array[i] == 64))
            {
                special++;
            }

            int j = i+1;
            if ((j < array.length) && (array[i] == array[j]))
            {
                same++;
            }
        }


        if ((upper > 0) && (lower > 0) && (special > 0) && (number > 0) && (same == 0) && (array.length >= 8))
        {
            System.out.println("Password is valid");
        }
        else System.out.println("password not valid");
    }
    
}
