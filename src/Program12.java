// lab program 12: Write a program to show the scope and lifetime of a variable. 

public class Program12 {
   
        
 
    
        // Global variable (class-level) - Scope: Entire class, Lifetime: Throughout program execution
        static int globalVar = 100;
    
        public static void main(String[] args) {
            // Local variable - Scope: Within main method, Lifetime: Till method execution ends
            int localVar = 50;
    
            System.out.println("Inside main method:");
            System.out.println("Global variable: " + globalVar);
            System.out.println("Local variable: " + localVar);
    
            // Calling a method to demonstrate scope
            methodScopeDemo();
    
            // Block scope example
            if (localVar > 20) {
                int blockVar = 200; // Scope: Only inside this 'if' block
                System.out.println("Block variable: " + blockVar);
            }
            
            // Uncommenting the below line will cause an error because blockVar is out of scope
            // System.out.println(blockVar);
        }
    
        public static void methodScopeDemo() {
            // Method variable - Scope: Only inside this method, Lifetime: Till method execution ends
            int methodVar = 30;
            System.out.println("\nInside methodScopeDemo method:");
            System.out.println("Global variable: " + globalVar);
            System.out.println("Method variable: " + methodVar);
    
            // Uncommenting the below line will cause an error because localVar is out of scope
            // System.out.println(localVar);
        }
    }
    