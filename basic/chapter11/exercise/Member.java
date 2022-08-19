package chapter11.exercise;

public class Member {
	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	// 코드 작성
	public String toString() {
		return String.format("%s: %s", id, name);
	}
}
