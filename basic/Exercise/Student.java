package Exercise;

public class Student extends Human {

	// �ʵ�
	String major;
	
	// ������
	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	
	// �޼ҵ�
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String getMajor() {
		return major;
	}
	
	public String toString() {
		return super.toString() + ", ����: " + this.major;
}
}