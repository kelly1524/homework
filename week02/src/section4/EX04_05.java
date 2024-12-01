package section4;

public class EX04_05 {
	public static void main(String[] args) {
		int a = 4;
		int b = 10;
		int max = 0;
		
		// 4bytes 크기 int형 3개 stack 에 생성되고 그 안에 각각의 값으로 초기화
		
		if(a > b) { // a가 b보다 크다면 max 안에 a값을 넣고
			max = a;
		} else { // 그렇지 않다면 max 안에 b를 넣어라
			max = b;
		}
		// a와 b의 비교결과에 상관없이 이거를 출력해라
		System.out.println(a + "와(과) " + b + "중에 큰 수는 " + max + "입니다.");
	}
}
