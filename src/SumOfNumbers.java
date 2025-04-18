import java.util.Scanner;
public class SumOfNumbers {

//    1234 ==> 10  Sum of numbers

    public static void main(String[] args)
    {
        System.out.println("Enter the total numbers : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = 0;
        while(i < n)
        {
            System.out.println("Enter the " + i + " number : ");
            int num = sc.nextInt();
            sum = sum + num;
            i++;
        }

        System.out.println("Total sum of numbers is " + sum);
    }
}
