package section3;

public class EX03_12 {
	public static void main(String[] args) {
		int x = 10;
		int y = 1;
		
		y += x;
		System.out.println(y); // 1 + 10 = 11 출력됨

		y *= x;
		System.out.println(y);	// 11 * 10 = 110 출력됨
		
		y %= x;
		System.out.println(y); // 110 % 10 = 0 출력됨
	
	}
}
