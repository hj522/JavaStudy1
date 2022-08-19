package Exercise.bank;

public class CheckingAccount extends BankAccount {
	private SavingsAccount protectedBy;

	public CheckingAccount(int balance) {
		super(balance);
	}

	public CheckingAccount(int balance, SavingsAccount protectedBy) {
		super(balance);
		this.protectedBy = protectedBy;
	}
	/**
	 * �ܾ�
	 * SavingsAccount: 5,000��
	 * CheckingAccount: 10,000��
	 * 1. ������ǥ�� 7,000��¥�� ������ ������ ���
	 * 
	 * 2. ������ǥ�� 13,000��¥�� ���� ������ ���
	 * SavingsAccount - (amount - CheckingAccount)
	 * CheckingAccount�� 0������ �����.
	 */
	@Override
	public boolean withdraw(int amount) {
		if (!super.withdraw(amount)) {
			protectedBy.withdraw(amount - this.balance);
//			protectedBy.balance -= amount - this.balance;
			this.balance = 0;
		}
		return true;
	}

}