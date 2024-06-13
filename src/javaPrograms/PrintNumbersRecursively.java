package javaPrograms;

public class PrintNumbersRecursively {
    public static void printNumbers(int N) {
        if (N > 1) {
            printNumbers(N - 1); // Recursively call printNumbers with N-1
        }
        System.out.print(N + " "); // Print N
    }

    public static void main(String[] args) {
        int N = 10; // Change N to the desired number of numbers to print
        System.out.println("Printing numbers from 1 to " + N + " without loops:");
        printNumbers(N);
    }
}
