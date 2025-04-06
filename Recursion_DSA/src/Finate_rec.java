public class Finate_rec {
    public static void m(int x)
    {
        if (x==0)
        {
            return;
        }

        System.out.println("Hello ji :"+x);
        m(x-1);
    }

    public static void main(String args[])
    {
        m(4);
    }
}
