package Exercise1;

public class Account {
	private long accNum;
	private double balance;
	public Account(long accNum, double balance) {
		super();
		this.accNum = accNum;
		this.balance = balance;
	}

	private Person accHolder;

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance += amount;
		//System.out.println("After deposit the balance is : " + balance);
	}

	public void withdraw(double amount) {
		if (amount <= balance) {
			balance = balance - amount;
			//System.out.println("After withdrawl the balance is : " + balance);
		} 
	}

	public double getBalance() {
		return balance;
	}

}
