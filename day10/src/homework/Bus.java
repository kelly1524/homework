package homework;
// +) EX08_19
public class Bus {
	public static void main(String[] args) {
		// 교통카드 금액 변수 설정, main stack frame 에 저장됨
		int money = 10000;
		// bus 클래스 로드 -> 힙 메모리에 bus가 로드됨. 그 안의 method도 주소값을 갖게 됨
		Bus bus = new Bus();
		bus.take(money); // money 대입, 값만 복사해서 전달한다. money 안의 값이 변하는 건 아님
//		System.out.println(money); 실제 money 값은 바뀌지 않는다
	}
	// 복사받은 m 값으로 자신의 stack frame 내에서 작업을 진행한다
	void take(int m) {
		while (true) {
			if (m < 3000) {
				System.out.println("교통카드를 충전하러 갑니다.");
				return;
			}
			System.out.println("버스를 탑니다.");
			m -= 1250;
		}
	}
}
