package section5;

public class EX05_05 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		while(i <= 10) { // 이때 while문을 제어하는 제어 변수는 i니까 얘를 증감시켜서 while 문의 무한 루핑을 방지해야 함
			sum += i; // i가 10보다 작을 때까지 누적한다.
			i++; // i 증감
		}
		
		System.out.println("합 : " + sum);
	}
}
