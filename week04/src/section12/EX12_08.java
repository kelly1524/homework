package section12;

public class EX12_08 {
	public static void main(String[] args) {
		// 각각 오버라이딩된 메서드가 호출된다
		PineapplePhone pp = new PineapplePhone();
		pp.powerOn();
		pp.powerOff();
		
		System.out.println();
		// 부모 타입으로 Up Casting하여 참조 변수에 자식 객체의 번지를 저장한다
		Phone tp = new ThreeStarPhone();
		tp.powerOn();
		tp.powerOff();
	}
}
