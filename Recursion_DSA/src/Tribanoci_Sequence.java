public class Tribanoci_Sequence {

    public static int tribanoci(int n)
    {
        if (n==0||n==1||n==2)
        {
            return n;
        }
        return tribanoci(n-1)+tribanoci(n-2)+tribanoci(n-3);
    }
    public static void main(String[] args) {

        for (int i = 0; i <=10; i++) {
            System.out.print(i+" -> "+tribanoci(i)+",  ");
        }
    }
}
