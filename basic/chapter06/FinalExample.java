package chapter06;

public class FinalExample {

	final String str; // final - �ѹ� ���� �����Ǹ� ������ ����
	
	public FinalExample(String str) {
		this.str = str;
	}
	
	
	public static void main(String[] args) {
		final String s = null; // �ʱⰪ null�� �������� �ȴ�
		s = "b";
	}
}
