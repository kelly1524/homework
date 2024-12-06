package section3;

public class EX03_11 {
	public static void main(String[] args) {
		int result = 100000 * 1000000;
		System.out.println(result); // 범위를 넘어섬. 오버플로우 발생 -> 쓰레기값 나옴
	}
}
