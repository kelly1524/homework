package section4;

import java.util.Scanner;

public class EX04_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요.");
		
		int age = sc.nextInt(); // 입력 받은 값을 nextInt가 buffer로 부터 가져와 stack 메모리에 생성된
		// 4bytes 크기의 age 공간에 반환한다.
		
		if(age > 19) { // true일 때 {} 안의 실행문들 실행
			System.out.println("성인입니다.");
		}else { // false일 떄 {} 안의 실행문들 실행
			System.out.println("미성년자입니다.");
		}
	
	}
}
