package section09;

public class EX09_10 {
	public static void main(String[] args) {
		Phone2 p1 = new Phone2("갤럭시", 1, "흰색"); // 인수를 받은 매개변수로 객체 초기화
		Phone2 p2 = new Phone2("아이폰", 2); // 매개변수 2개로 객체를 초기화하는 생성자를 만들어줬기 때문에 이제 컴파일 오류가 나지 않는다
		
		p1.phoneInfo();
		p2.phoneInfo();
	}
}
