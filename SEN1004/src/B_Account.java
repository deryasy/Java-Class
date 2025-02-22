public class B_Account {
	private double balance;

	public double getBalance() {
		// gives the value of balance to the calling method
		return balance;
	}

	/*
	 * public void setBalance(double newBalance) { balance = newBalance; }
	 */

	// constructor
	public B_Account(double initialBalance) {
		// validate that initial balance is bigger than 0
		if (initialBalance > 0.0)
			balance = initialBalance;
	}

	public void addCredit(double amount) {
		balance = balance + amount;
	}
}