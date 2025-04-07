public class Fibo {

   public static int fibo(int num)
    {
        if (num==0)
        {
            return 0;
        } else if (num==1) {
            return 1;
        }

        return fibo(num-1)+fibo(num-2);

    }

    public static void main(String[] args) {
        System.out.println("Fibonachi program---------");

        System.out.println("fibo of 6 is : "+fibo(6));//-----> 8
    }
}
