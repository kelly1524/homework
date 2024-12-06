package section4;

import java.util.Scanner;

public class EX04_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Scanner 타입의 참조 변수 sc 를 stack 메모리에 생성하여 new가 heap 메모리에 Scanner (System.in)
		// 을 생성하면서 넘겨준 시작 주소값을 저장한다.
		System.out.println("나이를 입력하세요."); // 출력 메시지 작성. 이걸 안 쓰면 뭘 입력해야 할지 사용자는 모르니까
		
		int age = sc.nextInt(); // sc의 참조값을 읽어들여 heap 메모리의 위치에 접근해 그 안에 있는 nextInt() 메서드를 호출
		// 그럼 buffer에 저장된 정수 값을 스택 프레임 안에 저장하여 stack 메모리에 올라오면
		// 그 값을 stack 메모리에 할당된 age 라는 4bytes 저장 공간에 저장한다.
		// 메서드가 값을 운반하는 역할을 하는 건가
		if (age > 19) { // age에 저장된 값이 19보다 크다면 
			System.out.println("성인입니다."); // 성인입니다를 출력하고
		} // else 나 else if 가 없으니까 그 범위를 벗어나면 아무 동작도 하지 않고 끝난다.
		System.out.println("프로그램 종료"); // 마지막에 age의 조건과 관계없이 프로그램 종료 출력
	}
}
