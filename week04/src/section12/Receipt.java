package section12;

public abstract class Receipt {
	// 필드
	String chef;

	// 생성자
	public Receipt(String chef) {
		this.chef = chef;
	}
	
	// 메서드
	void info()	{
		System.out.println("이 레피시는 " + chef + " 셰프님의 레시피입니다.");
	}
	
}
