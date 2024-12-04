package homework2;

public class EX02_20 {
	public static void main(String[] args) {
		String hi = "안녕하세요,"; // 참조 타입인 String 타입 heap 메모리에 공간 할당. hi 라는 참조 변수 Stack 에 메모리 할당
		// 리버럴 선언이므로 "안녕하세요," 라는 문자열은 String pool 에 저장된다. (heap) hi 에는 그것의 참조값이 담긴다.
		String niceToMeetYou = "만나서 반갑습니다."; // 위와 동일
		// 참조 타입 안의 공간에 있는 값은 실제 값으로 해석하지 않고 heap 메모리 위의 주소값으로 생각한다.
		System.out.println(hi); // hi 안의 참조값을 따라가 heap 메모리에 저장된 문자열 출력
		System.out.println(niceToMeetYou); // 위와 동일
	}
}
