package Day2;

import java.util.Scanner;
public class Print_N_Prime_num {

    public static boolean isPrime(int n){

        if (n<=1){return false;}

        for (int i=2;i<n;i++)
        {
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num for finding N prime num: ");
        int n = sc.nextInt();

        for (int i=2;i<=n;i++)
        {
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
