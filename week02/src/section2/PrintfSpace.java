package homework2;

public class PrintfSpace {
	public static void main(String[] args) {
		// 2-5
		
		// System 클래스 안의 out 안의 printf 메서드를 호출한다.
		// 소괄호 안의 큰 따옴표 내 문자열을 출력하되 큰따옴표 내의 형식 지정자에 맞추어 콘솔창에 출력하고 줄바꿈하지 않는다.
		// %d : 정수를 10진수 형식으로 출력하도록 하는 형식 지정자 혹은 서식 문자
		System.out.printf("%d", 1);
		System.out.println();
		System.out.printf("%d", 12);
		System.out.println();
		System.out.printf("%d", 123);
		System.out.println();
		System.out.printf("%d", 1234);
		System.out.println();
		System.out.printf("%d", 12345);
		System.out.println();
	}
}
