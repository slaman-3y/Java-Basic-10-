package javaPrograms;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 12345;
        int reversed = 0;

        for (; num != 0; num /= 10) {
            int digit = num % 10;       // Get the last digit
            reversed = reversed * 10 + digit; // Append digit to reversed number
        }

        // Output the reversed number
        System.out.println("Reversed number: " + reversed);
    }
}
