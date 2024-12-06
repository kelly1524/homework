package homework2;

public class PrintfPt {
	
	public static void main(String[] args) {
		// 2-6
		
		// System 클래스 안의 out 안의 printf 메서드를 호출한다.
		// 소괄호 안의 큰 따옴표 내 문자열을 출력하되 큰따옴표 내의 형식 지정자에 맞추어 콘솔창에 출력하고 줄바꿈하지 않는다.
		// %f : 실수를 float 타입으로 출력하도록 하는 형식 지정자 혹은 서식 문자
		// %와 f 사이에 . + 정수 옵션을 주면, 해당 소숫점자리 수까지 표현하여 출력한다.
		// 소숫점 첫번째까지 출력하고 줄바꿈
		System.out.printf("%.1f", 1.1234567);
		System.out.println();
		// 소숫점 두번째까지 출력하고 줄바꿈
		System.out.printf("%.2f", 1.1234567);
		System.out.println();
		// 소숫점 세번째까지 출력하고 줄바꿈
		System.out.printf("%.3f", 1.1234567);
		System.out.println();
		// 소숫점 네번째까지 출력하고 줄바꿈
		System.out.printf("%.4f", 1.1234567);
		System.out.println();
		// 소숫점 다섯번째까지 출력하고 줄바꿈
		System.out.printf("%.5f", 1.1234567);
		System.out.println();
	}

}
