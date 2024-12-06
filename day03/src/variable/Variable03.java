package variable;
// 4번 : 변수 자료형 별 예시

public class Variable03 {
	public static void main(String[] args) {
		// 정수형 int 4bytes : -2,147,483,648 ~ 2,147,483,647 (32비트 정수)
		// 정수형 long 8bytes : -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 (64비트 정수)
		// 정수형은 자릿수가 중요
		int intVal = 2147483647;
		System.out.println(intVal);
//		long longVal = 2147483648;
		// L을 안 넣으면 정수의 기본형으로 인식함 그래서 범위 벗어난 걸로 인식 -> L 쓰자
//		System.out.println(longVal);

		
		
		// 실수형 double 8bytes : 16자리 소수점 이하까지 정확하게 표현
								// 더 높은 정밀도와 넓은 범위의 실수를 표현
		// 실수형 float 8bytes : 6자리 소수점 이하까지 정확하게 표현
								// 메모리를 더 적게 사용하여 정밀도가 낮아 계산 오차가 발생할 수 있음
		// 정밀도가 중요
		double doubleVal = 3.1415926535897935; // 16자리 숫자부터는 반올림 처리가 되어 정확도 낮아짐
		System.out.println(doubleVal);
		float floatVal = 3.1415926f;
		System.out.println(floatVal); // 6자리까지 정확히 나오고 7자리부터는 반올림 처리하여 정확도 낮아짐
		
		// 계산 오차 확인
		double doubleSum = 0.1 + 0.2; // 금융, 과학
		float floatSum = 0.1f + 0.2f; // 메모리가 제한된 경우, 정밀도가 필요하지 않은 경우
		System.out.println(doubleSum); // 더 많은 비트를 사용하기 때문에 금융, 천문학 쪽에서 사용한다
		System.out.println(floatSum); // 더 적은 비트를 사용하기 때문에 정확도가 낮다
		// 0.1 ~ 0.2 사이의 수는 무한대 --> 항상 최소한의 오차가 존재
		
		// 논리형 boolean : true, false -> JVM의 최적화에 따라 다르지만 최소 1bit가 필요하다
		boolean isJava = true;
		System.out.println("java 공부 중인가요? " + isJava); // 문자열 앞이나 뒤에 +가 있으면 항상 연결
		
		// 문자형 char : '' 작은 따옴표로 표현
		char grade = 'A';
		System.out.println("java 학점 : " + grade);
		
		// 문자열 String : "" 큰 따옴표로 표현
		String myName = "조은혜";
		System.out.println("제 이름은 " + myName + "입니다.");
		
	}
}
