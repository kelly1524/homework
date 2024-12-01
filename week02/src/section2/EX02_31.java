package homework2;

import java.util.Scanner;

public class EX02_31 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // Scanner 타입의 데이터 참조 주소를 저장할 scan 변수를 stack 메모리에 할당
		// new 가 Scanner 클래스 타입의 데이터를 heap 메모리에 생성하고 그 시작주소값을 scan에 저장. 입력 관련된 것을 heap 메모리에 넣나봄
		String name, address; // 변수들 선언
		int age;
		double weight;
		
		System.out.println("이름, 주소, 나이, 체중을 빈칸으로 구분하여 순서대로 입력하세요.");
		name = scan.next(); // 빈칸 구별하고 엔터키 소모 안 한 채로 문자열 값을 반환함
		age = scan.nextInt(); // int 값을 반환
		address  = scan.next(); // String 값을 반환
		weight = scan.nextDouble(); // double 값을 반환
		
		System.out.printf("당신의 이름은 %s입니다.\n", name); // 입력한 String 값을 반환 받아 그것을 출력
		System.out.printf("당신의 나이는 %d입니다.\n", age); // 입력한 값의 int 값으로 반환해 그것을 출력
		System.out.printf("당신의 주소는 %s입니다.\n", address); // 입력한 값을 String 으로 반환해 그것을 출력
		System.out.printf("당신의 몸무게는 %.1f입니다.\n", weight); // 입력한 값의 소숫점 첫째자리까지 표현 
	
	}

}
