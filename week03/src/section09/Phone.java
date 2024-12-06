package section09;

public class Phone {
	// 객체를 구성할 인스턴스 변수 선언
	String brand;
	int series;
	String color = "검정색";
	// 객체를 초기화할 매개변수가 있는 생성자 선언
	Phone(String b, int s, String c){
		brand = b;
		series = s;
		color = c;
	}
	// 인스턴스 메서드 선언
	void phoneInfo() {
		System.out.println(color + " " + brand + " " + series);
	}
}
