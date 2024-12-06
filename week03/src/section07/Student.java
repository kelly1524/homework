package section07;

public class Student {
	static String schoolName = "코리아 고등학교"; // 정적 멤버 변수 선언. 클래스 로더가 해당 클래스가 언급될 때 메모리에 로드를 하고 함께 method 영역에 저장공간을 생성한다
	
	static void goToSchool() { // default 메서드. 같은 패키지 내에서만 호출이 가능하다.
		System.out.println("학교에 갑니다.");
	}
}
