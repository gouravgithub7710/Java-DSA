public class reverse_num {

    static int rev;
    public static int  reverse_num(int n)
    {
        if (n==0) return rev;

       int lstdit = n%10;

       rev = rev*10+lstdit;

      return reverse_num(n/10);

    }
    public static void main(String[] args) {

        System.out.println( reverse_num(1234567890));
    }
}
