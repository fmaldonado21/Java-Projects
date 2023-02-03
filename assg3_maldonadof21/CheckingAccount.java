package assg3_maldonadof21;

public class CheckingAccount extends Account{
	
	private double overdraft;
	static int fee;
	
	/**
	 * 
	 * @param accNo
	 */
	public CheckingAccount(String accNo) {
		super(accNo);
		overdraft = 0;
		setBalance(0);
	}
	
	/**
	 * 
	 * @param accNo
	 * @param initBalance
	 * @param overdraftAmt
	 */
	
	public CheckingAccount(String accNo, double initBalance, double overdraftAmt) {
		super(accNo, initBalance);
		overdraft = 0;
	}
	
	public double getOverdraft() {
		return this.overdraft;
	}
	
	/**
	 * 
	 * @param newoverdraft
	 */
	public void setOverdraft(double newoverdraft) {
		this.overdraft = newoverdraft;
	}
	
	public double getFee() {
		return CheckingAccount.fee;
	}
	
	/**
	 * 
	 * @param newFee
	 */
	public void setFee(int newFee) {
		CheckingAccount.fee = newFee;
	}
	
	public String toString() {
		return "Account Number: " +this.getAccNo() + "\nCurrent Balance: " +this.getBalance() + "Overdraft Amount: " + this.getOverdraft();
	}
	
	public void withdrawal(double withdrawAmt) {
		if(withdrawAmt > -1) {
			if(getBalance() - withdrawAmt <= overdraft) {
				this.setBalance(getBalance() - withdrawAmt - CheckingAccount.fee);
			}
			else if (getBalance() - withdrawAmt >= overdraft) {
				this.setBalance(getBalance() - withdrawAmt);
			}
			else {
				System.out.println("You do not have enough money in your account!");
			}

		}
		else {
			System.out.println("you cannot withdraw a negative amount");
		}
	}
	
	/**
	 * @param account2, amountTransf
	 */
	public void transfer(Account account2, double amountTransf) {
	if(amountTransf > -1) {
		if(getBalance() - amountTransf <= overdraft) {
			this.setBalance(getBalance() - amountTransf - CheckingAccount.fee);
			account2.setBalance(account2.getBalance() + amountTransf);
		}
		else if (getBalance() - amountTransf >= overdraft) {
			this.setBalance(getBalance() - amountTransf);
			account2.setBalance(account2.getBalance() + amountTransf);
		}
		else {
			System.out.println("You do not have enough money in your account!");
		}

	}
	else {
		System.out.println("you cannot transfer a negative amount");
	}
}
	
	public void displayInfo() {
		System.out.println("Account Number: " + getAccNo());
		System.out.println("Current Balance: " + getBalance());
		System.out.println("Overdraft Amount: " + getOverdraft());
	}
		
}
