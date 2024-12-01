package section4;

public class EX04_04 {
	public static void main(String[] args) {
		int a = 4; 
		int b = 10;
		// stack 메모리에 4bytes 짜리 크기의 int형 저장 공간이 2개 생성되었다!
		// 각각의 이름은 a 와 b 이고 각각 4와 10으로 초기화 되었다.
		
		if(a > b) { // a가 b보다 크다면!
			System.out.println("a가 b보다 큽니다."); // 이거 출력하고
		}else { // a가 b보다 작거나 같다면
			System.out.println("a가 b보다 작거나 같습니다."); // 얘 출력
		}
		// a는 b보다 크지 않으니까 else 로 분기가 넘어가고 거기에 true니까 해당 내의 실행문 실행
		// else 두번째 분기문만 실행
	}
}
