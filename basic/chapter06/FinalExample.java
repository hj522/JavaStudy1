package chapter06;

public class FinalExample {

	final String str; // final - 한번 값이 결정되면 변하지 않음
	
	public FinalExample(String str) {
		this.str = str;
	}
	
	
	public static void main(String[] args) {
		final String s = null; // 초기값 null이 최종값이 된다
		s = "b";
	}
}
