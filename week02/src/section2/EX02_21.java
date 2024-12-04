package homework2;

public class EX02_21 {
	public static void main(String[] args) {
		int num1 = 11; // 4bytes num1 이름 가진 저장공간 할당하고 11로 초기화
		double num2 = 3.14; // 8bytes num2 이름 가진 저장 공간 할당하고 3.14로 초기화
		double num1Change = (double) num1; // num1Change 이름 가진 8bytes 메모리 할당 후 num1을 8bytes가 되도록 0으로 채워넣고 그걸
		// double 타입의 저장 공간에 넣는다. 
		
		System.out.println("num1 : " + num1); // num1 과 num1의 값을 문자열로 연결하여 출력
		System.out.println("num1Change : " + num1Change); // 위와 동일
		System.out.println(num1 + num1Change); // 11 + 3.14 = 14.14
		System.out.println((int) 1.23); // 1 출력
	}
}
