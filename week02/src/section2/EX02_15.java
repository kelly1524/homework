package homework2;

public class EX02_15 {
	public static void main(String[] args) {
		char ga = '가'; // 2bytes 크기 메모리 할당. 이름은 ga. char 타입에 맞게 해석한다. '가'로 초기화
		char na = '나'; // 2bytes 크기 메모리 랜덤 할당. 이름은 na. char 타입에 맞게 데이터를 해석한다. '나'로 초기화
		char alphabetA = 'A'; // 2bytes 크기 메모리 랜덤 할당. 이름은 alphabetA. char 타입에 맞게 테이터를 해석한다.
		char alphabetB = 'B'; // 2bytes 크기 메모리 할당 이름은 alphabetB 타입에 맞게 데이터 해석
		
		System.out.println(ga);
		System.out.println(na);
		System.out.println(alphabetA + ", " + alphabetB);
	}

}
