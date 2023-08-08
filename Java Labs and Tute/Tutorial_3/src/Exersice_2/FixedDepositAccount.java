package Exersice_2;

public class FixedDepositAccount extends Account {
	
	float interestRate;
	float interest;
	
	
	public void setRate(float rate) {
		
		this.interestRate = rate;
		
	}
	
	public float getRate() {
		
		return interestRate;
		
	}
	

	@Override
	public double calculateIntrest() {
		// TODO Auto-generated method stub
		return interest = balance * interestRate/100;
	}

}
