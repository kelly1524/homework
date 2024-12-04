package homework;

public class Calc3 {
	
	public static void main(String[] args) {
		// 1. 요소의 값을 아는 배열을 선언한다. heap 메모리에 생성된다.
		// 2. nums 가 그 참조값을 갖는다.
		int[] nums = {500, 200};
		// 3. calc3의 클래스가 로드된다. 거기에 sum 의 주소값을 가진 정보도 올라간다
		Calc3 calc = new Calc3();
		// 4. calc의 주소를 통해 sum에 접근하고 nums의 배열 시작주소값을 넘긴다
		System.out.println("숫자들의 합은 " + calc.sum(nums));
	}
	// int 타입을 반환하고, 배열을 입력 받아 그 배열들의 요소의 총합을 계산하는 메서드
	// 5. 호출된 sum 메서드. 스택 프레임이 생성되어 stack에 올라간다.
	// 6. 매개변수가 heap 메모리에 생성된 배열을 참조한다
	// 7. 그 참조를 가지고 실행한다.
	public int sum(int[] nums) {
		int result = 0; // 총합을 누적할 지역 변수 선언
		for (int i = 0; i < nums.length; i++) {
			result += nums[i]; // 그 지역변수에 참조값을 전달받은 nums 배열의 값을 꺼내어 누적
		}
		return result; // 누적된 값을 반환
	}
}
