package homework2;

public class Section02 {
	public static void main(String[] args) {

		
		
		
		

		
		
		

		

		
		
		
		// 2-7
//		int studentAge; // 기본 타입인 정수형 int 타입의 저장 공간 변수를 선언한다. 변수 명은 studentAge 이다. 크기는 4bytes 로 랜덤하게 메모리에 할당된다.
//		studentAge = 20; // 그 저장 공간에 실제 값인 20을 저장한다.
//		
//		System.out.println(studentAge); // 콘솔 창에 println 메서드를 호출하여 그 안에 studentAge 변수명으로 된 저장 공간의 위치를 불러오며 그 안에 있는 값을 사용한다. 변수명을 값으로서 사용한다. 20 출력

		
		
		// 2-8
//		String myCity = "Seoul"; // 참조 타입인 문자열 타입의 저장 공간을 할당한다. 그 저장공간의 이름은 myCity 이다. 그곳에 "Seoul" 이라는 문자들을 나열하는데 리버럴 방식으로 선언한다.
//		
//		System.out.println("I am from " + myCity); // "I am from " 을 출력하는데 + 로 myCity의 값인 Seoul을 연결하여 출력하고 줄바꿈 한다.
		
		
		
		// 2-9
//		int myAge = 20; // 정수형 int 타입 크기가 4bytes 인 저장 공간을 할당하는데 그 이름은 myAge 이며 그 안에 20이라는 값을 저장한다.
//		int yourAge = myAge; // 정수형 int 타입 크기가 4bytes 인 저장 공간을 할당하는데 그 이름은 yourAge이며 그 안에 myAge를 값으로서 사용하며 그 값을 복사해 저장한다.
		
//		System.out.println(myAge); // myAge 의 저장 공간에 접근하여 그 안의 값을 꺼내와 출력하고 줄바꿈한다.
//		System.out.println(yourAge); // yourAge 의 저장 공간에 접근하여 그 안의 값을 꺼내와 출력하고 줄바꿈한다.
		
		
		
		// 2-10
//		int myAge = 20; // 정수형 int 타입 크기가 4bytes 인 저장 공간을 할당하는데 그 이름은 myAge 이며 그 안에 20이라는 값을 저장한다.
//		int yourAge = 30; // 정수형 int 타입 크기가 4bytes 인 저장 공간을 할당하는데 그 이름은 yourAge이며 그 안에 myAge를 값으로서 사용하며 그 값을 복사해 저장한다.
//		int tempAge; // 정수형 int 타입 크기가 4bytes 인 저장 공간을 할당하는데 그 이름은 tempAge 이다. 초기화는 나중에 하겠다.
		
//		tempAge = myAge; // tempAge 명의 저장 공간에 myAge의 값 20을 복사해서 초기화하겠다.
//		myAge = yourAge; // myAge 명의 저장 공간에 yourAge의 값 30을 복사해서 저장하겠다.
//		yourAge = tempAge; // yourAge 명의 저장 공간에 tempAge 의 값 20을 복사해서 저장하겠다.
//		
//		System.out.println(myAge); // 30
//		System.out.println(yourAge); // 20
		
		
		
		// 2-11
//		byte num1 = 20; // 정수형 크기가 1byte인 저장 공간을 할당하고 거기에 num1로 이름을 붙인다. 그리고 그 안에 20이라는 실제 값을 저장한다.
//		short num2 = 30; // 정수형 크기가 2byte인 저장 공간을 할당하고 거기에 num2로 이름을 붙인다. 그리고 그 안에 30이라는 실제 값을 저장한다.
//		int num3 = 40; // 정수형 크기가 4byte인 저장 공간을 할당하고 거기에 num3로 이름을 붙인다. 그리고 그 안에 40이라는 실제 값을 저장한다.
//		long num4 = 50; // 정수형 크기가 8byte인 저장 공간을 할당하고 거기에 num4로 이름을 붙인다. 그리고 그 안에 50이라는 실제 값을 저장한다.
//		
//		System.out.println(num1); // num1 을 값으로서 사용한다. 그 안의 20이라는 값을 가져와 출력하고 줄바꿈한다.
//		System.out.println(num2); // num2 을 값으로서 사용한다. 그 안의 30이라는 값을 가져와 출력하고 줄바꿈한다.
//		System.out.println(num3); // num3 을 값으로서 사용한다. 그 안의 40이라는 값을 가져와 출력하고 줄바꿈한다.
//		System.out.println(num4); // num4 을 값으로서 사용한다. 그 안의 50이라는 값을 가져와 출력하고 줄바꿈한다.
		
		
		
		// 2-12
		byte num1 = 0110; // 정수형 크기가 1byte인 저장 공간을 할당하고 거기에 num1로 이름을 붙인다. 그리고 그 안에 0110이라는 2진수를 저장한다.
		short num2 = 0107; // 정수형 크기가 2byte인 저장 공간을 할당하고 거기에 num2로 이름을 붙인다. 그리고 그 안에 0107이라는 8진수를 저장한다.
		int num3 = 0x46; // 정수형 크기가 4byte인 저장 공간을 할당하고 거기에 num3로 이름을 붙인다. 그리고 그 안에 0x46이라는 16진수를 저장한다.
		long num4 = 69L; // 정수형 크기가 8byte인 저장 공간을 할당하고 거기에 num4로 이름을 붙인다. 그리고 그 안에 69L이라는 10진수을 저장한다.
		
		System.out.println(num1); // num1 을 값으로서 사용한다. 그 안의 0110이라는 값을 가져와 10진수로 출력하고 줄바꿈한다.
		System.out.println(num2); // num2 을 값으로서 사용한다. 그 안의 30이라는 값을 가져와 10진수로 출력하고 줄바꿈한다.
		System.out.println(num3); // num3 을 값으로서 사용한다. 그 안의 40이라는 값을 가져와 10진수로 출력하고 줄바꿈한다.
		System.out.println(num4); // num4 을 값으로서 사용한다. 그 안의 50이라는 값을 가져와 10진수로 출력하고 줄바꿈한다.
		
		
		
		
		
		
		
		
		
		
		
		
	} // main

} // class
