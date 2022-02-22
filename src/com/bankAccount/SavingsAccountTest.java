package com.bankAccount;

public class SavingsAccountTest {
	public static void main(String[] arg) {
		double interest;
		
		SavingsAccount saver1 = new SavingsAccount(2000.0);
		SavingsAccount saver2 = new SavingsAccount(3000.0);
		SavingsAccount.setAnnualInterestRate(4.0);
		interest = saver1.calculateMonthlyInterest();
		saver1.display(interest);
		SavingsAccount.setAnnualInterestRate(5.0);
		interest = saver2.calculateMonthlyInterest();
		saver2.display(interest);
		
	}

}
