package javaPrograms;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MissingClosingIndicesDetector {

    public static void main(String[] args) {
        String input = "[()]([()[({";

        List<Integer> missingIndices = findMissingClosingIndices(input);

        System.out.println("Input: " + input);
        System.out.println("Missing Indices: " + missingIndices);
    }

    public static List<Integer> findMissingClosingIndices(String input) {
        List<Integer> missingIndices = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(i);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    missingIndices.add(i); // No corresponding opening bracket found
                }
            }
        }

        // Add remaining indices in the stack (corresponding opening brackets not closed)
        while (!stack.isEmpty()) {
            missingIndices.add(stack.pop());
        }

        return missingIndices;
    }
}