package homework;

import java.util.Scanner;

public class EX06_16 {
	public static void main(String[] args) {
		// main method stack frame의 지역변수 lotto 공간 생성
		// heap 메모리에 이차원 배열 생성 후 참조값 lotto에 저장
		int[][] lotto = {{2, 6, 11, 33, 42, 44},
						{1, 6, 17, 22, 24, 33},
						{7, 16, 24, 33, 42, 44}, 
						{11, 27, 32, 34, 43, 46},
						{6, 17, 22, 24, 33, 41}};
		// Scanner 클래스의 객체 생성을 위한 지역 변수 sc stack에 생성
		// 객체 생성후 그 객체 참조값 저장됨
		Scanner sc = new Scanner(System.in);
		// 지역변수 String myNum, null String의 heap 메모리 주소값 저장됨
		String myNum = "";
		System.out.print("당첨 숫자 6개를 연속으로 입력해주세요. >>");
		// myNum 공간에 문자열을 반환 받음
		myNum = sc.next();
		// boolean 타입 지역 변수 생성, false로 초기화
		boolean isWin = false;
		// 로또번호 6개를 한줄로 받을 변수 잠깐 생성
		// 그 번호가 myNum과 같다면 isWin을 true로 바꾸어줌
		// 이건 isWin의 조건을 위한 임시 변수 lottoNumber
		for(int i = 0; i < lotto.length; i++) {
			String lottoNumber = "";
			for(int j = 0; j < lotto[i].length; j++) {
				lottoNumber += lotto[i][j];
			}
			
			if(myNum.equals(lottoNumber)) {
				isWin = true;
				break;
			}
		}
		// 조건에 의해 바뀐 isWin에 따라 당첨 유무 출력
		if(isWin) {
			System.out.println(myNum + " 번호 당첨!!");
		}else {
			System.out.println(myNum + " 번호는 당첨되지 못했습니다.");
		}
		
		sc.close();
		
	}
}
