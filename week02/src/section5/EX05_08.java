package section5;

import java.util.Scanner;

public class EX05_08 {
	public static void main(String[] args) {
		int magicNumber = (int) (Math.random() * 50) + 1;
		// Match 클래스에 있는 random 메서드를 호출한다. 0부터 1.0까지의 숫자를 랜덤하게 반환해주는데
		// 최대값이 50, 최소값이 1인 수를 랜덤하게 뽑아 magicNumber 에 넣어줄 거다
		Scanner sc = new Scanner(System.in); // 입력 받을 스캐너 생성하고
		boolean isMatched = false; // 맞았는지 판단해줄 boolean 타입의 변수를 생성하고 false 로 초기화
		
		for(int i = 0; i < 10; i++) { // 10번 반복
			
			System.out.println("찾는 숫자를 입력 >> ");
			int guess = sc.nextInt(); // 여기에 입력 받은 값 저장하고
			
			if(guess == magicNumber) { // 그 수가 같다면 정답이니까
				System.out.println((i+1) + "번째에 맞혔습니다."); // i+1 (왜냐하면 0부터 시작하니까)
				isMatched = true; // true 로 바꾸어 주고
				break; // 바로 종료
			} else if(guess > magicNumber) { // 만약 틀렸다면. 그런데 입력한 값이 더 크다면
				System.out.println("맞혀야 할 숫자가 더 작습니다.");
			}else if (guess < magicNumber) { // 만약 틀렸고 입력한 값이 더 작다면
				System.out.println("맞혀야 할 숫자가 더 큽니다.");
			}
		}
		
		if(!isMatched) { // isMatched 가 false 로 남아있는 애들이 논리 부정되면 true 니까
			// 틀린 애들은 그대로 초기값이라 false 로 true 가 되어 {} 내 실행문 실행하게 됨
			System.out.println("정답을 맞히지 못했습니다.");
		}
	}
}
