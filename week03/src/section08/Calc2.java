package homework;

public class Calc2 {
	public static void main(String[] args) {
		int[] nums = {100, 200}; // int 타입 배열 선언. 값과 크기를 아는 형태로 선언 및 생성
		Calc2 calc = new Calc2(); // 사용할 메서드의 클래스를 로드하여 주소값을 받는다
		calc.sum(nums); // 해당 주소값을 통해 sum 에 접근하여 nums 의 배열의 요소들의 총 합을
		// 출력한다
	}
	// 입력된 배열들의 요소들의 합을 출력해주는 메서드 
	void sum(int[] nums) {
		int result = 0; // 총 합계를 저장할 변수 선언
		for (int i = 0; i < nums.length; i++) { // 입력 받은 배열의 길이까지 반복
			result += nums[i]; // 각 자리의 값을 누적하여 result 에 저장
		}
		System.out.println("숫자들의 합은 " + result + "입니다."); // 누적된 result를
		// 이용하여 출력
	}
}
