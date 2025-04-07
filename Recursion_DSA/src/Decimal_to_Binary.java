public class Decimal_to_Binary {


    public static int bin(int n)
    {
        if(n==0)
            return 0;
        return n%2 + 10*bin(n/2);
    }
    public static void main(String[] args) {
        System.out.println("Decimal to Binary");

        for (int i=0;i<=10;i++)
        {
            System.out.println(i+" -> "+bin(i));
        }
    }
}
