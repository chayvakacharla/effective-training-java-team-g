package type2;

public class tests {
	
static void testWithdraw(String test,Account account,double amount,String password, boolean expectedResult) {
		
		boolean actualResult= Withdraw(amount,password);
		
		if(actualResult==expectedResult) {
			System.out.println("PASSED:\t"+test);
		} else {
			System.out.printf("Failed:\t%s\n\texpected:%s\tgot:%s\n", test, expectedResult,actualResult);
		}
	}
	
	static void testDeposit(String test,Account account,double amount, boolean expectedResult) {
		
		boolean actualResult= account.Deposit(amount);
		
		if(actualResult==expectedResult) {
			System.out.println("PASSED:\t"+test);
		} else {
			System.out.printf("Failed:\t%s\n\texpected:%s\tgot:%s\n", test, expectedResult,actualResult);
		}
	}
	public static boolean Deposit(double amount) {
		// TODO Auto-generated method stub
		if(amount>=0) {
			double balance = amount;
			return true;
		} else {
			return false;
		}
	}

	public static boolean Withdraw(double amount, String password) {
		// TODO Auto-generated method stub
		if(amount <=0) {
			return false;
		}
		
		double balance;
		if (amount>balance) {
			return false;
		} 
		
		//if (!this.password.equals(password)) //testing unsalted password
		if(!authenticate(password))
			return false;
		else {
			
			balance-=amount;
			return true;
		}
		
		
		
		
	}
	
	
	
	
	
	

	

	private static boolean authenticate(String password) {
		// TODO Auto-generated method stub
		return false;
	}

	private static void testAccount(BankAccount account, String password) {
		account.show();		
		account.deposit(20000);
		account.deposit(-1.0);

		account.show();
		
		account.creditInterest();
		account.show();
		
		
		if(account.withdraw(50000,"wrongp@ss")) {
			System.out.println("withdraw success");	
		} else {
			System.out.println("withdraw failed");
		}
		
		if(account.withdraw(-1, password)) {
			System.out.println("withdraw success");	
		} else {
			System.out.println("withdraw failed");		
		}
		
		
		if(account.withdraw(100000, password)){
			System.out.println("withdraw success");	
		} else {
			System.out.println("withdraw failed");		
		}		

		if(account.withdraw(50000, password)){
			System.out.println("withdraw success");	
		} else {
			System.out.println("withdraw failed");		
		}
	}

	
	
	
	
	
}

}

