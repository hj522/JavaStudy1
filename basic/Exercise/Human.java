package Exercise;

public class Human {
	
	// �ʵ�
	String name;
	int age;
	
	// ������
	public Human () {
	}
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// �޼ҵ�
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
				
	public int getAge() {
		return age;
	}
	
	public String toString() {
		return String.format("�̸�: " + name + ", ����: " + age);
		
	}
}
