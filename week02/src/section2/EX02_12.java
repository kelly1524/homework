package homework2;

public class EX02_12 {
public static void main(String[] args) {
	// 숫자 앞에 0이 붙으면 8진수라는 뜻
	// 0x로 하면 그 뒤의 46은 16진수인 것
	// 10진수로 바꿀 때 각 자리수에 진수의 1승, 2승 해준 다음에 그 해당 진수 곱하면 됨
	
	byte num1 = 0110; // 정수형 크기가 1byte인 저장 공간을 할당하고 거기에 num1로 이름을 붙인다. 그리고 그 안에 0110이라는 2진수로 초기화한다.
	short num2 = 0107; // 정수형 크기가 2byte인 저장 공간을 할당하고 거기에 num2로 이름을 붙인다. 그리고 그 안에 0107이라는 8진수로 초기화한다.
	int num3 = 0x46; // 정수형 크기가 4byte인 저장 공간을 할당하고 거기에 num3로 이름을 붙인다. 그리고 그 안에 0x46이라는 16진수로 초기화한다.
	long num4 = 69L; // 정수형 크기가 8byte인 저장 공간을 할당하고 거기에 num4로 이름을 붙인다. 그리고 그 안에 69L이라는 10진수로 초기화한다.
	
	System.out.println(num1); // num1 을 값으로서 사용한다. 그 안의 0110이라는 값을 가져와 8진수로 출력하고 줄바꿈한다.
	System.out.println(num2); // num2 을 값으로서 사용한다. 그 안의 30이라는 값을 가져와 8진수로 출력하고 줄바꿈한다.
	System.out.println(num3); // num3 을 값으로서 사용한다. 그 안의 40이라는 값을 가져와 16진수로 출력하고 줄바꿈한다.
	System.out.println(num4); // num4 을 값으로서 사용한다. 그 안의 50이라는 값을 가져와 10진수로 출력하고 줄바꿈한다.
}
}
