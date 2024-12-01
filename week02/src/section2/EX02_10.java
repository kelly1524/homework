package homework2;

public class EX02_10 {
	
	public static void main(String[] args) {
		int myAge = 20; // 정수형 int 타입 크기가 4bytes 인 저장 공간을 할당하는데 그 이름은 myAge 이며 그 안에 20이라는 값으로 초기화한다.
		int yourAge = 30; // 정수형 int 타입 크기가 4bytes 인 저장 공간을 할당하는데 그 이름은 yourAge이며 그 안에 myAge를 값으로서 사용하며 그 값을 복사해 저장한다.
		int tempAge; // 정수형 int 타입 크기가 4bytes 인 저장 공간을 할당하는데 그 이름은 tempAge 이다. 초기화는 나중에 하겠다.
		
		tempAge = myAge; // tempAge 명의 저장 공간에 myAge의 값 20을 복사해서 초기화하겠다.
		myAge = yourAge; // myAge 명의 저장 공간에 yourAge의 값 30을 복사해서 저장하겠다.
		yourAge = tempAge; // yourAge 명의 저장 공간에 tempAge 의 값 20을 복사해서 저장하겠다.
		
		System.out.println(myAge); // 30
		System.out.println(yourAge); // 20
	}

}
