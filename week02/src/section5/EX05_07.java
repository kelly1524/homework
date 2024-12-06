package section5;

public class EX05_07 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 != 0) { // 짝수가 아니라면
				continue; // 그냥 바로 증감식으로 가라. 아래 거 실행하지 말고
			}
			sum += i;
		}
		System.out.println("짝수 합 : " + sum); // for 밖에서 출력. 반복 X 한번만 결과 출력
	}
}
