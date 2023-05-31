public class test3 {
    public static void main(String[] args)
    {
        int[] A = {1, 1, 1, 1, 1, 3};
        int K = 2;

        int n = A.length;

        //checks next number is bigger than number before.
        for (int i = 0; i < n - 1; i++) { //for every index,
            System.out.println(A[i] + 1);
            System.out.println(A[i+1]);
            if (A[i] + 1 < A[i + 1])
            System.out.println(false + "1");
        }

        if (A[0] != 1)
            System.out.println(false);
        else
            System.out.println(true);    

    }
}