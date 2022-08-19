package chapter04;

public class Q4 {
	public static void main(String[] args) {
			
		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				if((x * 4) + (y * 5) == 60) {
					System.out.println("(" + x + ", " + y + ")");
	}
}
}
		}
}

/*
 * 중첩 for문 사용
 * 4x + 5y = 60의 모든 해를 구하고 (x, y) 형태로 출력
 * x와 y는 10 이하의 자연수
 * */
