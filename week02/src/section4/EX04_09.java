package section4;

import java.util.Scanner;

public class EX04_09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요.");
		
		int age = sc.nextInt(); // 입력 받은 값을 nextInt가 buffer로 부터 가져와 stack 메모리에 생성된
		// 4bytes 크기의 age 공간에 반환한다.
		
		if(age > 19) { // 조건식 1 true일 때 {} 안의 실행문들 실행
			System.out.println("성인입니다.");
		}else if(age > 13){ // 조건식 1 false이고 조건식 2 true일 때 {} 안의 실행문들 실행
			System.out.println("청소년입니다.");
		}else if(age > 6){ // 조건식 1 false이고 조건식 2 true일 때 {} 안의 실행문들 실행
			System.out.println("어린이입니다.");
		}else { // 조건식이 모두 false이면 실행
			System.out.println("유아입니다.");
		}
	
	}
}
