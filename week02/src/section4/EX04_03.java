package section4;

public class EX04_03 {
	public static void main(String[] args) {
		int num = 5;
		// stack 메모리에 4bytes 크기의 정수 타입 int 공간 생성하고 그 이름 num으로 명명 후 5로 초기화

		if (num > 4) { // 만약에 num이 4보다 크다면
			System.out.println(num + "은(는) 4보다 큽니다."); // 얘 출력
		} else { // 아니면
			System.out.println(num + "은(는) 4보다 작습니다."); // 얘를 출력하고.

		// true 니까 첫번째 분기문에서 걸리고, 그 밑 esle 는 실행되지 않겠군
		}
	}
}
