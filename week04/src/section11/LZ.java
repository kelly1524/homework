package section11;

public class LZ extends Computer2 {

	// Computer2 부모의 메서드 오버라이딩
	@Override
	void powerOn() {
		super.powerOn();
		System.out.println("사랑해요 LZ");
	}
}
