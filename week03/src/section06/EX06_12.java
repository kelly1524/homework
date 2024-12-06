package homework;

import java.util.Arrays;

public class EX06_12 {
	public static void main(String[] args) {
		// card 라는 main의 지역 변수 공간 생성
		// 생성된 배열의 시작주소값을 참조
		// 값을 아는 상태에서 선언
		int[] card = {3, 1, 4, 5, 10};
		// 새로운 지역 변수 공간 생성
		// card를 Arrays의 메서드를 사용해서 깊은 복사를 함. card의 길이만큼
		int[] newCard = Arrays.copyOf(card, card.length);
		
		System.out.println("card 배열 : " + Arrays.toString(card));
		// 원본의 값을 변경
		card[1] = 10;
		// 복사된 값은 변하지 않는다
		System.out.println("card 배열 : " + Arrays.toString(card));
		System.out.println("newCard 배열 : " + Arrays.toString(newCard));
	}
}
