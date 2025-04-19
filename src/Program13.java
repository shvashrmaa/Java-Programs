import java.util.Arrays;

public class Program13 {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 5, 6};

        // Using Arrays.sort() method
        System.out.println("Original Array: " + Arrays.toString(numbers));
        
        Arrays.sort(numbers); // In-built sorting function
        
        System.out.println("Sorted Array using Arrays.sort(): " + Arrays.toString(numbers));

        // Sorting using Bubble Sort (Manual Method)
        int[] numbers2 = {5, 2, 9, 1, 5, 6}; // Another array for manual sorting
        bubbleSort(numbers2);
        System.out.println("Sorted Array using Bubble Sort: " + Arrays.toString(numbers2));
    }

    // Bubble Sort Implementation
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
