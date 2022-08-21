package org.override;

public class AxixBank extends BankInfo {

	public void deposit(int a) {
		System.out.println("Deposit amount is " +a);
	}
	
	public static void main(String[] args) {
		
		AxixBank a1 = new AxixBank();
		a1.saving();
		a1.fixed();
		a1.deposit();
		a1.deposit(10000);
	}
	
	
	
	
}
