package chapter02;

public class FloatDoubleExample {
	public static void main(String[] args) {
		//실수값 저장
		//float var1 = 3.14;  → 컴파일 에러. 자바가 기본 double로 인식했기 때문.
		float var2 = 3.14f;
		double var3 = 3.14;
		
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		
		
		//정밀도 테스트
		float var4 = 0.1234567890123456789f;
		double var5 = 0.1234567890123456789;
		
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5); // float타입보다 2배 정밀한 값으로 출력
		
		
		//e 사용하기
		double var6 = 3e6;
		float var7 = 3e6F;
		double var8 = 2e-3;
		System.out.println("var6: " + var6);
		System.out.println("var7: " + var7);
		System.out.println("var8: " + var8);
	
	}
}
