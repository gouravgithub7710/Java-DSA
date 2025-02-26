public class Palindrome_num {

    public static void main(String[] args) {

        int n = 121;

        int temp=n;

        int rev=0;
        while(temp!=0)
        {
            int rem = temp%10;
            rev = rev*10+rem;
            temp=temp/10;
        }

        if (rev==n)
        {
            System.out.println("This is palindrome num");
        }
        else {
            System.out.println("this is not palindrome num");
        }
    }
}
