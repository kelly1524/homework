package section09;

public class EX09_02 {
	public static void main(String[] args) {
		Snack chip = new Snack(); // 같은 패키지 내의 Snack 클래스를 메모리에 로드한 뒤, 스택 프레임에 지역 변수로 stack 영역에 공간을 할당 받음. 그런 다음
		// new 키워드와 Snack(); 생성자로 메모리에 공간을 할당하고 인스턴스 변수를 초기화한다. 참조값은 chip에 저장됨
		chip.price = 2000; // 객체명으로 인스턴스 변수 price에 접근한다. 2000원으로 값 재할당
		chip.info(); // 객체명으로 info 메서드 호출
	}
}
