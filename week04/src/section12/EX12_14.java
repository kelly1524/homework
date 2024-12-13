package section12;

public class EX12_14 {
	public static void main(String[] args) {
		// 지민이라는 객체가  pineapplephone의 객체를 참조하여 폰을 갖게 된다
		Person jimin = new Person(new PineapplePhone2());
		// 파인애플 폰이 켜진다!
		jimin.turnOnPhone();
		// 파인애플 폰으로 유튜브를 본다.. -10
		// 그리고 3일 떄 한번 충전한다
		for (int i = 1; i < 6; i++) {
			jimin.wathUtube();
			if (i % 3 == 0) {
				jimin.chargePhone();
			}
		}
		// 이번엔 새 폰을 샀다!
		// 지민이의 Phone 저장 공간이 쓰리스타 폰을 새롭게 참조한다
		jimin.buyNewPhone(new ThreestarPhone2());
		jimin.turnOnPhone();
		for (int i = 1; i < 5; i++) {
			jimin.wathUtube();
			if (i % 3 == 0) {
				jimin.chargePhone();
			}
		}

	}
}
