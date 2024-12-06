package homework2;

import java.util.Scanner;

public class EX02_30 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // Scanner 타입의 데이터 참조 주소를 저장할 scan 변수를 stack 메모리에 할당
		// new 가 Scanner 클래스 타입의 데이터를 heap 메모리에 생성하고 그 시작주소값을 scan에 저장. 입력 관련된 것을 heap 메모리에 넣나봄
		
		System.out.println("나이를 입력해 주세요.");
		int age = scan.nextInt(); // 입력 받은 값을 띄어쓰기를 기준으로 buffer 로 붙어 받아와서 int age 의 stack 메모리에 그 값을 반환한다.
		System.out.printf("제 나이는 %d세 입니다.", age); // 형식에 맞게 출력. 입력된 값이 %d에 표현됨.
		
		scan.close();
	}
}
