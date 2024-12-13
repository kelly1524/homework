package section11;

public class EX11_14 {
	public static void main(String[] args) {
		// ComputerRoom 클래스 생성
		// computer1, 2는 null로 기본값 넣어짐
//		System.out.println(cr.computer1); 확인 결과 null
		ComputerRoom cr = new ComputerRoom();
		cr.computer3 = new LZ(); // LZ 객체 참조  (Computer2 + LZ)
		cr.computer4 = new LZ();
		
		cr.allPowerOn(); // LZ에서 오버라이딩된 메서드가 호출된다.
		cr.allPowerOff();
	}
}
