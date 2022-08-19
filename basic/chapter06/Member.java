package chapter06;

public class Member {
		//필드 선언
		String name;
		String id;
		String password;
		int age;
	
		
// Default Constructor(기본 생성자)
Member() {
	
}

//매개값(매개변수)이 있는 생성자
Member(String n, int a) {
	name = n;
	age = a;
}

Member(String i, String pw) {
	id = i;
	password = pw;
}
}
