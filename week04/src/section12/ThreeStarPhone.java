package section12;

public class ThreeStarPhone extends Phone {
	// 상속 받은 Phone 오버라이딩
	@Override
	void openingLogo() {
		System.out.println("★★★");
	}
}
