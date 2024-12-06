package homework;

import java.util.Arrays;

public class EX06_13 {
	public static void main(String[] args) {
		// main method 호출한다
		// 지역 변수로 card 와 newCard stack 메모리에 생성
		// heap 메모리에 각 선언에 맞게 저장 공간 할당 및 값 대입
		// 그 주소값을 참조변수에 저장
		int[] card = {1, 6, 4, 5, 3, 2};
		int[] newCard = new int[card.length];
		// card의 0번 인덱스부터 복사. newCard의 0번 인덱스부터 복사. card의 길이만큼
		System.arraycopy(card, 0, newCard, 0, card.length);
		// 확인
		System.out.println("card 배열 : " + Arrays.toString(card));
		System.out.println("newCard 배열 : " + Arrays.toString(newCard));
	}
	
}
