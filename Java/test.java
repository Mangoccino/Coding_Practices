public class test {
    public static void main(String[] args)
    {
        int N = 4;

        //Loop to print single single Ls.
        for (int i = 0; i < N-1; i++)
        {
            System.out.println("L");
        }

        String lastRow = "";
        for (int i = 0; i < N; i++)
        {
            lastRow += 'L'; 
        }
        System.out.println(lastRow);
    }
}
