package section11;

public class Samsong2 extends Computer2 {
	// 부모의 powerOn 메서드 오버라이드
	@Override
	void powerOn() {
		super.powerOn(); // 부모의 참조값을 통해 부모의 powerOn 메서드 호출
		System.out.println("아이 러브 삼송");
	}
}
