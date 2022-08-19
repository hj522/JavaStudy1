package chapter02;

public class EscapeExample {
	public static void main(String[] args) {
		System.out.println("번호\t이름\t직업"); // [\t] 탭만큼 띄움
		System.out.println("행 단위 출력\n"); // [\n] 줄 바꿈
		System.out.println("행 단위 출력\n"); // [\n] 줄 바꿈
		System.out.println("우리는 \"개발자\" 입니다."); // [\"] "출력
		System.out.println("봄\\여름\\가을\\겨울"); // [\\] \출력
		
		String str = "나는 \"자바\"를 좋아합니다."; // 큰 따옴표 여러번 사용 불가. 중간에 이스케이프 문자 활용
		System.out.println(str);
	}
}
