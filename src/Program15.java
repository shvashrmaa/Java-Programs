//Lab Program 15 - Write a program to read marks out of 100. Declare result as follows:  a. 60 or more 1st class  

import java.util.Scanner;

public class Program15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input marks from the user
        System.out.print("Enter marks (out of 100): ");
        int marks = sc.nextInt();

        // Validate input
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks! Please enter a value between 0 and 100.");
        } else {
            // Determine result
            if (marks >= 60) {
                System.out.println("Result: First Class");
            } else if (marks >= 50) {
                System.out.println("Result: Second Class");
            } else if (marks >= 40) {
                System.out.println("Result: Pass");
            } else {
                System.out.println("Result: Fail");
            }
        }

        sc.close();
    }
}

/*  
Steps for Execution :
Takes input for marks (out of 100).

Checks for invalid input (negative or above 100).

Determines the result based on the marks range.

Displays the appropriate result message.
*/