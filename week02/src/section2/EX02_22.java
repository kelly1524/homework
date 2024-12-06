package homework2;

public class EX02_22 {
	public static void main(String[] args) {
		int i1 = 10; // int 변수 선언 후 10으로 초기화
		byte b1 = (byte)i1; // i1의 4bytes 크기를 1byte 로 강제로 잘라버리고 b1 안에 초기화한다.
		System.out.println(b1); // 10 byte 표현 크기 내이기 때문에 10으로 정상적으로 출력
		
		int i2 = 128;
		byte b2 = (byte) i2; // byte 는 -128~127 이기 때문에 강제 형변환 하면 오버플로우 되어 최솟값인 -128이 출력된다.
		System.out.println(b2); // -128
	}
}
