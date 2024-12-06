package print;
// 8번 : 출력 메서드 (printf)

public class PrintTest02 {
	public static void main(String[] args) {
		// 정수형
		int num1 = 200;
		System.out.printf("10진수 : %d", 100); // % 뒤에 , 뒤의 숫자를 대입해서 출력
//		System.out.printf("\n10진수 : %d", 100 + "\n"); 불가능
//		왜냐하면 100 + \n 을 %d 의 안에 넣지 못하기 때문이다
		System.out.printf("\n10진수 : %d", num1);
		System.out.printf("\n8진수 : %o", 8); // 10, 8로 나누었을 때 몫 1, 나머지 0. 한 자릿수가 0부터 7까지 표현가능
		System.out.printf("\n8진수 : %o", 377); // 8진수 571 값 출력
		System.out.printf("\n16진수 : %x", 0xff); // 16진수 값
		System.out.printf("\n16진수 : %x", 15); // 10 => a, 15 => f
		System.out.printf("\n16진수 : %x", 26); // 26/16 -> 몫 1, 나머지 10 = > a => 1a
		
		// 실수형
		System.out.printf("\n실수형 : %f", 3.1234567); // 소수점 이하 6자리까지 정확히 나옴 7자리 이상 되면 7번째 자리에서 반올림
		System.out.printf("\n실수형 소수점 2자리까지 : %.5f", 3.123456); // 만약에 잘리면 반올림
		
		// 문자형
		System.out.printf("\n문자형 : %c", 'a');
		System.out.printf("\n문자형 : %c", 'A');
		
		// 문자열
		System.out.printf("\n문자열 : %s", "Hello");
		String data = "hello, java";
		System.out.printf("\n문자열 : %.1s", data); // 문자열에서 .n 형태로 쓰게 되면 해당 자리수까지만 문자열이 잘려서 출력된다
	
		// 논리형
		System.out.printf("\n논리형 : %s", true); // 논리형의 값은 %s 가 받아준다
		
		// 복합 사용
		int age = 25;
		String name = "조은혜";
		double date = 11.25;
		boolean isStudy = true;
		// 순서대로 들어가니까 형식 지정자 잘 써주었는지 확인하기
		// 문자열에는 숫자 들어갈 수 있긴 함, 그런데 숫자 타입에는 문자 못 들어감
		System.out.printf("\n이름 : %s, 나이 : %d, 날짜 : %.2f, 공부 중 여부 : %s", name, age, date, isStudy);
//		System.out.printf("\n이름 : %s, 나이 : %d, 날짜 : %.2f, 공부 중 여부 : %s", age, name, date, isStudy);
		
	}
}
