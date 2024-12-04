package homework2;

public class EX02_24 {
	public static void main(String[] args) {
		double pie = 3.14; 
		int pieInt = (int)pie; // double -> int 소수점 버려지고
		System.out.println(pieInt); // 3으로 출력
		
		// 실수형 범위 내일 경우 -> 소숫점 첫째자리까지 출력
		int num = 100;
		double numD = (double) num; // double은 소수점 15자리까지 표현. 그렇게 int를 형변환. 자동 형변환 가능
		float numF = (float) 100; // float는 소수점 6~7까지 정확하게 표현. int를 형변환. 표현 범위가 더 넓어 자동 형변환도 가능
		System.out.println(numD); // 형변환시 소숫점 첫째자리까지 출력 100.0
		System.out.println(numF); // 100.0
		
		// 실수형 범위 밖일 경우 --> 숫자가 너무 크거나 소숫점 자리수가 너무 크면 지수표기법을 이용하여 표현한다.
		int i = 99999999; // 10의 8승까지 표현 가능
		float f = (float) i;
		System.out.println(f); // E를 표현하여 
	}
}
