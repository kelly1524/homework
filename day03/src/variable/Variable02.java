package variable;
// 2번 : 변수 명 선언시 주의사항

public class Variable02 {

	public static void main(String[] args) {
//		문자부터 시작한다
//		int 1num = 10; 숫자부터 시작시 오류 발생
		int n1m = 10;
		int num1 = 10;
		
//		특수문자를 쓸 수 없다 (단, _와 $는 가능)
//		int !@$! = 10;
		int _a = 10; // 가능하지만 웬만하면 문자부터 시작
		int a$b_ = 10;
//		int a$b% = 10; % 사용 불가능
		System.out.println(a$b_);

//		공백을 사용할 수 없다 (카멜 표기법이나, 스네이크 표기법 (_) 등을 활용한다)
//		int num 10 = 10;
		int myAge = 10; // 카멜 표기법 : 첫단어 소문자로 시작, 단어가 바뀔 때 대문자 (변수명, 메소드 명 작성시)
		int my_age = 10; // 스네이크 표기법 : 첫단어 소문자로 시작, 단어가 바뀔 때 언더바로 연결 (상수 작성시)
		int MyAge = 10; // 파스칼 표기법 : 첫단어 대문자로 시작, 단어가 바뀔 때 첫 문자 대문자로 (클래스 명 작성시)

//		키워드(예약어)를 사용할 수 없다 (주황색으로 표현된 것
//		int int = 10;
//		int for = 10;
		
//		되도록 소문자로 시작한다 (대소문자를 구분한다) 왜냐하면 상수를 대문자로 쓰기 때문에 구별을 위해 변수는 소문자로 작성
		int ABC = 10;
		int abc = 20;
		System.out.println(ABC);
		System.out.println(abc);
		
	}
	
}
