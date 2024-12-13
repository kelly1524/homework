package section12;

public class ThreestarPhone2 implements Phone3 {
	// 인터페이스를 구현~
	// 파인애플 폰과 동일한 기능을 갖지만 세부 구현이 다르다
	int batteryCapacity = 35;
	boolean isOn = false;
	
	@Override
	public void powerOn() {
		if(batteryCapacity > 30) {
			System.out.println("★★★폰이 켜졌습니다 !! ★★★\n");
			isOn = true;
		}else {
			System.out.println("배터리가 부족합니다...");
		}
	}
	
	@Override
	public void powerOff() {
		System.out.println("★★★ 폰이 꺼졌습니다 !! ★★★\n");
		isOn = false;
	}

	public boolean isOn() {
		if(isOn) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public void watchUtube() {
		if(batteryCapacity > 15) {
			System.out.println(" --- U튜브 보는 중 --- ");
			batteryCapacity -= 10;
			System.out.println("현재 배터리는 ..." + batteryCapacity + "%\n");
		}else {
			System.out.println("배터리가 부족합니다...");
			powerOff();
		}
	}
	
	@Override
	public void charge() {
		if(batteryCapacity < Phone3.MAX_BATTER_CAPACITY - 20) {
			System.out.println(" --- 충전 중 --- ");
			batteryCapacity += 5;
			System.out.println("잔여 배터리 ..." + batteryCapacity + "%\n");
		}else {
			System.out.println("충전할 필요가 없습니다...");
			System.out.println("잔여 배터리..." + batteryCapacity + "%");

		}
	}
	
}
