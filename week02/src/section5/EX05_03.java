package section5;

public class EX05_03 {
	public static void main(String[] args) {
		for(int i = 2; i <= 9; i++) { // 2가 고정될 동안
			for(int j = 2; j <= 9; j++) { // j는 2부터 9까지 변함
				System.out.print(i + "X" + j + "=" + (i * j) + "\t");
			} // 그걸 해당 줄의 j를 다 반복한 다음에
			System.out.println(); // 줄바꿈한다
		}
	}
}
