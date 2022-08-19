package chapter01;

public class practice1 {
	public static void main(String[] args) {
		int hour = 3;
		int minute = 3;
		System.out.println (hour + "시" + minute + "분");
		int totalMinute = hour * 60 + minute;
		System.out.println (totalMinute + "분");
		int totalSecond = totalMinute * 60;
		System.out.println (totalSecond + "초");
	}
}
