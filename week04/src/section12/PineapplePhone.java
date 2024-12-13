package section12;

public class PineapplePhone extends Phone {
	// 상속 받은 Phone의 메서드 오버라이딩
	@Override
	void openingLogo() {
		System.out.println("@@@");
	}
}
