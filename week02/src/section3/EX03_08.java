package section3;

public class EX03_08 {
	public static void main(String[] args) {
		boolean isHuman = false; // stack 메모리에 2bytes 크기의 공간을 할당. 그 공간 이름은 isHuamn, false 로 값 초기화
		System.out.println(!isHuman); // human을 논리 부정한 값인 true 가 출력. 저장은 안 하니까 초기화 값은 안 바뀜
		System.out.println(isHuman); // 그대로 false 로 출력. 
	}
}
