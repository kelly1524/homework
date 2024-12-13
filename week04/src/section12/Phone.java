package section12;

public abstract class Phone {
	abstract void openingLogo(); // 일단 핸드폰이 켜지긴 하는데
	// 이 추상클래스를 상속 받는 자식 클래스들에게 알아서 오버라이딩 하라고 위임
	
	void powerOn() {
		openingLogo(); // 각 자식 클래스가 오버라이딩 한 메서드가 호출된다.
		System.out.println("핸드폰이 켜집니다.");
	}
	
	void powerOff() {
		openingLogo();
		System.out.println("핸드폰이 꺼집니다.");
	}
}
