package Exercise;

public class BankAccount {
	private int balance;

	public BankAccount(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}
	
	/**
	 * �Ա�
	 * @param amount: �ݾ�
	 */
	public void deposit(int amount) {
		this.balance += amount;
	}
	/**
	 * ���
	 * @param amount: �ݾ�
	 * @return
	 */
	public boolean withdraw(int amount) {
		if (this.balance > amount) {
			this.balance -= amount;
			return true;
		}
		return false;
	}
	/**
	 * ��ü
	 * @param amount: �ݾ�
	 * @param otherAccount: ���¹�ȣ
	 * @return
	 */
	public boolean transfer(int amount, BankAccount otherAccount) {
		if (withdraw(amount)) {
			otherAccount.deposit(amount);
			return true;
		}
		return false;
	}
	
}
