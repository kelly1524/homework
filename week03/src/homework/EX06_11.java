package homework;

import java.util.Arrays;

public class EX06_11 {
	public static void main(String[] args) {
		// card 배열 생성
		// 그 card를 깊은 복사할 배열 생성. 크기는 card의 길이만큼 새롭게 생성한다
		int[] card = {1, 6, 4, 5, 3, 2};
		int[] newCard = new int[card.length];
		// 깊은 복사를 위해 원본의 값을 하나씩 꺼내어 새롭게 생성한 배열에 저장한다
		for(int i = 0; i < card.length; i++) {
			newCard[i] = card[i];
		}
		// 출력하면 같은 값이 나오는 걸 확인할 수 있다
		System.out.println("card 배열 : " + Arrays.toString(card));
		System.out.println("newCard 배열 : " + Arrays.toString(newCard));
	}
}
