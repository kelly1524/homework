package homework;
// + EX08_11

public class Person {
	
	public static void main(String[] args) {
		// static 이 아니기 때문에 클래스를 메모리에 로드하여 메모리 주소부터 부여한다
		// 그 주소값을 hong 에 넣고 그것을 통해 각 메서드에 접근한다
		Person hong = new Person();
		hong.introduce("홍길동", 20); // 이름은 홍길동이요, 20세이다 -> 그 정보에 맞게 출력
		hong.hello(); // hong 주소를 통해 hello 호출
	}

	// 반환 값 X 그냥 출력만 할 거라서
	// 매개변수로 이름과 나이 받고
	// 그에 맞게 출력하는 메서드
	void introduce(String name, int age) {
		System.out.println("제 이름은 " + name + "이고, 나이는 " + age + "세입니다.");
	}

	void hello() {
		System.out.println("안녕하세요.");
	}
}
