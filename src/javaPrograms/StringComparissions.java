package javaPrograms;

public class StringComparissions {
    public static void main(String[] args) {
        // String literals
        String light1 = "Red";
        String light2 = "Red";

        // String objects
        String light3 = new String("Green");
        String light4 = new String("Green");
// Comparing string literals using ==
        if (light1 == light2) {
            System.out.println("light1 and light2 are the same (using ==).");
        } else {
            System.out.println("light1 and light2 are different (using ==).");
        }
        // Comparing string objects using ==
        if (light3 == light4) {
            System.out.println("light3 and light4 are the same (using ==).");
        } else {
            System.out.println("light3 and light4 are different (using ==).");
        }
        // Comparing string objects using .equals()
        if (light3.equals(light4)) {
            System.out.println("light3 and light4 are the same (using .equals()).");
        } else {
            System.out.println("light3 and light4 are different (using .equals()).");
        }
    }
}
