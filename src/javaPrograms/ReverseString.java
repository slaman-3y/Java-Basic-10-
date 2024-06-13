package javaPrograms;

public class ReverseString {
    public static void main(String[] args) {
        String str = "hello";
        String reversedStr = "";

        // Traverse the original string from end to beginning
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i); // Append each character to reversedStr
        }

        // Print the original and reversed strings
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedStr);
    }
}