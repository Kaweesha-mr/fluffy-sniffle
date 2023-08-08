package Exersice_2;

public abstract class Account {
	
	int accountNo;
	String name;
	float balance;
	
	public Account() {
		
		this.accountNo = 123456;
		this.balance = 5000;
		this.name = "kaweesha";
		
	}
	
	public void Deposit(float amount) {
		
		balance = balance + amount;
		System.out.println("New Balance is :" + balance);
		
	}
	

	
	abstract public double calculateIntrest();
	
	public void display() {
		
		System.out.println("Acount Number : "+accountNo);
		System.out.println("Name : "+name);
		System.out.println("Balance : "+balance);
	}

}
