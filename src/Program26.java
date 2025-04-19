// Lab 29 : Merge two sorted arrays into one sorted array.
import java.util.Arrays;

public class Program26 {

    // Method to merge two sorted arrays
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        // Create a new array to hold the merged result
        int[] mergedArray = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;

        // Merge the arrays
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k] = arr1[i];
                i++;
            } else {
                mergedArray[k] = arr2[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of arr1 (if any)
        while (i < arr1.length) {
            mergedArray[k] = arr1[i];
            i++;
            k++;
        }

        // Copy remaining elements of arr2 (if any)
        while (j < arr2.length) {
            mergedArray[k] = arr2[j];
            j++;
            k++;
        }

        return mergedArray;
    }

    public static void main(String[] args) {
        // Example sorted arrays
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        // Merging the arrays
        int[] mergedArray = mergeArrays(arr1, arr2);

        // Display the merged sorted array
        System.out.println("Merged Sorted Array: " + Arrays.toString(mergedArray));
    }
}
