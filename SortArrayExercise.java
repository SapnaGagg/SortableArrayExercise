package SortableArrayExercise;

import java.util.Arrays;

public class SortArrayExercise {
    public static void main(String[] args) {
        // Sorting integers
        int[] numbers = {5, 3, 8, 1, 2};
        Arrays.sort(numbers);
        System.out.println("Sorted Integers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println();

        // Sorting strings
        String[] strings = {"banana", "apple", "cherry", "date"};
        Arrays.sort(strings);
        System.out.println("Sorted Strings:");
        for (String str : strings) {
            System.out.print(str + " ");
        }
    }
}



