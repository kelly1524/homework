package section12;

public class EX12_04 {
	public static void main(String[] args) {
		PastaReceipt pr = new PastaReceipt("최연석");
		pr.info(); // 자식 객체가 오버라이딩 하지 않았기 때문에 부모의 info 호출
		pr.makeSource(); // 자식 객체의 멤버 메서드 호출
		
		System.out.println();
		
		StakeReceipt sr = new StakeReceipt("이현복");
		sr.info(); // 자식 객체가 오버라이딩 하지 않았기 때문에 부모의 info 호출
		sr.grillStake(); // 자식 객체의 멤버 메서드 호출
	}
}
