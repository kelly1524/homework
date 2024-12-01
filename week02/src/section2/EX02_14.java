package homework2;

public class EX02_14 {
	public static void main(String[] args) {
	double pieDouble = 3.141592653589793; // 메모리 크기 8bytes 할당. double 타입에 맞게 값을 해석. 그 안에 3.14~ 초기화
	float pieFloat = 3.141592653589793f; // 메모리 크기 4bytes 할당. flaot 타입에 맞게 값을 해석. 그 안에 값 초기화
	
	System.out.println("double  : " + pieDouble); // 변수를 값으로서 사용하여 출력 // 소숫점 15자리까지
	System.out.println("float : " + pieFloat); // 변수를 값으로서 사용하여 출력. 소숫점 7자리까지
	}
}
