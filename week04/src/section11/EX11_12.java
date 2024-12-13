package section11;

public class EX11_12 {
	public static void main(String[] args) {
		// ComputerRoom 클래스 객체화 => 참조값을 갖는 두 필드 생성됨
		ComputerRoom cr = new ComputerRoom();
		// 그 필드 안에 Samsong2 객체의 참조값을 넣는다.
		cr.computer1 = new Samsong2();
		cr.computer2 = new Samsong2();
		
		// 필드 안의 메서드 호출되면 computer1에 있는 참조값을 통해 Samsong2에 접근한다.
		// computer2도 마찬가지.
		cr.allPowerOn();
		cr.allPowerOff();
		
		System.out.println();
		

	}
}
