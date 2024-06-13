package javaPrograms;

import java.util.HashMap;

public class DuplicateValuesCounter {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 2, 3, 3, 4, 5, 5};

        // Create a HashMap to store element counts
        HashMap<Integer, Integer> countMap = new HashMap<>();

        // Iterate through the array and count occurrences
        for (int num : array) {
            if (countMap.containsKey(num)) {
                countMap.put(num, countMap.get(num) + 1);
            } else {
                countMap.put(num, 1);
            }
        }

        // Print the counts of each element
        System.out.println("Duplicate Counts in the Array:");
        for (int key : countMap.keySet()) {
            System.out.println(key + " occurs " + countMap.get(key) + " times.");
        }
    }
}
