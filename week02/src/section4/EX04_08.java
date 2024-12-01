package section4;

public class EX04_08 {
	public static void main(String[] args) {
		int favorite = 7;
		
		if(favorite < 5) { // 조건식 1 true 면 {} 내 실행문 실행
			System.out.println("좋아하는 숫자가 5보다 작습니다.");
		} else if(favorite == 7) { // 조건식 1이 false 조건식 2가 true 면 {} 내 실행문 실행
			System.out.println("좋아하는 숫자는 7입니다.");
		}
	}
}
