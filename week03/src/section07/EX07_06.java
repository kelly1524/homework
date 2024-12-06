package section07;

public class EX07_06 {
	public static void main(String[] args) {
		Car c = new Car(); // 같은 패키지 내의 Car 클래스를 로드하여 Ram에 올린다
		System.out.println("wheel의 개수는 " + c.wheel + "개입니다."); // 참조값으로 car 객체의 wheel에 접근. 4로 출력됨
		
		c.wheel = 5; // 객체의 인스턴스 변수 wheel 의 값을 5로 변경
		System.out.println("wheel의 개수는 " + c.wheel + "개입니다."); // 5로 출력됨
	}
}
