package Exercise1;


public class BankApp{

	public static void main(String[] args) {
		Account account1 = new Account(51231, 2000.00);
		Person person1 = new Person("Smith");
		person1.setAccount(account1);
		account1.deposit(2000);
		Account account2 = new Account(51232,2000.00);
		Person person2 = new Person("Kathy");
		person2.setAccount(account1);
		account2.withdraw(1000);
		System.out.println(account1.getAccNum()+"\n"+person1.getName()+"\n"+account1.getBalance());
		System.out.println("---------------");
		System.out.println(account2.getAccNum()+"\n"+person2.getName()+"\n"+account2.getBalance());
		System.out.println("-----------------");
		
		
		
		
		
		account1 = new Savings(123456789,550.0);
		account1.deposit(1000);
		account1.withdraw(500);
		System.out.println("-----------------");
		account2 = new Current(123456789,500.0);
		account2.deposit(1500);
		account2.withdraw(1000);
		
		
	}

}
