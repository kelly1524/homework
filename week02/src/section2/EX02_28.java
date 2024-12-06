package homework2;

public class EX02_28 {
	public static void main(String[] args) {
		double d1 = 1.1234;
		float f1 = (float) d1; // 8바이트 d1을 4바이트 f1으로 강제 형변환. 하지만 소숫점이 5자리보다 작으니까 정밀도에 영향 X

		System.out.println("[double -> float] d1의 값 : " + d1 + ", f1의 값 : " + f1); // 1.1234 제대로 출력
		
		double d2 = 1.0e-50; // 1.0 10의 -50승
		float f2 = (float) d2; // 4바이트로 표현할 수 있는 범위를 넘어가게 된다. 언더플로우 발생
		System.out.println("[double -> float] d1의 값 : " + d2 + ", f1의 값 : " + f2); // 0.0이 출력된다
		
		double d3 = 1.0e100;
		float f3 = (float) d3; // 10의 100승. 오버플로우 발생. infinity
		System.out.println("[double -> float] d1의 값 : " + d3 + ", f1의 값 : " + f3);
		
		double d4 = 9.123456789;
		float f4 = (float) d4; // 소숫점 5~6번째까지 정확하게 표현 하능한데 그 범위를 넘어가서 7번째에서 반올림해서 표현한다.
		System.out.println("[double -> float] d1의 값 : " + d4 + ", f1의 값 : " + f4); // 9.123457
	}
}
