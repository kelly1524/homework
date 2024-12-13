package section11;

class Animal3{
	void cry() {} // 구현하지 않은 메서드
}
class Pig3 extends Animal3{ // 상속
	// 부모 클래스 오버라이딩
	@Override
	void cry() {
		System.out.println("꿀꿀");
	}
	
}

class Cow3 extends Animal3{
	// 부모 클래스 오버라이딩
	@Override
	void cry() {
		System.out.println("음메");
	}
}

class Farm3{
	void sound(Animal3 animal) { // super class로 매개변수 설정함 -> Up Casting됨
		animal.cry(); // 각 animal로 Up Casting되어 들어온 객체의 참조값을 통해 오버라이딩 된 메서드 호출
	}
}
public class EX11_17 {
	public static void main(String[] args) {
		Farm f = new Farm();
		Pig p = new Pig();
		Cow c = new Cow();
		f.sound(p); // 오버라이딩된 메서드가 호출된다.
		f.sound(c);
	}
}
