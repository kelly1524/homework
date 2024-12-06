package section09;

public class Snack2 {
	int price; // 멤버 변수
	
	Snack2(int p){ // Snack2의 생성자. 매개변수 p로 price를 초기화하는 생성자.
		price = p;
	}
	
	void info() {
		System.out.println("과자의 가격은 " + price + "원입니다."); 
	}
}
