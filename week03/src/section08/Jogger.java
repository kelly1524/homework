package homework;
// + EX08_03, EX08_04, EX08_05

public class Jogger {
	String name;
	public static void main(String[] args) {
		Jogger jogger = new Jogger(); // static 아닌 메서드를 호출할 거다
		// main method 가 먼저 만들어지고 아직 void run 이 안 만들어져서
		// 주소를 모르니까 클래스를 생성해서 그 안의 메서드를 찾아갈 수 있는
		// 주소값을 받을 공간을 먼저 만들어준다
		// 객체명.메서드명(); 로 호출
		jogger.run(); // jogger에 저장된 주소를 통해 run 호출
		jogger.name = "김나비"; // jogger에 저장된 주소를 통해 name을 김나비로 대입
		jogger.sayName(); // jogger의 sayName을 호출
		jogger.run(); // jogger의 run 재호출
	}
	void run() { // 리턴 값 x 매개변수 x 달리는 문구를 출력할 메서드
		System.out.println("run run run!");
	}
	
	void sayName() {
		System.out.println("제 이름은 " + name + "입니다."); // 이 때의 name 은 jogger 클래스의 변수 name이다
	}
	

}
