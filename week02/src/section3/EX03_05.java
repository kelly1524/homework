package section3;

public class EX03_05 {
	public static void main(String[] args) {
		int num = 30; // 4bytes 정수형 int 타입 저장 공간 num을 30으로 초기화
		System.out.println(++num); // +1 먼저 증감한 뒤 31 값 출력
		System.out.println(num); // 31 출력됨
		
		System.out.println(num++); // 31 출력한 뒤 1 증가시켜 32로 저장
		System.out.println(num); // 32 출력됨
	}
}
