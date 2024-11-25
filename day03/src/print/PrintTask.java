package print;
// 10번 : 실습 

public class PrintTask {
	public static void main(String[] args) {
		// 1. printf 를 사용해서 형식에 맞게 출력하기 (printf 한번만 사용) (변수명과 자료형 생각)
		// 이름 : 본인 이름
		// 나이 : 본인 나이
		// 취미 : 취미
		// 키 : 실수형 2자리까지
		// 몸무게 : 실수형 3자리까지
		
		// 1) 변수를 선언하고 값을 초기화한다
		// 2) printf 메소드를 사용하여 서식 문자에 맞게 지정하고 이스케이프문자로 출력 형태를 맞춘다
		
		String name = "조은혜", hobby = "음악 듣기";
		int age = 25;
		double height = 165.6, weight = 56;
		// -> 같은 것끼리 묶어주기
		System.out.println("==========1번==========\n");

		System.out.printf("이름 : %s\n나이 : %d\n취미 : %s\n키 : %.2f\n몸무게 : %.3f",
				name, age, hobby, height, weight);
	
		
		// 2. 10진수의 값 255를 8진수, 16진수, 10진수로 각각 출력하기
		System.out.println("\n\n==========2번==========");

		int val1 = 255;
		System.out.printf("\n10진수 값 : %d, 8진수 값 : %o, 16진수 값 : %x", val1, val1, val1);
		
		// 3. 상품 정보를 println(-)과 printf(나머지)를 사용하여 아래 형식으로 출력하기
		// 각 자리수는 5자리로 정렬, tab 키 2번 사용
		
		System.out.println("\n\n==========3번==========\n");
		System.out.println("-----------------------");
		System.out.printf("%-5s\t\t%5s", "상품명","가격");
		System.out.println("\n-----------------------");
		System.out.printf("%-5s\t\t%5d원", "메로나",1500);
		System.out.printf("\n%-5s\t\t%5d원", "누네띠네",1200);
		System.out.printf("\n%-5s\t\t%5d원", "꼬북칩",2000);
		System.out.printf("\n%-5s\t\t%5d원", "초코파이",3000);

		
		System.out.println("\n-----------------------");
		
		// 4. 봄여름가을겨울을 아래와 같이 출력하기 (출력문 한번만)
		System.out.println("\n==========4번==========\n");
		System.out.printf("봄\n\t\t여름\n\t가을\n\t\t겨울");
		
	}
}
