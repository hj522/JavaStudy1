package Exercise;

public class Student extends Human {

	// 필드
	String major;
	
	// 생성자
	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	
	// 메소드
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String getMajor() {
		return major;
	}
	
	public String toString() {
		return super.toString() + ", 전공: " + this.major;
}
}