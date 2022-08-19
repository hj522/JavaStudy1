package Exercise.bank;

public class SavingsAccount extends BankAccount {
	private double interestRate;// ÀÌÀÚÀ²

	public SavingsAccount(int balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}
	public void updateBalance(int period) {
		this.balance += this.balance * interestRate * period;
	}
}