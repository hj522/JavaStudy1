package chapter01;

public class star01 {

	public static void main(String[] args) {
		
		int i = 1;
		int j = 1;
		
		while(i<=10) {
			
			// j <= ����. ���ڸ�ŭ ���� ������.
			while(j<=i) {
			System.out.print("*");
			j = j + 1;
		}
		
		System.out.println(""); //�����ٷ� �̵�
		j=1; //�ʱ�ȭ
		// j <= ����. ���ڸ�ŭ ���� ���� ��!
		
		i = i + 1;
			
	}
}
}

