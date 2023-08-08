package Exersice_2;

public class SavingsAccount extends FixedDepositAccount {


	@Override
	public double calculateIntrest() {
		// TODO Auto-generated method stub
		interest = balance * interestRate/100/12;

		return interest;
	}
	
	public void wihdraw(float amount) {
		
		balance = balance - amount;
		System.out.println("New Balance: "+balance);
	}
	
}
