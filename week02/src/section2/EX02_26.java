package homework2;

public class EX02_26 {
	public static void main(String[] args) {
		int i = 100;
		char c = 'a';
		int j = c; // a 의 유니 코드 값을 j에 초기화. 유니코드는 0부터 127까지의 숫자이기 때문에 데이터 손실이 없어 정수형에 바로 자동 형변환
		double d = i; // i는 100. double은 부동소숫점 방식으로 숫자를 표현하기 때문에 표현 범위가 int 보다 더 넓어
		// 데이터의 손실이 없기 때문에 컴파일러가 자동으로 () 연산자 붙여줌
		
		System.out.println("int형 변수 j의 값 : " + j); // 97
		System.out.println("double형 변수 d의 값 : " + d); // 100.0 왜 한 자릿수까지 표현되지?
		// --> 필요없는 소수점은 표시하지 않지만 double 실수형이라는 것을 표현하기 때문에 .0만 붙여준 것. 표현해야 한다면 15번째까지 표현한다
	}	
}
