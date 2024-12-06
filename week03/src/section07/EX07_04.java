package section07;

class Cat1 { // EX07_04 클래스 안에 Cat default 클래스 선언, 같은 패키지 내에 같은 이름의 클래스 불가. Cat1으로 명명
	
	
}

public class EX07_04 { // class가 한 파일에 여러개 존재할 때, public 이 앞에 붙은 클래스가 대표 클래스다. 그 클래스에서 메인 메서드를 찾는다
	

	public static void main(String[] args) {
		// 같은 패키지 내에서 Cat 객체 생성하기
		Cat1 c = new Cat1();
	}
}
