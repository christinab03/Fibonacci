public class Fibonacci {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Fibonacci <n>");
            return;
        }

        int n;
        try {
            n = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Please provide a valid integer.");
            return;
        }

        if (n < 0) {
            System.out.println("Please provide a non-negative integer.");
            return;
        }

        long fib = fibonacci(n);
        System.out.println("Fibonacci number at position " + n + " is: " + fib);
    }

    public static long fibonacci(int n) {
        if (n <= 1)
            return n;
        long fib = 1;
        long prevFib = 0;

        for (int i = 2; i <= n; i++) {
            long temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        return fib;
    }
}
