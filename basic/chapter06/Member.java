package chapter06;

public class Member {
		//�ʵ� ����
		String name;
		String id;
		String password;
		int age;
	
		
// Default Constructor(�⺻ ������)
Member() {
	
}

//�Ű���(�Ű�����)�� �ִ� ������
Member(String n, int a) {
	name = n;
	age = a;
}

Member(String i, String pw) {
	id = i;
	password = pw;
}
}
