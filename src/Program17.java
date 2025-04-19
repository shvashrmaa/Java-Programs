//Lab Program 17 : 19 	Write a program to read string from console and display the number of occurrence of each word. 

import java.util.HashMap;
import java.util.Scanner;

public class Program17 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string from user
        System.out.println("Enter a string:");
        String input = sc.nextLine().toLowerCase(); // Convert to lowercase to ignore case sensitivity

        // Split the string into words using space and punctuation as delimiters
        String[] words = input.split("[\\s,.;!?]+");

        // Create a HashMap to store word frequency
        HashMap<String, Integer> wordCount = new HashMap<>();

        // Count occurrences of each word
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        // Display word occurrences
        System.out.println("Word Occurrences:");
        for (HashMap.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        sc.close();
    }
}
