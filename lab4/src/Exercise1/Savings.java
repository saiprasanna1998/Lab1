package Exercise1;

public class Savings extends Account {
	final int minimumBalance = 500;
	private double balance;

	public Savings(long accNum, double balance) {
		super(accNum, balance);

	}

	public void deposit() {
		this.deposit();

	}

	public void withdraw(double amount) {
		balance = this.getBalance();
		if (amount <= (balance - minimumBalance)) {
			balance -= amount;
			System.out.println("Balance after withdrawl in Savings is: "+balance);
		} 
		else {
			System.out.println("No enough balance");
		}
	}

}
