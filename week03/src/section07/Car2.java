package section07;

public class Car2 {
	int wheel; // 인스턴스 변수 wheel 생성. 바퀴의 정보값을 담을 겁니다
	
	void ride() { // 리턴값을 안 받고 default 로 ride 선언. 같은 패키지 내에서만 호출 가능하다
		// Car2를 인스턴스화해야 호출할 수 있다
		System.out.println("달립니다.");
		System.out.println("씽씽씽");
	}
}
