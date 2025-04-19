// Lab Program 11 - Write a program to show the use of Boolean data type. 

public class Program11 {
        public static void main(String[] args) {
            boolean isJavaFun = true;
            boolean isSkyGreen = false;
    
            System.out.println("Is Java fun? " + isJavaFun);
            System.out.println("Is the sky green? " + isSkyGreen);
    
            // Using boolean in a conditional statement
            if (isJavaFun) {
                System.out.println("Yes! Java is fun to learn.");
            } else {
                System.out.println("No, Java is not fun.");
            }
    
            // Using boolean in a comparison
            int a = 10, b = 20;
            boolean isAGreater = a > b;
            System.out.println("Is 'a' greater than 'b'? " + isAGreater);
        }
    }
    
