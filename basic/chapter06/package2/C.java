package chapter06.package2;

import chapter06.package1.A;

public class C {
	public C() {
		A a = new A();
		a.field1 = 1; // (o)
		a.field2 = 1; // (x) default 필드 접근 불가 - 컴파일 에러
		a.field3 = 1; // (x) private 필드 접근 불가 - 컴파일 에러
		
		a.method1(); // (o)
		a.method2(); // (x) default 필드 접근 불가 - 컴파일 에러
		a.method3(); // (x) private 필드 접근 불가 - 컴파일 에러
	}
}
