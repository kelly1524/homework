package homework;

public class MidTerm {
	// 1. 메인 메서드 Stack 에 Stack Frame 생성
	public static void main(String[] args) {
		// studentA와 studentB 배열을 각각 힙 메모리에 생성
		// 주소값을 참조변수에 전달
		int[] studentA = {97, 53};
		int[] studentB = {95, 66};
		// class MidTerm 도 heap 메모리에 생성
		MidTerm mid = new MidTerm();
		// sumA와 sumB를 Stack 에 생성하고 그 안에 반환값 저장 예정
		// mid 의 score 메서드에 접근. 배열의 참조 주소값을 전달하여 그 배열을 통해
		// 합계 계산된 값 변수에 전달 받음
		int sumA = mid.score(studentA);
		int sumB = mid.score(studentB);
		// 그 값을 비교하여 조건에 맞게 출력
		if(sumA > sumB) {
			System.out.println("A학생의 중간고사 총점이 더 높습니다.");
		}else if(sumA < sumB) {
			System.out.println("B학생의 중간고사 총점이 더 높습니다.");
		}else {
			System.out.println("두 학생의 중간고사 총점이 같습니다.");
		}
	}
	// 전달받은 참조값을 통해 기능 실행
public int score(int[] scores) {
	int result = 0;
	for(int i = 0; i < scores.length; i++) {
		result += scores[i];
	}
	return result;
}
}
