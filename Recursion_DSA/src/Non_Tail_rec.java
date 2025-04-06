public class Non_Tail_rec {
    public static void m(int x)
    {
        if (x==0){return;}

        m(x-1);
        System.out.println("This is : "+x);
        //after recursive call if we are taking any instructions then such type of recursion is called as non-tail recursion
    }

    public static void main(String[] args) {
        m(5);
    }
}