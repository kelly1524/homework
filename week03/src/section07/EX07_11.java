package section07;

public class EX07_11 {
	public static void main(String[] args) {
		Family father = new Family(); // 같은 패키지 내에 있는 Family 클래스를 디스크로부터 RAM으로 로드하고
		// 정적 변수를 method 영역에 할당한 뒤, 인스턴스 변수, 메서드 heap 메모리에 생성
		Family daughter = new Family(); // daughter 객체가 새롭게 하나 더 생김. 다른 참조값을 가진다
		
		daughter.address = "동탄"; // daughter의 address 필드는 동탄 값으로 저장됨
		System.out.println(father.address); // class를 초기화했던 그대로 "서울" 출력
	}
}
