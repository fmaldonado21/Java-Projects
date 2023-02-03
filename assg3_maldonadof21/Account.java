package assg3_maldonadof21;

public class Account {
	
	private String accNo;
	private double balance;
	
	/**
	 * 
	 * @param AccNo
	 */
	public Account(String AccNo){
		this.accNo = AccNo;
		balance = 0;
	}
	/**
	 * 
	 * @param AccNo
	 * @param Balance
	 */
	public Account(String AccNo, double Balance) {
		this.accNo =  AccNo;
		Balance = 0;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getAccNo(){
		return accNo;
	}
	/**
	 * 
	 * @return
	 */
	public double getBalance() {
		return balance;
	}
	
	/**
	 * 
	 * @param newBalance
	 */
	public void setBalance(double newBalance) {
		this.balance = newBalance;
	}
	
	/**
	 * 
	 * @param depositAmt
	 */
	public void deposit(double depositAmt) {
		if(depositAmt > -1) {
			this.setBalance(balance + depositAmt);
		}
		else {
			System.out.println("You are not able to deposit a negative amount");
		}
	}
	/**
	 * 
	 * @param withdrawAmt
	 */
	public void withdrawal(double withdrawAmt) {
		if(withdrawAmt > -1) {
			if(balance - withdrawAmt > 0) {
				this.setBalance(balance - withdrawAmt);
			}
			else {
				System.out.println("You do not have enough money in your account!");
			}
			}
		else {
			System.out.println("You cannot withdraw a negative amount");
		}
	}
	/**
	 * 
	 * @param account2
	 * @param amountTransf
	 */
	
	public void transfer(Account account2, double amountTransf) {
		if(amountTransf > -1) {
			if(balance - amountTransf > 0) {
			this.setBalance(balance - amountTransf);
			account2.setBalance(account2.balance + amountTransf);
			}
			else {
				System.out.println("You do not have enough money in your account!");
			}
		}
		else {
			System.out.println("You cannot transfer a negative amount");
		}
	}
	/*This displays the info*/
	public void displayInfo() {
		System.out.println("Account Number: " + accNo);
		System.out.println("Current Balance: " + balance);
	}
	/**
	 * This is the toString method
	 */
	
	public String toString() {
		return "Account number:" + accNo + "\nCurrent Balance: " + balance;
	}
	
	/**
	 * 
	 * 
	 * @param obj
	 * @return true or false
	 */
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(obj instanceof Account){
			Account temp = (Account)obj;
			if(accNo.equals(temp.getAccNo())) {
			return true;
			}
		}
		else {
			return false;
		}
		return false;
	}
	
}
