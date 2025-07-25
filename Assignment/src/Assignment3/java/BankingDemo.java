package Assignment3.java;

public class BankingDemo {
	 public static void main(String[] args) {
	        Account savings = new SavingAccount("SA101", 1000);
	        Account checking = new CheckingAccount("CA101", 500);

	        Transaction transaction = new Transaction();

	        transaction.performTransaction(savings, "deposit", 200);
	        transaction.performTransaction(checking, "withdraw", 100);

	        savings.displayAccountDetails();
	        checking.displayAccountDetails();

	        System.out.println("Total Accounts Created: " + Bank.getTotalAccounts());
	    }
	}


