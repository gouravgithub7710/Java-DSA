package Day3;

public class Recursion {

    public static void print(int[] arr,int sI)
    {
        //base condition
        if(sI>=arr.length)
        {
            return;
        }
        //logic
        System.out.println(arr[sI]);

        //recursive code
        print(arr,sI+1);
    }

    public static void main(String[] args) {

        int arr[]={1,2,3,4,5};
        System.out.println("Recursion is start");
        print(arr,0);
        System.out.println("Recursion is end");
    }
}
