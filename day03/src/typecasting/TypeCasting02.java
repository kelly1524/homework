package typecasting;
// 12번 : 자동 형변환

public class TypeCasting02 {
	public static void main(String[] args) {
		// 1) 작은 자료형에서 큰 자료형으로 변환
		// int -> long
		int intVal = 100;
		long result1 = intVal;
		System.out.println(result1);
		
		// int -> float
		float result2 = intVal;
		System.out.println(result2);
		
		double result3 = intVal;
		System.out.println(result3);
		
		// float -> double
		double result4 = result2;
		System.out.println(result4);
		
		// 2) 연산시에는 자동 형변환이 된다
		// 정수와 실수의 연산
		int intVal2 = 10;
		double doubleVal2 = 3.14;
		double result5 = intVal2 + doubleVal2;
		float result6 = (float)(intVal2 + doubleVal2); // intVal2 + (float) doubleVal2; 
		System.out.println(intVal2 + doubleVal2);
		
		// 3) 문자형('a')에서 정수형으로 변환
		char letter = 'a'; // a : 97
		int asciiVar = letter;
		System.out.println(letter);
		System.out.println(asciiVar);
		
		char letter2 = 'b'; // A : 65
		int asciiVar2 = letter2;
		System.out.println(letter2);
		System.out.println(asciiVar2);
		
		char letter3 = '가'; // 알고 싶으면 출력해보던가 검색해서 표 찾아보던가
		int asciiVar3 = letter3;
		System.out.println(letter3);
		System.out.println(asciiVar3);
		
	}
}
