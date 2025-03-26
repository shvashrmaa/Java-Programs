import java.util.Scanner;

public class FactorialJava {

    public static int factorial(int num)
    {
        if(num == 0 || num == 1){
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("The factorial of " + n + " is " + factorial(n));
    }

}
