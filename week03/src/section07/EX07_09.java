package section07;

public class EX07_09 {
	public static void main(String[] args) {
		Car2 c = new Car2(); // 같은 패키지 내의 Car2를 인스턴스화하여 c에 참조값 전달
		c.ride(); // c를 통해 같은 패키지 내의 default로 선언된 ride의 메서드에 접근하여 호출
		c.ride();
		c.ride();
		
	}
}
