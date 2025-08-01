package ExceptionHandling.Assignment;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        // Creating a BankAccount instance using parameterized constructor
        BankAccount account = new BankAccount(1001, 5000.0);

        Scanner sc = new Scanner(System.in);
        try {
            account.displayBalance();

            // Demonstrate deposit with exception handling
            System.out.print("Enter amount to deposit: ");
            double depositAmount = sc.nextDouble();
            try {
                account.deposit(depositAmount);
            } catch (InvalidAmountException e) {
                System.out.println("Deposit Error: " + e.getMessage());
            }

            account.displayBalance();

            // Demonstrate withdrawal with exception handling
            System.out.print("Enter amount to withdraw: ");
            double withdrawalAmount = sc.nextDouble();
            try {
                account.withdraw(withdrawalAmount);
            } catch (InvalidAmountException | InsufficientFundException e) {
                System.out.println("Withdrawal Error: " + e.getMessage());
            }

            account.displayBalance();

        } catch (Exception ex) {
            System.out.println("Unexpected error: " + ex.getMessage());
        } finally {
            // The finally block is used to close resources or perform cleanup activities
            sc.close();
            System.out.println("Banking operations complete.");
        }
    }
}


