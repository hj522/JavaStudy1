package chapter11;

public class ByteToStringExample {
	public static void main(String[] args) {
		//�����
		// plain text
		String txt = "�ѱ�";
		// ��ȣȭ �˰������� ��ȣȭ
		
		String securedTxt = "sdfsdf";
		
		// getBytes�� ����ؼ� byte �迭�� ��ȯ
		byte[] securedBytes = securedTxt.getBytes();
		
		// ����
		
		// ���� �����͸� ��ȣȭ
		byte[] bytes = securedBytes;
		
		// ����Ʈ �迭�� ���ڿ��� ��ȯ
		String receivedTxt = new String(bytes);
		System.out.println(receivedTxt);
	}
}
