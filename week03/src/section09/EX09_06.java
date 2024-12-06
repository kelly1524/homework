package section09;

public class EX09_06 {
	public static void main(String[] args) {
		Person p1 = new Person("김자바", 20); // 필드가 김자바, 20으로 초기화된 객체 생성
		Person p2 = new Person("이코딩" , 40); // 필드가 이코딩, 40으로 초기화된 객체 생성
		
		p1.introduce(); // 각 참조값을 통해 각각의 메서드 호출.
		p2.introduce();
	}
}
