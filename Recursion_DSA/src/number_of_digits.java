public class number_of_digits {

    public static int numberofdigits(int num)
    {
        if (num==0)
        {
            return 0;
        }

        return 1+numberofdigits(num/10);


    }
    public static void main(String[] args) {

        System.out.println(numberofdigits(123));
    }
}
