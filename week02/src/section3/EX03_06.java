package section3;

public class EX03_06 {
	public static void main(String[] args) {
		int x = 1; // 4bytes 크기의 저장 공간의 값을 int 타입으로 해석할 것이며 변수명은 x이고, 1으로 초기화한다
		System.out.println(x++); // x의 값 1을 출력한 다음에 +1 증가한 뒤 2를 저장
		System.out.println(x); // 저장된 값 2 출력
		System.out.println(++x); // 2를 +1 증감시킨 뒤 출력하고 그 값을 저장 ==> 3 출력
	}
}
