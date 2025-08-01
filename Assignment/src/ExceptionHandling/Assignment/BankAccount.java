package ExceptionHandling.Assignment;

public class BankAccount {
	private int accountNumber;
    private double balance;

    // Parameterized constructor to initialize account number and balance
    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    /**
     * Deposits a positive amount to the account balance.
     * Throws InvalidAmountException if the amount is non-positive.
     */
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be greater than zero.");
        }
        balance += amount;
        System.out.printf("Deposited: %.2f\n", amount);
    }

    /**
     * Withdraws a specified amount from the account.
     * Throws InvalidAmountException if the amount is non-positive.
     * Throws InsufficientFundsException if withdrawal exceeds balance.
     */
    public void withdraw(double amount) throws InvalidAmountException, InsufficientFundException {
        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be greater than zero.");
        }
        if (amount > balance) {
            throw new InsufficientFundException("Insufficient funds for withdrawal.");
        }
        balance -= amount;
        System.out.printf("Withdrawn: %.2f\n", amount);
    }

    /**
     * Displays the current account number and balance.
     */
    public void displayBalance() {
        System.out.printf("Account Number: %d | Balance: %.2f\n", accountNumber, balance);
    }
}




