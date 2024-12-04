package section3;

public class EX03_10 {
	public static void main(String[] args) {
		double num1 = 1.2345;
		// stack 메모리에 8bytes 크기의 저장 공간 할당. 이름은 num1 그 안에 1.2345로 초기화. 
		// double 식으로 값 읽을 거임
		int num2 = 6;
		// stack 메모리에 4bytes 크기의 저장 공간 할당
		// 이름은 num2 그 안에 6 저장. int 식으로 해석할 거
		System.out.println(num1 + num2); // 연산하는데 정수 + 실수는 실수형으로 표현된다. 7.2345
	}
}
