package Exersice_2;

public class main {

	public static void main(String[] args) {
		
		Account fd1 = new FixedDepositAccount();
		SavingsAccount sa1 = new SavingsAccount();
		
		sa1.Deposit(500000);
		sa1.wihdraw(200);

	}


}
