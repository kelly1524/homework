package section12;

public class EX12_18 {
	public static void main(String[] args) {
		BluetoothMIC bm = new BluetoothMIC();
		
		bm.music();
		bm.sing();
		Microphone m = bm; // 인터페이스는 타입은 될 수 있다. 그냥 저장공간이라고 생각해.
		Speaker s = bm; // 인터페이스는 타입이 될 수 있다. Up Casting
		System.out.println(m);
		System.out.println(s);
		
		
	}
}
