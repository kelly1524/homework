package section12;

public class BluetoothMIC implements Microphone, Speaker {
	// 다중 인터페이스 구현
	// 각각이 지닌 추상 메서드를 모두 구현해야 함
	// 그게 싫다면 인터페이스에서 접근제한자를 private static 으로 하여 선택적으로 구현해주면 됨
	@Override
	public void music() {
		System.out.println("마이크에 장착된 스피커로 반주가 나옵니다.");
	}
	@Override
	public void sing() {
		System.out.println("마이크에 대고 노래를 부릅니다.");
	}
}
