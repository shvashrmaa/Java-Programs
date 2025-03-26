import java.util.Scanner;

public class ArithmeticJava {
    public static int addition(int a , int b){
        return a+b;
    }

    public static int subtraction(int a , int b){
        return a-b;
    }

    public static long multiplication(int a , int b){
        return (long) a *b;
    }

    public static float division(int a , int b){
        return (float) a /b;
    }

    public static float mod(int a , int b){
        return a%b;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int input1 = sc.nextInt();
        System.out.println("Enter the second number :");
        int input2 = sc.nextInt();

        System.out.println("addition is : " + addition(input1, input2));
        System.out.println("subtraction is :" + subtraction(input1 , input2));
        System.out.println("multiplication is :" + multiplication(input1 , input2));
        System.out.println("division is :" + division(input1 , input2));
        System.out.println("mod is :" + mod(input1 , input2));

    }
}
