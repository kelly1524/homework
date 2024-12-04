package homework2;

public class EX02_27 {
	public static void main(String[] args) {
		int i = 10;
		byte b = (byte)i; // 4바이트 10을 1바이트 10으로 강제 형변환 -> byte 표현 범위 내라서 제대로 출력됨
		System.out.println("[int -> byte] i의 값 : " + i + " b의 값 : " + b); // 10. 10
		
		int j = 1000;
		byte c = (byte) j; // 4바이트 1000을 1바이트 1000으로 강제 형변환 -> 오버플로우 발생하여 쓰레기값 저장됨
		System.out.println("[int -> byte] j의 값 : " + i + " c의 값 : " + b); // 쓰레기값이 출력된다
	}
}
