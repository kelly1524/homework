package section12;

public class EX12_23 {
	public static void main(String[] args) {
		// 인터페이스의 추상메서드를 모두 구현하였다
		// 구현한 (오버라이딩한 모든 메서드들이 호출된다)
		System.out.println("----Tjmic----");
		Tjmic tj = new Tjmic();
		tj.connect();
		tj.music();
		tj.sing();
		
		System.out.println("\n---Tjmic 객체를 BluetoothMIC로 타입 변환");
		BluetoothMIC2 bm = tj;
		bm.connect();
		bm.music();
		bm.sing();
		
		System.out.println("\n---Tjmic 객체를 Microphone로 타입 변환");
		Microphone m = tj;
//		m.connect(); 얘네는 하위 클래스에 있기 때문에 슈퍼 클래스인 Mircophone이 호출하지 못한다
//		m.music(); // 얘네는 하위 클래스에 있기 때문에 슈퍼 클래스인 Mircophone이 호출하지 못한다
		m.sing(); 
		
		System.out.println("\n---Tjmic 객체를 Speaker로 타입 변환");
		Speaker s = tj;
//		s.connect(); 얘네는 하위 클래스에 있기 때문에 슈퍼 클래스인 Mircophone이 호출하지 못한다
		s.music(); 
//		s.sing(); // 얘네는 하위 클래스에 있기 때문에 슈퍼 클래스인 Mircophone이 호출하지 못한다
		
	}
}
