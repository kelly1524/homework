package homework;

public class EX06_05 {
	public static void main(String[] args) {
		// 문자형 배열 heap 메모리에 생성
		// 값들을 저장
		// stack 메모리에서 그것을 참조
		char[] cards = {'1', 'L', 'O', '2', 'V', '3', 'E'};
		// 리버럴 방식으로 저장
		String myWord = "";
		// 원하는 문자를 받아놓을 변수 word 선언
		// 그 원하는 문자에 조건 달고
		// 그 원하는 문자를 myWord에 누적
		for(int i = 0; i < cards.length; i++) {
			int word = cards[i];
			if(word >= 65 && word <= 90) {
				myWord += (char)word;
			}
		}
		System.out.println("단어 : " + myWord);
		
	}
}
