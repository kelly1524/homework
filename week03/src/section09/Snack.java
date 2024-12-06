package section09;

public class Snack {
	int price; // 인스턴스 변수 선언, 필드이기 때문에 컴파일러가 자동으로 해당 타입의 기본값으로 초기화해준다. default로 선언되었다. 같은 패키지 내이면 참조 가능
	
	void info() { // default 같은 패키지 내이면 호출할 수 있음
		System.out.println("과자의 가격은 " + price + "원입니다.");
	}
}
