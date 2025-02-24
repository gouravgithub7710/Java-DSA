public class Prime_Num {

    public static void main(String[] args) {

        int num = 6;

        if (num<2){
            System.out.println(num+" this num is not prime");
        }

        boolean check = true;
        for (int i=2;i<=num-1;i++)
        {
            if (num%i==0)
            {
                check= false;
            }
        }

        if (check==true){
            System.out.println(num+" this num is prime");
        }else {
            System.out.println(num+" this num is not prime");
        }
    }
}
