package homework2;

public class EX02_09 {
	
	public static void main(String[] args) {
		int myAge = 20; // 정수형 int 타입 크기가 4bytes 인 저장 공간을 할당하는데 그 이름은 myAge 이며 그 안에 20이라는 값으로 초기화한다
		int yourAge = myAge; // 정수형 int 타입 크기가 4bytes 인 저장 공간을 할당하는데 그 이름은 yourAge이며 그 안에 myAge를 값으로서 사용하며 그 값을 복사해 저장한다.
		
		System.out.println(myAge); // myAge 의 저장 공간에 접근하여 그 안의 값을 꺼내와 출력하고 줄바꿈한다.
		System.out.println(yourAge); // yourAge 의 저장 공간에 접근하여 그 안의 값을 꺼내와 출력하고 줄바꿈한다.
		
	}

}
