package homework2;

public class Printf02 {
	public static void main(String[] args) {
		// 2-4
		
		// System 클래스 안의 out 안의 printf 메서드를 호출한다.
		// 소괄호 안의 큰 따옴표 내 문자열을 출력하되 큰따옴표 내의 형식 지정자에 맞추어 콘솔창에 출력하고 줄바꿈하지 않는다.
		// 첫번째 정수형 10진수 표현 형식지정자 %d에 1을 대입, 두번째 실수형 float 타입에 2.0을 대입, 세번째 문자열 형식 지정자에 각각 대입하여 출력하고 줄바꿈하지 않는다.
		// 이 때 %f는 float 타입이기 때문에 기본적으로 소숫점 6자리까지 출력된다.
		System.out.printf("%d는 첫 번째, %f는 두 번쨰, %s는 세 번째.", 1, 2.0, "셋");
	}

}
