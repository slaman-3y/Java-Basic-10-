package javaPrograms;

public class NumberPatterns {
    public static void main(String[] args) {
        // Pattern 1
        System.out.println("Pattern 1:");
        for (int i = 1; i <= 4; i++) { // Number of rows
            for (int j = 1; j <= i; j++) { // Number of columns
                System.out.print(i);
            }
            System.out.println(); // Move to the next line after each row
        }

        // Pattern 2
        System.out.println("\nPattern 2:");
        for (int i = 1; i <= 4; i++) { // Number of rows
            for (int j = 1; j <= i; j++) { // Number of columns
                System.out.print(j);
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
