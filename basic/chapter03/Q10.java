package chapter03;

public class Q10 {
	public static void main(String[] args) {
		int var1 = 10; // �������� 10�� ���� ���� ���ϱ�
		int var2 = 3;
		int var3 = 14; 
		double value = (var3 * 0.01);
		double var4 = var1 * var1 * (var2 + value);
		System.out.println("���� ����:" + (int)var4);
	}
}


/*
 * �ùٸ� ����� �������� �ڵ带 �����Ͻÿ�.
 * ���� ���� ���� = ������ * ������ * ������
 * 
 * double var4 = (var1 * var1) * Double.parseDouble(var2 + "." + var3); ���ڸ� �Ǽ��� ��ȯ
 */