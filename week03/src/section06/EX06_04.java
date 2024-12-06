package homework;

public class EX06_04 {
	public static void main(String[] args) {
		// 10칸짜리 배열 선언 (heap) 참조값 (Stack)
		int[] numbers = new int[10];

		// 랜덤한 수를 뽑아 배열에 저장
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = (int)(Math.random() * 30) + 1;
		}
		// 짝수일 경우 sum 에 누적
		int sum = 0;
		for(int i = 0; i < numbers.length; i ++	) {
			if(numbers[i] % 2 == 0) {
				sum += numbers[i];
			}
		}
		// 저장된 랜덤한 수를 출력
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println();
		System.out.println("배열의 짝수들의 합 : " + sum);
	}
}
