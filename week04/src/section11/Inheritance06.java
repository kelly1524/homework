package section11;

class Parent{ // 부모 클래스
	public void display() {
		System.out.println("부모 클래스의 display() 메서드입니다.");
	}
}

class Child extends Parent{ // 자식 클래스
	@Override
	public void display() {
		System.out.println("자식 클래스의 display() 메서드입니다."); // 오버라이딩
	}
	// 오버로딩된 display() 메서드
	public void display(String str) {
		System.out.println(str);
	}
}
public class Inheritance06 {
	public static void main(String[] args) {
		Child ch = new Child();
		ch.display();
		ch.display("오버로딩된 display() 메서드입니다."); // 매개변수가 있을 경우 오버로딩된 display()메서드가 호출된다
	}
}
