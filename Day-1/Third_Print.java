public class Third_Print {

    public static void main(String args[])
    {
        int n = 3;
        for(int i=0;i<n;i++)
        {
            //for blank space
            for (int j = 0; j < 3-i-1; j++) {
                System.out.print(" ");
            }
            // for stars
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0;i<2;i++)
        {
            //for blank space
            for (int j = 0; j < i+1; j++) {
                System.out.print(" ");
            }
            // for stars
            for (int j = 0; j < (2-i)*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
