package Exercise1;

public class Current extends Account {
	public Current(long accNum, double balance) {
		super(accNum, balance);
		
	}
	private double overdraft = -500;
	private double balance;
	public void deposit() {
		this.deposit();
		System.out.println("After deposit balance is: "+balance);
	}
	public void withdraw(double amount) {
		balance = this.getBalance();
		if (amount > overdraft) {			
			balance-= amount;
			System.out.println("Balance after withdrawl in current is  "+balance);
		} 
		else {
			System.out.println("No enough balance");
		}
	}
	
}
