package section5;

public class EX05_04 {
	public static void main(String[] args) {
		for(int i = 0; i < 7; i++) { // 줄 수. 안에 있는 반복문이 다 실행될 떄까지 고정
			for(int j = 0; j < 7 - i; j++) { // 첫번째 줄로 가정했을 때 먼저 실행될 것. 7-i로 줄이 바뀔 때마다 반복횟수 감소
				System.out.print(" "); // 공백 다 출력 후 
			}
			for(int k = 0; k < 2*i + 1; k++) { // 별 출력할 것. 처음에 하나 찍어줘야 하니 +1인데 홀수씩 반복해야 하니까 2*1 +1
				System.out.print("*"); // 점점 증가하며 별찍음
			}
			System.out.println(); // 한 줄 다 찍고 줄바꿈
		}
	}
}
