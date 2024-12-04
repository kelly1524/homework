package homework;
// + EX08_07

public class Book {
	
	public static void main(String[] args) {
		Book myBook = new Book(); // Book의 count에 접근하기 위한 참조값을 myBook에 받는다
		myBook.count(3); // myBook의 참조값을 통해 count 에 접근하고
		// 인수로 3을 전달한다.
		// count 가 전달받은 3을 매개변수에 대입하고 값으로서 사용되어 출력된다
	}
	void count(int bookNum) {
		// 리턴 값 X
		// 책의 권 수를 입력 받아 형식에 맞게 출력해 주는 기능을 한다
		System.out.println("책은 " + bookNum + "권 입니다.");
	}
}
