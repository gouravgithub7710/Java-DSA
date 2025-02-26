package Day1;

public class factorial {

    public static void main(String[] args) {
        long ans = 1;
        int factorial = 20;
         for (int i=factorial; i>=1;i--)
         {
             ans = ans*i;
         }

        System.out.println("factorial: "+ans);
    }
}
