package section09;

public class Book {
	// 필드 선언
	String title = "제목없음";
	int series = 1;
	int page = 100;
	// 기본 생성자
	public Book() {
	}
	// 매개변수가 각각 타입, 순서, 개수가 다르게 같은 이름으로 여러개의 생성자가 선언되었다. => 메서드 오버로딩
	public Book(String title) {
		this.title = title;
	}
	public Book(String title, int page) {
		this.title = title;
		this.page = page;
	}
	public Book(int series, String title) {
		this.series = series;
		this.title = title;
	}
	
	
}
