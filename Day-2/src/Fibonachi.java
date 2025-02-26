public class Fibonachi {


    public static void printfibo(int n){
        int first=0,second=1,nthfibo=0;

        if (n==1){ System.out.println(first); return;}
         else if (n==2) {System.out.println(first+" "+second); return;}

         for (int i=2;i<=n;i++)
         {
             nthfibo = first+second;

             System.out.print(nthfibo+" ");
             second=nthfibo;
             first=second;
         }
    }
    public static void main(String[] args) {

        printfibo(3);
    }
}
