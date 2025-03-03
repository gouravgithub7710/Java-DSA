package Day1;

public class Sum_of_N_natural_num {

    public static int Sum_of_N_natural_num(int n)
    {
     int sum=0;
     for (int i=0;i<=n;i++)
     {
         sum=sum+i;
     }
        return sum;
    }
    public static void main(String[] args) {

        int n=5;
        int ans = Sum_of_N_natural_num(n);
        System.out.println("Sum_of_N_natural_num: "+ans);
    }
}


//--|||---time complexity is 0(N) because its depend on N


// if we apply formula of Sum_of_N_natural_num then the complexity is 0(1) because its not depend on N
//formula = (n(n+1))/2   this is the formula for calculating Sum_of_N_natural_num