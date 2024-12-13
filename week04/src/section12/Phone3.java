package section12;

public interface Phone3 {
	// 인터페이스에는 상수와 추상메서드만 들어갈 수 있다
	// 하지만 jdk 버전이 업데이트 되면서 private, static, 도 구현할 수 있게 되었다
	public static final int MAX_BATTER_CAPACITY = 100;
	abstract void powerOn();
	abstract boolean isOn();
	abstract void watchUtube();
	abstract void powerOff();
	abstract void charge();
	
}
