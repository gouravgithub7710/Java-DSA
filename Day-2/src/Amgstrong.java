public class Amgstrong {

    public static void main(String[] args) {
        int num = 153;
        int t1 = num;
        int len = 0;

        // Calculate length (number of digits)
        while (t1 != 0) {
            t1 = t1 / 10;
            len = len + 1;
        }

        // Calculate Armstrong number
        int t2 = num;
        int arm = 0;

        while (t2 != 0) {
            int rem = t2 % 10; // Extract last digit
            int mul = 1; // Reset multiplication for each digit

            // Compute rem^len (power calculation)
            for (int i = 0; i < len; i++) {
                mul = mul * rem;
            }

            arm = arm + mul;
            t2 = t2 / 10; // Remove last digit
        }

        // Check if it is an Armstrong number
        if (arm == num) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }
}
