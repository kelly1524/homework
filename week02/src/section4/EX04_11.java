package section4;

public class EX04_11 {
	public static void main(String[] args) {
		int num = 7;

		switch (num) { // num의 값이
		case 1: // 1이면
			System.out.println("num은 1입니다."); // 출력
			break; // 그리고 프로그램 종료
		case 7: // 7이면
			System.out.println("num은 7입니다."); // 출력
		default: // 이도저도 아니라면
			System.out.println("num은 1도 7도 아닙니다."); // 출력
		}
		
		// case 7과 default 가 둘 다 출력됨. break 가 없어서.
	}
}
