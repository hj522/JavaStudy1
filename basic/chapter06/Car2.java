package chapter06;

public class Car2 {
	
		// �ʵ�
		int gas;
		
		// ������
		
		// �޼ҵ�
		void setGas(int gas) {
			this.gas = gas; // ���ϰ��� ���� �޼ҵ�� �Ű����� �޾Ƽ� gas �ʵ尪�� ����
		}
		
		boolean isLeftGas() {
			if(gas == 0) {
				System.out.println("gas�� �����ϴ�.");
				return false; // false�� ����
			}
		
		System.out.println("gas�� �ֽ��ϴ�.");
		return true; // true�� ����
	} 
		
		void run() { // ���ϰ��� ���� �޼ҵ�� gas �ʵ尪�� 0�̸� return������ �޼ҵ� ���� ����
			while(true) {
				
				if(gas > 0) {
				System.out.println("�޸��ϴ�.(gas�ܷ�:" + gas + ")");
				gas -= 1;
				
				} else {
				System.out.println("����ϴ�.(gas�ܷ�:" + gas + ")");
				return; // �޼ҵ� ���� ����
			}
		}
	}
}
