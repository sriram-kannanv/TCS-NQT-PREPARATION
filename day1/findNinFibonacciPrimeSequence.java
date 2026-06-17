package day1;

public class findNinFibonacciPrimeSequence {

    public static void main(String[] args) {
        int n = 6;
        System.out.println(nthnum(n)); // Output: 11
    }
    public static int nthnum(int n) {

        // Odd position -> Fibonacci
        if (n % 2 != 0) {
            int pos = (n + 1) / 2;

            int a = 1, b = 1;

            if (pos <= 2)
                return 1;

            for (int i = 3; i <= pos; i++) {
                int c = a + b;
                a = b;
                b = c;
            }
            return b;
        }
        // Even position -> Prime
        int pos = n / 2;
        int count = 0;
        int num = 2;
        while (true) {
            boolean prime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                count++;
                if (count == pos)
                    return num;
            }

            num++;
        }
    }
}