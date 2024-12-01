package homework2;

public class EX02_16 {
	public static void main(String[] args) {
		int ga = '가'; // 4bytes 크기 메모리 할당. 이름은 ga. int 타입에 맞게 해석한다.
		int na = '나'; // 4bytes 크기 메모리 랜덤 할당. 이름은 na. int 타입에 맞게 데이터를 해석한다.
		int alphabetA = 'A'; // 4bytes 크기 메모리 랜덤 할당. 이름은 alphabetA. int 타입에 맞게 테이터를 해석한다.
		int alphabetB = 'B'; // 4bytes 크기 메모리 할당 이름은 int 타입에 맞게 데이터 해석
		// 유니코드
		// 유니코드 값으로 출력되는 것을 확인할 수 있다.
		System.out.println(ga);
		System.out.println(na);
		System.out.println(alphabetA + ", " + alphabetB);
	}
}
