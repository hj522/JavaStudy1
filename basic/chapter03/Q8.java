package chapter03;

public class Q8 {
	public static void main(String[] args) {
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = ((0.5 * (lengthTop + lengthBottom)) * height);
		System.out.println(area);
	}
}

/*�Ҽ� �ڸ����� ��Ȯ�� ���� �� �ֵ��� ���� ���
��ٸ��� ���� ���ϴ� ���� = (����+�Ʒ���)*���� / 2
double area = ((lengthTop + lengthBottom) * height / 2.0);
*/