package section11;

// 부모 클래스와 자식 클래스 생성 // 필드 X 메서드 X
class Animal{}
class Pig extends Animal{}
class Cow extends Animal{}

class Farm{
	void sound(Animal animal) { // super class로 매개변수 설정함 -> Up Casting됨
		if(animal instanceof Pig) { // 만약에 그 Up Casting 된 객체가 Pig의 객체라면
			System.out.println("꿀꿀"); // 꿀꿀 출력
		}else { // 아니라면
			System.out.println("음메"); // 음메 출력
		}
	}
}

public class EX11_15 {
	public static void main(String[] args) {
		Farm f = new Farm();
		Pig p = new Pig();
		Cow c = new Cow();
		f.sound(p); // Animal로 Up Casting된 p는 Pig의 객체니까 꿀꿀 출력
		f.sound(c); // 음메 출력
	}
}
