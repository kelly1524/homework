package homework2;

public class EX02_29 {
	public static void main(String[] args) {
		float f1 = 12345.67f;
		int i1 = (int) f1; // 소수점 버리게 됨
		System.out.println("[float -> int] f1의 값 : " + f1 + ",i1의 값 : " + i1); // 12345로 출력됨
		
		double d1 = 12345.678;
		int i2 = (int) d1; // 소수표현을 정수표현으로 하려면 강제 형변환해야 함 소숫점 데이터가 손실되기 때문애
		System.out.println("[float -> int] f1의 값 : " + d1 + ",i1의 값 : " + i2); // 12345로 출력됨
	}
}
