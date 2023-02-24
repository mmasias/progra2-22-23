package class;

import java.util.Scanner; 

public class BankAccount {
	
	private String Headline;
	private double Amount;
	Scanner keyboard = new Scanner(System.in);
	
	public double deposit(Scanner keyboard1, double Amount) {
		double deposit;
		deposit = keyboard1;
		System.out.println("How mucho amount of money you want to deposit?");
		Amount = Amount + deposit;
		return Amount;
	}
	public double withdraw(Scanner keyboard2, double Amount) {
		double withdraw;
		withdraw = keyboard2;
		System.out.println("How much amount of money you want to withdraw?");
		Amount = Amount + withdraw;
		return Amount;
	}
	public boolean yesOrNo() {
		boolean deposit = true;
		System.out.println("Do you want to deposit money or withdraw money? yes for deposit no for withdraw.");
		
	}
	public static void main(String[]args) {
		
		
	}
}
