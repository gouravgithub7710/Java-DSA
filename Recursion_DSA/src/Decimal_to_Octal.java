public class Decimal_to_Octal {

    public static int oct(int n)
    {
        if(n==0)
            return 0;
        return n%8 + 10*oct(n/8);
    }
    public static void main(String[] args)
    {
        for(int i=0;i<=10;i++)
            System.out.println(i+"\t"+oct(i));
    }
}
