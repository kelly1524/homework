package section12;

public class Tjmic implements BluetoothMIC2 {
	// Microphone과 Speaker를 구현하는 BluetoothMIC2 인터페이스를 구현하는 Tjmic
	// 그러므로 그 상위에 있는 모든 추상 메서드를 구현해야 한다
	// 각각의 인터페이스를 나누면 필요한 것만 골라서 구현할 수 있다.
	@Override
	public void connect() {
		System.out.println("핸드폰과 블루투스 연결이 되었습니다.");
	}

	@Override
	public void music() {
		System.out.println("마이크에 장착된 스피커로 반주가 나옵니다.");
	}

	@Override
	public void sing() {
		System.out.println("마이크에 대고 노래를 부릅니다.");
	}
}
