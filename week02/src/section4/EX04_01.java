package section4;

public class EX04_01 {
	public static void main(String[] args) {
		int result = 0; // stack 메모리에 4bytes 크기 메모리 할당. int식으로 해석할 거고 저장 공간 명은 result. 0으로 초기화
		if(3 > 2) { // 만약에 3이 2보다 크다면
			result = 3; // result 에 3을 저장한다
		}
		System.out.println(result); // true 이기 때문에 3이 출력됨
		
	}
}
