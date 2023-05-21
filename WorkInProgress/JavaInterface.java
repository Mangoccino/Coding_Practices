package WorkInProgress;

import java.util.*;

public class JavaInterface {

    public static void main(String[] args)
    {
        JavaInterface calc = new JavaInterface();
        calc.run();
    }

    Scanner console = new Scanner(System.in);

    public void run()
    {
        System.out.println("Thank you for trying out me interface! \nThe below exercises are ordered by the time I did them. \nPlease pick what youd like to try out");
        System.out.println("1. Roman To Int \n2. Running Sum Array \n3. Two Sum \n4. FizzBuzz \n5. Richest Customer Wealth");
        int input = console.nextInt();
        
        switch(input) 
        {
            case 1: 
            {
                System.out.println("Roman to Int, as it suggests is a program that changes Roman numerals into an integer.");
                break;
            }
            case 2:
            {
                System.out.println("RomanToInt");
                break;
            }
            default: System.out.println("Ïnvalid input!");
        }

    }
}
