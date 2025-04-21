public class sum_of_digits {


    public static int sumofdigits(int num)
    {
        if (num==0) return 0;

       return num%10+sumofdigits(num/10);
    }

    public static void main(String[] args) {

        System.out.println(sumofdigits(123));;
    }
}
