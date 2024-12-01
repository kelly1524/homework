package section5;

public class EX05_02 {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i <= 100; i++){
			if(i % 2 == 0) { // sum 에 누적할 값에 조건을 단 것이다. i는 누적할 값이니까 짝수만 누적할 거임~
				sum+=i; // 절뚝 절뚝 홀수 일 때는 아무것도 안 한다~~ 오ㅑㅏ하하~
			}
		}
		
		System.out.println("합 : " + sum);
	}
}
