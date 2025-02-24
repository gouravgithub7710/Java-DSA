public class Prime_number_check {
    public static void main(String[] args) {
        int prime_num = 4;
        int factorial = 0;

        for (int i = 1; i <= prime_num; i++) {
            if (prime_num % i == 0) {
                factorial++;
            }
        }
        if (factorial > 2) {
            System.out.println(prime_num + " this is not a prime num");
        } else {
            System.out.println(prime_num + " this is prime num");
        }

    }
}

//optimise code in day ---2
