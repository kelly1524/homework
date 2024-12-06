package section3;

public class EX03_01 {
	public static void main(String[] args) {
		int x = 100; // stack 이라는 저장 공간에 4btyes의 크기 메모리를 할당한 뒤 그 공간의 이름을 x라고 붙인 뒤, 100이라는 값으로 초기화된다
		int resultPlus = +x;
		int resultMinus = -x;
		
		System.out.println(resultPlus); // 100 출력
		System.out.println(resultMinus); // -100 출력
	}
}
