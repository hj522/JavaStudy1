package Exercise;

public class Time {

	// �ʵ�
	private int hour;
	private int minute;
	private int second;
	
	// ������
	Time() {
		
	}

	Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		
	// �޼ҵ�
		
		if(hour > 0 && hour < 24) {
			this.hour = hour;
		} 

		
		if(minute > 0 && minute < 60) {
			this.minute = minute;
		}
		
		if(second > 0 && second < 60) {
			this.second = second;
		}
	}
	
	// �ν��Ͻ��� �ʵ尡 � ���� ���� �ִ��� Ȯ���� �� �ִ� �޼ҵ�
	public String toString() { // �ʵ��� �����͵��� ���ڿ��� ��ȯ
	 return String.format("%02d:%02d:%02d", hour, minute, second);
	}
}
