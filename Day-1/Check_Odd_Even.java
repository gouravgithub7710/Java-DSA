import java.util.Scanner;
public class Check_Odd_Even {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num for checking weather the num is even or odd:");
        int n = sc.nextInt();

        if(n%2==0)
        {
            System.out.println(n+" this is even num");
        }else {
            System.out.println(n+" this is odd num");
        }
    }
}
