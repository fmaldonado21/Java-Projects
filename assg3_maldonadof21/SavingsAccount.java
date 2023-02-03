package assg3_maldonadof21;

public class SavingsAccount extends Account{
	
	private double interestRate;
	
	/**
	 * 
	 * @param accNo
	 */
	public SavingsAccount(String accNo) {
		super(accNo);
		setBalance(0);
		setInterestRate(0);
	}
	
	/**
	 * 
	 * @param accNo
	 * @param initBalance
	 * @param interestRate
	 */
	public SavingsAccount(String accNo, double initBalance, double interestRate) {
		super(accNo, initBalance);
		interestRate= 0;
	}

	public double getInterestRate() {
		return interestRate;
	}
	
	/**
	 * 
	 * @param interestRate
	 */
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void addInterest() {
		setBalance((1 + interestRate) * getBalance());
	}
	
	public String toString() {
		return "Account Number: " +this.getAccNo() + "\nCurrent Balance: " +this.getBalance() + "Interest Rate: " + this.getInterestRate();
	
	}
	
	public void displayInfo() {
		
		System.out.println("Account Number: " + getAccNo());
		System.out.println("Current Balance: " + getBalance());
		System.out.println("Interest Rate: " + getInterestRate());
	}
	
}
	
