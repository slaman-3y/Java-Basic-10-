package javaPrograms;

public class NumberPatterns2 {
    public static void main(String[] args) {
        System.out.println("Printing Number Patterns with Loops and Modulo Operator:");

        for (int i = 1; i <= 5; i++) { // Rows
            if (i % 2 == 0) { // Check if the row number is even
                for (int j = 1; j <= i; j++) { // Print the row number 'i' times
                    System.out.print(i);
                }
            } else { // If the row number is odd
                System.out.print(i); // Print the row number once
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
