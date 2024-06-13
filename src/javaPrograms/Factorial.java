package javaPrograms;

    public class Factorial {
        public static void main(String[] args) {
            int n = 5;
            long factorial = 1;
// Calculating factorial using iterative approach
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            // Output the factorial of n
            System.out.println("Factorial of " + n + " is: " + factorial);
        }
    }

