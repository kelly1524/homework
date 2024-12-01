package section4;

public class EX04_07 {
	public static void main(String[] args) {
		int favorite = 7;
		
		if(favorite < 5) { // 조건식 1 true 면 {} 내 실행문 실행
			System.out.println("좋아하는 숫자가 5보다 작습니다.");
		} else if(favorite > 5) { // 조건삭 1 false 이고 조건식 2 true 면 {} 내 실행문 실행
			System.out.println("좋아하는 숫자는 5보다 큽니다.");
		}else { // 모든 if가 false 이면 {} 내 실행문 실행
			System.out.println("좋아하는 숫자가 5입니다.");
		}
	}
}
