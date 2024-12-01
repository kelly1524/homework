package section3;

public class EX03_07 {
	public static void main(String[] args) {
		char alphabetX = 'X'; // 유니코드 값 88을 alphabetX 라는 변수명의 2bytes stack 저장 공간에 저장한다.
		System.out.println(alphabetX++); // 88을 출력한 뒤에 +1 증가 -> 89 값을 저장 -> X
		System.out.println(alphabetX); // 89 출력됨 -> Y
	}
}
