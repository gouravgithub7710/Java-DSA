public class Tail_rec {

    public static void m(int x)
    {
        if (x==0){return;}
        System.out.println("This is : "+x);
        m(x-1);
        //after recursive call if we are not taking any instructions then such type of recursion is called as tail recursion
    }

    public static void main(String[] args) {
        m(5);
    }
}
