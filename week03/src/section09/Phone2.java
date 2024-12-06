package section09;

public class Phone2 {
	// 객체를 구성할 인스턴스 변수 선언
	String brand;
	int series;
	String color = "검정색";
	// 매개변수가 2개인 생성자 선언. 생성자 오버로딩
	Phone2(String b, int s){
		brand = b;
		series = s;
	}
	// 객체를 초기화할 매개변수가 있는 생성자 선언
	Phone2(String b, int s, String c){
		brand = b;
		series = s;
		color = c;
	}
	// 인스턴스 메서드 선언
	void phoneInfo() {
		System.out.println(color + " " + brand + " " + series);
	}
}
