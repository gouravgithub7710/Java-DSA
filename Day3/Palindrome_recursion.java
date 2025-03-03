package Day3;

public class Palindrome_recursion {

    public static boolean isPalindrome(int arr[],int sI,int eI)
    {
        //base condition
        if(sI>=eI)
        {
            return true;
        }

        //logic and call
        return arr[sI]==arr[eI] && isPalindrome(arr, sI+1,eI-1);
    }

    public static void main(String[] args) {

        int arr[]={1,2,3};
        System.out.println(isPalindrome(arr,0,arr.length-1));


        // this is normal palindrome code
        // int num = 121;
//        int ori= num;
//        int rev = 0;
//        while (num!=0)
//        {
//            int rem = num%10;
//
//            rev = rev*10+rem;
//
//            num = num/10;
//
//        }
//
//        if (rev==ori)
//        {
//            System.out.println(rev);
//        }
    }
}
