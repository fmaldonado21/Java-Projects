package assg3_maldonadof21;

public class AccountTest {

	public static void main(String[] args) {
		
		Account a1 = new Account("210"); 
		Account a2 = new Account("365", 30000);
		Account a3 = new Account("758", 24000);
		Account a4 = new Account("210", 10000);
		CheckingAccount c1 = new CheckingAccount("111");
		CheckingAccount c2 = new CheckingAccount("112", 780, 100);
		CheckingAccount c3 = new CheckingAccount("113", 450, 50);
		SavingsAccount s1 = new SavingsAccount("333");
		SavingsAccount s2 = new SavingsAccount("444", 2000, 0.05);
		SavingsAccount s3 = new SavingsAccount("555", 4000, 0.03);
				
		/* This is testing Account Number*/
		System.out.println("This is to test a1 Account Number:" +	a1.getAccNo());
		System.out.println("This is to test a2 Account Number:" +	a2.getAccNo());
		System.out.println("This is to test a3 Account Number:"	+  	a3.getAccNo());
		System.out.println("This is to test a4 Account Number:"	+ 	a4.getAccNo());
		System.out.println("This is to test c1 Account Number:" + 	c1.getAccNo());
		System.out.println("This is to test c2 Account Number:" + 	c2.getAccNo());
		System.out.println("This is to test c3 Account Number:" + 	c3.getAccNo());
		System.out.println("This is to test s1 Account Number:" + 	s1.getAccNo());
		System.out.println("This is to test s2 Account Number:" + 	s2.getAccNo());
		System.out.println("This is to test s3 Account Number:" + 	s3.getAccNo());

		/* This is testing getting balance*/
		System.out.println("Getting balance a1:" + a1.getBalance());
		System.out.println("Getting balance a2:" + a2.getBalance());
		System.out.println("Getting balance a3:" + a3.getBalance());
		System.out.println("Getting balance a4:" + a4.getBalance());
		System.out.println("Getting balance c1:" + c1.getBalance());
		System.out.println("Getting balance c2:" + c2.getBalance());
		System.out.println("Getting balance c3:" + c3.getBalance());
		System.out.println("Getting balance s1:" + s1.getBalance());
		System.out.println("Getting balance s2:" + s2.getBalance());
		System.out.println("Getting balance s3:" + s3.getBalance());
		
		/*This is setting the balance*/
		a1.setBalance(780.01);
		a2.setBalance(458.44);
		a3.setBalance(798.78);
		a4.setBalance(132.11);
		c1.setBalance(420.32);
		c2.setBalance(690.99);
		c3.setBalance(700.78);
		s1.setBalance(111.44);
		s2.setBalance(222.55);
		s3.setBalance(333.08);
		
		/*This is getting the balance after setters*/
		System.out.println("---Balance after setters---");
		System.out.println("Getting balance a1: " + a1.getBalance());
		System.out.println("Getting balance a2: " + a2.getBalance());
		System.out.println("Getting balance a3: " + a3.getBalance());
		System.out.println("Getting balance a4: " + a4.getBalance());
		System.out.println("Getting balance c1: " + c1.getBalance());
		System.out.println("Getting balance c2: " + c2.getBalance());
		System.out.println("Getting balance c3: " + c3.getBalance());
		System.out.println("Getting balance s1: " + s1.getBalance());
		System.out.println("Getting balance s2: " + s2.getBalance());
		System.out.println("Getting balance s3: " + s3.getBalance());
		
		/* This is setting the deposit method*/
		System.out.println("---Testing the Deposit Method---");
		System.out.println("a1: " + a1.getBalance());
		a1.deposit(560);
		System.out.println("Deposited $560 into a1: " + a1.getBalance());
		
		System.out.println("a2: " + a2.getBalance());
		a2.deposit(320);
		System.out.println("Deposited $320 into: " + a2.getBalance());
		
		System.out.println("a3: " + a3.getBalance());
		a3.deposit(21);
		System.out.println("Deposited $21 into: " + a3.getBalance());
		
		System.out.println("a4: " + a4.getBalance());
		a4.deposit(100);
		System.out.println("Deposited $100 into: " + a4.getBalance());
		
		System.out.println("c1: " + c1.getBalance());
		c1.deposit(34.43);
		System.out.println("Deposited $34.43 into: " + c1.getBalance());
		
		System.out.println("c2: " + c2.getBalance());
		c2.deposit(56.99);
		System.out.println("Deposited $56.99 into: " + c2.getBalance());
		
		System.out.println("c3: " + c3.getBalance());
		c3.deposit(25);
		System.out.println("Deposited $25 into: " + c3.getBalance());
		
		System.out.println("s1: " + s1.getBalance());
		s1.deposit(69.69);
		System.out.println("Deposited $69.69 into: " + s1.getBalance());
		
		System.out.println("s2: " + s2.getBalance());
		s2.deposit(71);
		System.out.println("Deposited $71 into: " + s2.getBalance());
		
		System.out.println("s3: " + s3.getBalance());
		s3.deposit(89);
		System.out.println("Deposited $89 into: " + s3.getBalance());
		
		/* This is testing the withdraw method*/
		System.out.println("---Testing the Withdraw Method---");
		System.out.println("Withdrawing $50 from a1: " + a1.getBalance());
		a1.withdrawal(50);
		System.out.println("Balance after withdrawal: " + a1.getBalance());
		
		System.out.println("Withdrawing $75 from a2: " + a2.getBalance());
		a2.withdrawal(75);
		System.out.println("Balance after withdrawal: " + a2.getBalance());
		
		System.out.println("Withdrawing $88 from a3: " + a3.getBalance());
		a3.withdrawal(88);
		System.out.println("Balance after withdrawal: " + a3.getBalance());
		
		System.out.println("Withdrawing $22 from a4: " + a4.getBalance());
		a4.withdrawal(22);
		System.out.println("Balance after withdrawal: " + a4.getBalance());
		
		System.out.println("Withdrawing $78.08 from c1: " + c1.getBalance());
		c1.withdrawal(78.08);
		System.out.println("Balance after withdrawal: " + c1.getBalance());
		
		System.out.println("Withdrawing $134.12 from c2: " + c2.getBalance());
		c2.withdrawal(134.12);
		System.out.println("Balance after withdrawal: " + c2.getBalance());
		
		System.out.println("Withdrawing $90.61 from c3: " + c3.getBalance());
		c3.withdrawal(90.61);
		System.out.println("Balance after withdrawal: " + c3.getBalance());
		
		System.out.println("Withdrawing $56.01 from s1: " + s1.getBalance());
		s1.withdrawal(56.01);
		System.out.println("Balance after withdrawal: " + s1.getBalance());
		
		System.out.println("Withdrawing $90 from s2: " + s2.getBalance());
		s2.withdrawal(90);
		System.out.println("Balance after withdrawal: " + s2.getBalance());
		
		System.out.println("Withdrawing $56.01 from s3: " + s3.getBalance());
		s3.withdrawal(56.01);
		System.out.println("Balance after withdrawal: " + s3.getBalance());
	
		
		/* This is testing the transfer method*/
		System.out.println("---Testing the Transfer Method---");
		System.out.println("Transferring from a1 to a2: " + a2.getBalance());
		a1.transfer(a2, 100);
		System.out.println("a2 new balance: " + a2.getBalance());
		
		System.out.println("Transferring from a2 to a3: " + a3.getBalance());
		a2.transfer(a3, 50);
		System.out.println("a3 new balance: " + a3.getBalance());
		
		System.out.println("Transferring from a3 to a4: " + a4.getBalance());
		a3.transfer(a4, 25);
		System.out.println("a4 new balance: " + a4.getBalance());
		
		System.out.println("Transferring from a4 to a1: " + a1.getBalance());
		a4.transfer(a1, 120);
		System.out.println("a1 new balance: " + a1.getBalance());
		
		/*This is just displaying info*/
		System.out.println("---Displaying Info---");
		a1.displayInfo();
		System.out.println(a1.equals(a2));
		
		a2.displayInfo();
		System.out.println(a2.equals(a3));
		
		a3.displayInfo();
		System.out.println(a3.equals(a4));
		
		a4.displayInfo();
		System.out.println(a4.equals(a1));
		
		c1.displayInfo();
		System.out.println(c1.equals(c2));
		
		c2.displayInfo();
		System.out.println(c2.equals(c3));
		
		c3.displayInfo();
		System.out.println(c3.equals(c1));
		
		s1.displayInfo();
		System.out.println(s1.equals(s2));
		
		s2.displayInfo();
		System.out.println(s2.equals(s3));
		
		s3.displayInfo();
		System.out.println(s3.equals(s1));
		
		System.out.println("---Testing toString---");
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
		System.out.println(a4.toString());
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		
		
	}

	
}
