package Day3;

public class Tower_of_Honai {

    public static int moves(char S, char D,char A,int n){

        //base condition

        if (n==1) {return 1;}

        // first move n-1 ,S->A using D,move largest from S to D =1,move n-1 from A->D using S

        return moves(S,A,D,n-1)+1+moves(A,D,S,n-1);
    }
    public static void main(String[] args) {

        System.out.println(moves('s','d','a',2));
        System.out.println(moves('s','d','a',3));
        System.out.println(moves('s','d','a',4));
        System.out.println(moves('s','d','a',5));
        System.out.println(moves('s','d','a',6));

    }
}
