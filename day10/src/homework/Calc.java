package homework;

public class Calc {
	public static void main(String[] args) {
		Calc calc = new Calc(); // sum 메서드를 사용하기 위해
		// 클래스를 로드해준다. 그럼 그 클래스의 참조값을 저장한 calc 변수를 통해
		// sum에 접근할 수 있다.
		calc.sum(5, 3); // sum을 호출한다. 인수로 5와 3을 넣는다.
		// sum의 매개변수에 5와 3이 저장되고, 값으로 사용되어 출력된다
		calc.sum(10, 7); // 위와 동일하다
	}
	// 리턴 값 없고 입력 받은 두 매개 변수의 합을 구하는 메서드
	// 그리고 형식에 맞게 출력해주는 기능을 한다
	void sum(int num1, int num2) {
		System.out.println("두 수의 합은 " + (num1 + num2) + "입니다.");
	}
}
