package homework2;

public class EX02_17 {
	public static void main(String[] args) {
		int alphabetA = 'A'; // 4btyes 메모리 할당 int 타입에 맞게 해석
		int alphabetB = 'B';
		System.out.println(alphabetA);
		System.out.println(alphabetB);
		
		char alphabetC = 67; // 정수 -> char 강제 형변환 해야 함 다만 유니코드의 범위 내에서는 명시하지 않아도 컴파일러가 (char)을 입력해준다.
		System.out.println(alphabetC); // 값으로서 출력
		
	}
}
