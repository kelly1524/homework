package section5;

public class EX05_06 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		do { // 일단 do 안의 것을 먼저 실행하고 while 문의 i 조건을 판단하겠다.
			sum += i; 
			i++;
		} while (i <= 10);
		
		System.out.println("합 : " + sum);
	}
}
