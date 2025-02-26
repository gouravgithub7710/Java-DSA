public class Fibonachi {
    public static void printfibo(int n) {
        int first = 0, second = 1, nthfibo;

        if (n == 1) {
            System.out.println(first);
            return;
        } else if (n == 2) {
            System.out.println(first + " " + second);
            return;
        }

        System.out.print(first + " " + second + " ");  // Print first two numbers

        for (int i = 3; i <= n; i++) {  // Start from 3 since first two are already printed
            nthfibo = first + second;
            System.out.print(nthfibo + " ");

            first = second;  // Update first to previous second
            second = nthfibo;  // Update second to the new nth Fibonacci number
        }
    }

    public static void main(String[] args) {
        printfibo(4);
    }
}
