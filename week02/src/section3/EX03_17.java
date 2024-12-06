package section3;

public class EX03_17 {
	public static void main(String[] args) {
		int num = 0;
		
		if(7 > 1) {
			num = 1;
		}else { // dead code 뜨는 이유. 어차피 이거 실행 안 될 건데 왜 썼어?
			num = 2;
		}
		System.out.println(num); // 7 > 1이 true 니까 num = 1 1 출력됨
	}
}
