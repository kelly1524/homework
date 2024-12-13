package section11;

public class ComputerRoom {
	// 필드로 클래스타입을 갖는다
	// 필드에 기본값이 아닌 참조값을 갖는 것
	Samsong2 computer1;
	Samsong2 computer2;
	LZ computer3;
	LZ computer4;
	
//	void allPowerOn() {
//		computer1.powerOn();
//		computer2.powerOn();
//	}
//	
//	void allPowerOff() {
//		computer1.powerOff();
//		computer2.powerOff();
//	}
	
	void allPowerOn() {
		computer3.powerOn();
		computer4.powerOn();
	}
	
	void allPowerOff() {
		computer3.powerOff();
		computer4.powerOff();
	}
}
