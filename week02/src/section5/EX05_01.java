package section5;

public class EX05_01 {
	public static void main(String[] args) {
		int sum = 0; // stack 4bytes 0 초기화
		
		for(int i = 0; i <= 10; i++) {
			sum +=i; // sum 값 불러와서 0 더하고 더한 값 저장하고 다시 불러와서 연산하고 저장하고 연산하고 저장하고 으아악
		}
	System.out.println("합 : " + sum); // 출력
	}
}
