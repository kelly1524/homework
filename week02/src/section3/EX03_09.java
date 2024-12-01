package section3;

public class EX03_09 {
	public static void main(String[] args) {
		int x = 100; // stack 메모리에 4bytes 크기의 공간을 할당하고 그 이름을 x라고 명명한 뒤 100이라는 값으로 초기화한다
		int y = 200; // stack 메모리에 4bytes 크기의 공간을 할당하고 그 이름을 y라고 명명한 뒤 200이라는 값으로 초기화한다
		
		System.out.println(x+y); // 덧셈 연산 --> 300
		System.out.println(x-y); // 뺄셈 연산 --> -100
		System.out.println(x*y); // 곱셈 연산 --> 20000
		System.out.println(x/y); // 나눗셈 연산 --> 0 
		System.out.println(x%y); // 나머지 연산 --> 100
	}
}
