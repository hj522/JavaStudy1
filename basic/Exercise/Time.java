package Exercise;

public class Time {

	// 필드
	private int hour;
	private int minute;
	private int second;
	
	// 생성자
	Time() {
		
	}

	Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		
	// 메소드
		
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
	
	// 인스턴스의 필드가 어떤 값을 갖고 있는지 확인할 수 있는 메소드
	public String toString() { // 필드의 데이터들을 문자열로 변환
	 return String.format("%02d:%02d:%02d", hour, minute, second);
	}
}
