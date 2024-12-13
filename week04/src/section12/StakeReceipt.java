package section12;

public class StakeReceipt extends Receipt{
	// 생성자 (자식 객체가 생성될 때 부모의 생성자 호출하기 때문에
	// 부모가 기본 생성자를 생성하지 않았을 경우, 매개변수 생성자에 맞추어
	// 초기화해주어야 한다
	public StakeReceipt(String chef) {
		super(chef);
	}
	
	// 멤버 메서드
	void grillStake() {
		System.out.println("스테이크를 맛있게 굽습니다.");
	}
	
}
