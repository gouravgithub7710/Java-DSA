package Day2;

public class GCD {

    public static void main(String args[])
    {
        int n1=24;
        int n2=36;

       while (n1%n2!=0)
       {
           int rem=n1%n2;

           n1=n2;

           n2=rem;

       }

        System.out.println(n2);

//----see copy for understanding or using this yt: https://www.youtube.com/watch?v=ZtDeDD1VYLk
    }
}
