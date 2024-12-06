package section07;

public class Student2 {
	static String schoolName = "코리아 고등학교"; // 정적 멤버 변수 선언. 클래스 로더가 해당 클래스가 언급될 때 메모리에 로드를 하고 함께 method 영역에 저장공간을 생성한다
	String studentName;
	static void goToSchool() { // default 메서드. 같은 패키지 내에서만 호출이 가능하다.
		System.out.println("오늘은 학교에 가는 날입니다.");
	}
	
	void hello() { // default인 인스턴스 메서드 선언. 객체를 생성해야만 호출할 수 있다
		System.out.println("안녕하세요, 제 이름은 " + studentName + "입니다."); // 자기 인스턴스에서 메서드 호출한 거라 this 안 써줘도 되지만 매개변수와 구별 위해 붙여준다
	}
}
