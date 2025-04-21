public class Sum_of_N_natural {

    public static int sum_of_N_Natural_num(int num)
    {
        if (num==0)
        {
            return 0;
        }

        return num+sum_of_N_Natural_num(num-1);
    }

    public static void main(String[] args)
    {
        System.out.println("sum_of_N_Natural_num: "+sum_of_N_Natural_num(5));
    }
}
