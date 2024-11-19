
public class SortableArrayExercise {
    
    
    public static void sortIntegers(int[] array) {
        System.out.println("Hello, Sorting!"); // Added an inline comment
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    // Swap the elements
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
      //Hello world
    // Method to sort an array of strings
    
    public static void sortStrings(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].compareTo(array[j]) > 0) {
                    // Swap the elements
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    // Main method to test sorting functionality
    public static void main(String[] args) {
        // Test with integers
        int[] intArray = {5, 2, 9, 1, 5, 6};
        System.out.println("Before sorting integers:");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        sortIntegers(intArray);
        System.out.println("\nAfter sorting integers:");
        for (int num : intArray) {
            System.out.print(num + " ");
        }

        // Test with strings
        String[] strArray = {"Banana", "Apple", "Orange", "Mango"};
        System.out.println("\n\nBefore sorting strings:");
        for (String str : strArray) {
            System.out.print(str + " ");
        }
        sortStrings(strArray);
        System.out.println("\nAfter sorting strings:");
        for (String str : strArray) {
            System.out.print(str + " ");
        }
       

    }
    
}
