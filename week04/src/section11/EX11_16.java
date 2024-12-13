package section11;

//부모 클래스와 자식 클래스 생성 // 필드 X 메서드 X
class Animal2{}
class Pig2 extends Animal2{}

public class EX11_16 {
	public static void main(String[] args) {
		Pig2 p1 = new Pig2();
		Pig2 p2 = new Pig2();
		Animal2 a = p1; // Up Casting
		
		if(a instanceof Pig2) { // 객체인지 아닌지 확인하는 키워드
			System.out.println("객체 변수 a는 Pig 타입으로 생성된 객체입니다.");
		}
		
		if(a == p1) { // 참조값을 비교하는 연산자
			System.out.println("a와 p1은 같은 객체를 참조하고 있습니다.");
		}
		
		if(a != p2) { // 참조값을 비교하는 연산자. p2는 new로 생성된 다른 객체이다. 결국 p1과 p2는 다른 객체이다.
			System.out.println("a와 p2는 같은 객체를 참조하고 있지 않습니다.");
		}
	}
}
