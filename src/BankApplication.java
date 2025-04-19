/*20 	Assume that a bank maintains account for its customers; it may be saving or current. The saving account provides compound interest and withdrawal facilities but not cheque book. The current account provides cheque book but no interest. Current account holders should also maintain a min balance & if the balance falls below, a service charge is imposed. Perform the problem by using the switch cases.  Include the necessary methods in order to achieve the following tasks inside switch case:  
a)	Accept deposit from a customer and update the balance  
b)	Display the balance.  
c)	Compute and deposit interest  
d)	Permit withdrawal and update the balance.  
e)	Check for the minimum balance, impose penalty. If necessary, and update the balance. 
Display all the information. */
import java.util.Scanner;
class BankAccount {
    String accountHolder;
    String accountType;
    double balance;
    final double interestRate = 0.04; // 4% Annual Interest
    final double minBalance = 5000; // Minimum balance for Current Account
    final double penalty = 500; // Penalty if balance falls below minBalance

    // Constructor
    public BankAccount(String name, String type, double initialBalance) {
        this.accountHolder = name;
        this.accountType = type;
        this.balance = initialBalance;
    }

    // Method to deposit money
    void deposit(double amount) {
        balance += amount;
        System.out.println("₹" + amount + " deposited successfully!");
    }

    // Method to display balance
    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Type: " + accountType);
        System.out.println("Current Balance: ₹" + balance);
    }

    // Method to compute and deposit interest (Only for Savings Account)
    void computeInterest() {
        if (accountType.equalsIgnoreCase("Saving")) {
            double interest = balance * interestRate;
            balance += interest;
            System.out.println("Interest of ₹" + interest + " deposited.");
        } else {
            System.out.println("Interest is not applicable for Current Accounts.");
        }
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully!");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Method to check minimum balance and impose penalty (For Current Accounts)
    void checkMinBalance() {
        if (accountType.equalsIgnoreCase("Current") && balance < minBalance) {
            balance -= penalty;
            System.out.println("Penalty of ₹" + penalty + " imposed due to low balance.");
        }
    }
}

public class BankApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept account details
        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Account Type (Saving/Current): ");
        String type = sc.nextLine();
        System.out.print("Enter Initial Deposit Amount: ₹");
        double balance = sc.nextDouble();

        // Create bank account object
        BankAccount account = new BankAccount(name, type, balance);

        // Menu-driven switch case
        while (true) {
            System.out.println("\n*** Bank Operations Menu ***");
            System.out.println("1. Deposit Money");
            System.out.println("2. Display Balance");
            System.out.println("3. Compute & Deposit Interest (For Savings)");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Check Minimum Balance (For Current Account)");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ₹");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    account.displayBalance();
                    break;
                case 3:
                    account.computeInterest();
                    break;
                case 4:
                    System.out.print("Enter withdrawal amount: ₹");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 5:
                    account.checkMinBalance();
                    break;
                case 6:
                    System.out.println("Exiting program. Thank you for banking with us!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }
}
