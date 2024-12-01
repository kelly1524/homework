package homework2;

public class EX02_23 {
	public static void main(String[] args) {
		double d1 = 1.0e100; // 1.0 x 10의 100승
		float f1 = (float)d1; // float 범위를 넘는 값을 float 로 4bytes 로 잘라서 강제 형변환
		System.out.println(f1); // 오버플로우 발생하여 infinity 출력
		
		double d2 = 1.0e-100; // 1.0 x 10 -100tmd
		float f2 = (float)d2; // 언더 플로우 발생하여 
		System.out.println(f2); // 0.0 출력
	}

}
