package print;
// 9번 : 서식 문자의 옵션 (printf)

public class PrintTest03 {
	public static void main(String[] args) {
		System.out.println("======================================");
		// 기본 형식 지정자
		System.out.printf("%s %s", "hello", true);
		System.out.printf("\n%d %f", 2024, 11.123456);
		System.out.printf("\n%c", 'a');
		
		// 자리수를 지정하여 출력
		System.out.printf("\n%-5s %05d", "java",1);
		System.out.printf("\n%-10s%d\n","안녕하세요", 500);
		System.out.printf("%-10.2s","조은혜");
		System.out.println("\n======================================");
		
		// 정렬과 가격 출력
		System.out.printf("\n%-5s\t\t%5d원", "꼬북칩", 2500);
		System.out.printf("\n%-5s\t\t%5d원", "누네띠네", 3500);
		System.out.printf("\n%-5s\t\t%5d원", "껌", 500);
		
	}
}
