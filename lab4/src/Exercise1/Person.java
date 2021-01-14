package Exercise1;

public class Person {

	private String name;
	private float age;
	private Account account;

	Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;

	}

	public void setName(String name) {
		this.name = name;
		// this.setAccount(100);
	}

	public float getAge() {
		return age;
	}

	public void setAge(float age) {
		this.age = age;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}
