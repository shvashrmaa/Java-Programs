import java.util.Scanner;

public class SumOfDigit {

//    143 ==> 8  Sum of digits

    public static int sumOfDigit(int num)
    {
        int sum = 0;
        while(num>0)
        {
            if(num%10 != 0)
            {
                sum = sum + num % 10;
                num = num / 10;
            }
        }
        return sum;
    }

    public static void main(String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println("Sum of digit of integer is : " + sumOfDigit(num));
    }


}
