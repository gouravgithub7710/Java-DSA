public class x_power_of_y {

    public static int x_power_of_y_(int x ,int y)
    {
        if (y==0)
        { return 1;}

        return x*x_power_of_y_(x,y-1);
    }
    public static void main(String[] args) {


        for (int i=0;i<=10;i++)
        {
            System.out.println("2 power_of "+ i +" is: "+ x_power_of_y_(2,i));
        }
    }
}
