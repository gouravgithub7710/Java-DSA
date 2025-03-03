package Day3;

public class Factorial_Recursion {

    public static int factorial(int n)
    {
        //base condition
        if (n==0 || n==1)
        {
            return 1;
        }
        //logic and call
       return n*factorial(n-1);
    }
    public static void main(String[] args) {

        System.out.println( factorial(5));
    }
}
