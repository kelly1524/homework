package homework;

public class EX08_01 {
	public static void main(String[] args) {
		printHello(); // 매개변수 없고 static 이니까 메서드명으로만 호출 가능
	}

	static void printHello() { // static 이며 리턴값이 없고,
		// 매개변수가 없는 메서드명 printHello
		System.out.println("안녕하세요"); // printHello 호출하면 둘 다 출력
		System.out.println("만나서 반갑습니다.");
	}

}
