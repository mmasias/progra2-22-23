
package clase;

public class BankAccount {
	
	private String Headline;
	private double Amount;
	
	public BankAccount(String Headline, double Amount) {
		this.Headline = Headline;
		this.Amount = Amount;
	}
	
	
	public String getHeadline (){
	     return Headline;
	}
	public double getAmount () {
		return Amount;
	}
	public void setHeadline(String Headline) {
		this.Headline = Headline;
	}
	public void setAmount(double Amount) {
		this.Amount = Amount;
	}
	
	public void deposit(double AmountIn) {
		//AmountB == deposit
		if(AmountIn > 0) {
			Amount = Amount + AmountIn;
		}
		
	}
	public void withdraw(double AmountOut) {
		if(AmountOut > 0) {
			Amount = Amount - AmountOut;
			if(Amount < 0) {
				Amount = 0;
			}
		}	
	}
	public static void main(String[]args) {
		
		
	}
	
}
